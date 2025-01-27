package org.zab.callback;

import com.google.protobuf.RpcCallback;
import zab_peer.BalanceRequest;
import zab_peer.BalanceResponse;

public class CustomCallback implements RpcCallback<BalanceResponse> {
    @Override
    public void run(BalanceResponse parameter) {

    }
}