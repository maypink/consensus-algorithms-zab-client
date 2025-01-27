package org.zab;

import javax.annotation.PostConstruct;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zab.callback.CustomCallback;
import org.zab.callback.EmptyCallback;
import org.zab.controllers.CustomRpcController;
import org.zab.entities.Network;
import org.zab.services.NetworkService;
import org.zab.services.ZabClientService;
import org.zab.streams.CustomStreamObserver;
import zab.BankTransaction;
import zab_client.WriteTransactionRequest;
import zab_peer.BalanceRequest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class Main {
    @Autowired
    private NetworkService networkService;

    @Autowired
    private ZabClientService zabClientService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); // Start the Spring Boot application
    }

    @PostConstruct
    public void init() throws IOException, InterruptedException {
        // Initialize peers and connect to each
        zabClientService.initializePeers();

        // Start gRPC server
        Server server = ServerBuilder.forPort(6501)  // Specify the gRPC port
                .addService(new ZabClientService())  // Add gRPC service implementations
                .build();

        server.start();
        System.out.println("gRPC server started on port 6501");

        // Write some bank transactions using client
        int transactionsNum = 5;
        int currentTransaction = 0;
        Map<Integer, Integer> expectedBalalnces = new HashMap<>();
        while (currentTransaction < transactionsNum) {
            Integer accountId = ThreadLocalRandom.current().nextInt(0, 10000 + 1);;
            Integer amount = ThreadLocalRandom.current().nextInt(0, 1000 + 1);;
            WriteTransactionRequest writeTransactionRequest = WriteTransactionRequest.newBuilder()
                    .setTransaction(BankTransaction.newBuilder()
                            .setAccountId(accountId).setAmount(amount))
                    .build();
            zabClientService.writeTransaction(writeTransactionRequest, new CustomStreamObserver());

            // Update expected balances with new amount
            if (expectedBalalnces.containsKey(accountId)){
                expectedBalalnces.put(accountId, expectedBalalnces.get(accountId) + amount);
            } else {
                expectedBalalnces.put(accountId, amount);
            }

            currentTransaction += 1;
        }

        CustomCallback customCallback = new CustomCallback();
        // Check if actual balances are equal to expected ones
        for (Integer accountId: expectedBalalnces.keySet()){
            zabClientService.readAccount(BalanceRequest.newBuilder().setId(accountId).build(), new CustomStreamObserver());
//            for (Integer peerId: accountBalances.keySet()){
//                if (accountBalances.get(peerId).intValue() == expectedBalalnces.get(accountId)){
//                    System.out.println("Node: " + peerId + ". Balances for accountId " + accountId + " are equal and =" + expectedBalalnces.get(accountId));
//                } else {
//                    System.out.println("Node: " + peerId + ". Balances for accountId " + accountId + " are NOT equal! Expected balance =" + expectedBalalnces.get(accountId) + "and the actual one =" + accountBalances.get(peerId).intValue());
//                }
//            }
        }

        server.awaitTermination();
    }
}