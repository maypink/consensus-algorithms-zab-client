package org.zab.callback;

import com.google.protobuf.Empty;
import com.google.protobuf.RpcCallback;

public class EmptyCallback implements RpcCallback<Empty> {
    @Override
    public void run(Empty result) {
        if (result == null) {
            System.out.println("RPC operation was canceled or failed.");
        } else {
            System.out.println("RPC completed successfully with no additional data.");
        }
    }
}