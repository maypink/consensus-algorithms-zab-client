package org.zab.controllers;

import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;

import java.util.concurrent.atomic.AtomicBoolean;

public class CustomRpcController implements RpcController {
    private boolean isFailed = false;
    private String errorMessage = null;

    private final AtomicBoolean canceled = new AtomicBoolean(false);
    private Runnable cancelCallback;

    @Override
    public void setFailed(String error) {
        isFailed = true;
        errorMessage = error;
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean failed() {
        return isFailed;
    }

    @Override
    public String errorText() {
        return errorMessage;
    }

    @Override
    public boolean isCanceled() {
        return false; // Example: Implement based on your framework.
    }

    @Override
    public void notifyOnCancel(RpcCallback<Object> callback) {

    }

    @Override
    public void startCancel() {
        // Example: Implement cancellation logic.
    }
}