package org.zab;

import javax.annotation.PostConstruct;

import com.google.protobuf.Empty;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;
import org.zab.entities.Network;
import org.zab.entities.Node;
import org.zab.services.NetworkService;
import org.zab.services.ZabClientService;
import zab.BankTransaction;
import zab_client.ReadAccountRequest;
import zab_client.ReadAccountResponse;
import zab_client.WriteTransactionRequest;
import zab_peer.BalanceRequest;
import zab_peer.BalanceResponse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class Main {
    @Autowired
    private NetworkService networkService;

    @Autowired
    private ZabClientService zabClientService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); // Start the Spring Boot application
    }

    @PostConstruct
    public void init() throws FileNotFoundException {
        Network network = networkService.parse_configuration("docker-compose.yml");

        // Initialize peers and connect to each
        zabClientService.initializePeers(network.getAddresses());

        // Write some bank transactions using client
        int transactionsNum = 10;
        int currentTransaction = 0;
        Map<Integer, Integer> expectedBalalnces = new HashMap<>();
        while (currentTransaction < transactionsNum) {
            Integer accountId = ThreadLocalRandom.current().nextInt(0, 10000 + 1);;
            Integer amount = ThreadLocalRandom.current().nextInt(0, 1000 + 1);;
            WriteTransactionRequest writeTransactionRequest = WriteTransactionRequest.newBuilder()
                    .setTransaction(BankTransaction.newBuilder()
                            .setAccountId(accountId).setAmount(amount))
                    .build();
            zabClientService.writeTransaction((RpcController) new Object(), writeTransactionRequest, (RpcCallback<Empty>) new Object());

            // Update expected balances with new amount
            if (expectedBalalnces.containsKey(accountId)){
                expectedBalalnces.put(accountId, expectedBalalnces.get(accountId) + amount);
            } else {
                expectedBalalnces.put(accountId, amount);
            }

            currentTransaction += 1;
        }

        // Check if actual balances are equal to expected ones
        for (Integer accountId: expectedBalalnces.keySet()){
            Map<Integer, Integer> accountBalances = zabClientService.readAccount((RpcController) new Object(), BalanceRequest.newBuilder().setId(accountId).build(), (RpcCallback<BalanceResponse>) new Object());
            for (Integer peerId: accountBalances.keySet()){
                if (accountBalances.get(peerId).intValue() == expectedBalalnces.get(accountId)){
                    System.out.println("Node: " + peerId + ". Balances for accountId " + accountId + " are equal and =" + expectedBalalnces.get(accountId));
                } else {
                    System.out.println("Node: " + peerId + ". Balances for accountId " + accountId + " are NOT equal! Expected balance =" + expectedBalalnces.get(accountId) + "and the actual one =" + accountBalances.get(peerId).intValue());
                }
            }
        }
    }
}