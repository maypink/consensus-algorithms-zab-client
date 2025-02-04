package org.zab.services;

import com.google.protobuf.Empty;
import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Value;
import zab.State;
import zab_client.*;
import zab_peer.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GrpcService
public class ZabClientService extends ZabClientServiceGrpc.ZabClientServiceImplBase {

    @Value("${peers.ports.list}")
    private List<String> peersPortsList;

    private Map<String, ZabPeerServiceGrpc.ZabPeerServiceFutureStub> peerStubs = new HashMap<>();

    public void initializePeers() {
//        this.peersPortsList = peersPortsList;

        // Create stubs for each peer
        for (String peerPort : this.peersPortsList) {

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", Integer.parseInt(peerPort))
                    .usePlaintext()
                    .build();
            ZabPeerServiceGrpc.ZabPeerServiceFutureStub stub = ZabPeerServiceGrpc.newFutureStub(channel);
            peerStubs.put(peerPort, stub);
        }
    }

    @Override
    public void writeTransaction(WriteTransactionRequest request, StreamObserver<Empty> responseObserver) {
        for (String peerPort: this.peersPortsList){
            try {
                ZabPeerServiceGrpc.ZabPeerServiceFutureStub stub = peerStubs.get(peerPort);
                GetStateResponse stateResponse = stub.getState(Empty.newBuilder().build()).get();
                if (stateResponse.getState() == State.Leading){
                    ProposeTransactionRequest proposeTransactionRequest = ProposeTransactionRequest.newBuilder()
                            .setTransaction(request.getTransaction())
                            .build();
                    responseObserver.onNext(stub.proposeTransaction(proposeTransactionRequest).get());
                    break;
                }
            } catch (Exception e) {
                System.err.println("Failed to write transaction to peer " + peerPort + ": " + e.getMessage());
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public void readAccount(BalanceRequest request, StreamObserver<ReadAccountResponse> done) {
        Map<Integer, Integer> accountBalancesMap = new HashMap<>();
        for (String peerPort: this.peersPortsList){
            try {
                ZabPeerServiceGrpc.ZabPeerServiceFutureStub stub = peerStubs.get(peerPort);
                BalanceResponse balanceResponse = stub.readBalances(request).get();
                accountBalancesMap.put(Integer.parseInt(peerPort), balanceResponse.getAmount());
            } catch (Exception e) {
                System.err.println("Failed to read transaction from peer " + peerPort + ": " + e.getMessage());
            }
        }
        System.out.println(accountBalancesMap);
    }

    public void debugReadAccount(BalanceRequest request, StreamObserver<ReadAccountResponse> done) {
        Map<Integer, Integer> accountBalancesMap = new HashMap<>();
        for (String peerPort: this.peersPortsList){
            try {
                ZabPeerServiceGrpc.ZabPeerServiceFutureStub stub = peerStubs.get(peerPort);
                BalanceResponse balanceResponse = stub.readBalances(request).get();
                accountBalancesMap.put(Integer.parseInt(peerPort), balanceResponse.getAmount());
            } catch (Exception e) {
                System.err.println("Failed to read transaction from peer " + peerPort + ": " + e.getMessage());
            }
        }
        System.out.println(accountBalancesMap);
    }

    public void debugHasOutstandingTransactions(BalanceRequest request, StreamObserver<DebugHasOutstandingTransactionsResponse> done) {

    }
}
