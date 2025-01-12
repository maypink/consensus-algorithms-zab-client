package org.zab.services;

import com.google.protobuf.Empty;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import zab.State;
import zab_client.*;
import zab_peer.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GrpcService
public class ZabClientService {
    @Autowired
    private List<String> peersPortsList;

    private Map<String, ZabPeerServiceGrpc.ZabPeerServiceBlockingStub> peerStubs = new HashMap<>();

    public void initializePeers(List<String> peersPortsList) {
        this.peersPortsList = peersPortsList;

        // Create stubs for each peer
        for (String peerPort : peersPortsList) {

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", Integer.parseInt(peerPort))
                    .usePlaintext()
                    .build();
            ZabPeerServiceGrpc.ZabPeerServiceBlockingStub stub = ZabPeerServiceGrpc.newBlockingStub(channel);
            peerStubs.put(peerPort, stub);
        }
    }

    public void writeTransaction(RpcController controller, WriteTransactionRequest request, RpcCallback<Empty> done) {
        for (String peerPort: this.peersPortsList){
            try {
                ZabPeerServiceGrpc.ZabPeerServiceBlockingStub stub = peerStubs.get(peerPort);
                GetStateResponse stateResponse = stub.getState(Empty.newBuilder().build());
                if (stateResponse.getState() == State.Leading){
                    ProposeTransactionRequest proposeTransactionRequest = ProposeTransactionRequest.newBuilder()
                            .setTransaction(request.getTransaction())
                            .build();
                    done.run(stub.proposeTransaction(proposeTransactionRequest));
                }
            } catch (Exception e) {
                System.err.println("Failed to write transaction to peer " + peerPort + ": " + e.getMessage());
            }
        }
    }


    public Map<Integer, Integer> readAccount(RpcController controller, BalanceRequest request, RpcCallback<BalanceResponse> done) {
        Map<Integer, Integer> accountBalancesMap = new HashMap<>();
        for (String peerPort: this.peersPortsList){
            try {
                ZabPeerServiceGrpc.ZabPeerServiceBlockingStub stub = peerStubs.get(peerPort);
                BalanceResponse balanceResponse = stub.readBalances(request);
                accountBalancesMap.put(Integer.parseInt(peerPort), balanceResponse.getAmount());
            } catch (Exception e) {
                System.err.println("Failed to read transaction from peer " + peerPort + ": " + e.getMessage());
            }
        }
        return accountBalancesMap;
    }

    public void debugReadAccount(RpcController controller, ReadAccountRequest request, RpcCallback<ReadAccountResponse> done) {

    }

    public void debugHasOutstandingTransactions(RpcController controller, Empty request, RpcCallback<DebugHasOutstandingTransactionsResponse> done) {

    }
}
