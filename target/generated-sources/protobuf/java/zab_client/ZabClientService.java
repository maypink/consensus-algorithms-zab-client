// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_client.proto

package zab_client;

/**
 * Protobuf service {@code zab_client.ZabClientService}
 */
public  abstract class ZabClientService
    implements com.google.protobuf.Service {
  protected ZabClientService() {}

  public interface Interface {
    /**
     * <code>rpc WriteTransaction(.zab_client.WriteTransactionRequest) returns (.google.protobuf.Empty);</code>
     */
    public abstract void writeTransaction(
        com.google.protobuf.RpcController controller,
        zab_client.WriteTransactionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc ReadAccount(.zab_client.ReadAccountRequest) returns (.zab_client.ReadAccountResponse);</code>
     */
    public abstract void readAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request,
        com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done);

    /**
     * <code>rpc DebugReadAccount(.zab_client.ReadAccountRequest) returns (.zab_client.ReadAccountResponse);</code>
     */
    public abstract void debugReadAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request,
        com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done);

    /**
     * <code>rpc DebugHasOutstandingTransactions(.google.protobuf.Empty) returns (.zab_client.DebugHasOutstandingTransactionsResponse);</code>
     */
    public abstract void debugHasOutstandingTransactions(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<zab_client.DebugHasOutstandingTransactionsResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new ZabClientService() {
      @java.lang.Override
      public  void writeTransaction(
          com.google.protobuf.RpcController controller,
          zab_client.WriteTransactionRequest request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.writeTransaction(controller, request, done);
      }

      @java.lang.Override
      public  void readAccount(
          com.google.protobuf.RpcController controller,
          zab_client.ReadAccountRequest request,
          com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done) {
        impl.readAccount(controller, request, done);
      }

      @java.lang.Override
      public  void debugReadAccount(
          com.google.protobuf.RpcController controller,
          zab_client.ReadAccountRequest request,
          com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done) {
        impl.debugReadAccount(controller, request, done);
      }

      @java.lang.Override
      public  void debugHasOutstandingTransactions(
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Empty request,
          com.google.protobuf.RpcCallback<zab_client.DebugHasOutstandingTransactionsResponse> done) {
        impl.debugHasOutstandingTransactions(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.writeTransaction(controller, (zab_client.WriteTransactionRequest)request);
          case 1:
            return impl.readAccount(controller, (zab_client.ReadAccountRequest)request);
          case 2:
            return impl.debugReadAccount(controller, (zab_client.ReadAccountRequest)request);
          case 3:
            return impl.debugHasOutstandingTransactions(controller, (com.google.protobuf.Empty)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return zab_client.WriteTransactionRequest.getDefaultInstance();
          case 1:
            return zab_client.ReadAccountRequest.getDefaultInstance();
          case 2:
            return zab_client.ReadAccountRequest.getDefaultInstance();
          case 3:
            return com.google.protobuf.Empty.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 1:
            return zab_client.ReadAccountResponse.getDefaultInstance();
          case 2:
            return zab_client.ReadAccountResponse.getDefaultInstance();
          case 3:
            return zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc WriteTransaction(.zab_client.WriteTransactionRequest) returns (.google.protobuf.Empty);</code>
   */
  public abstract void writeTransaction(
      com.google.protobuf.RpcController controller,
      zab_client.WriteTransactionRequest request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc ReadAccount(.zab_client.ReadAccountRequest) returns (.zab_client.ReadAccountResponse);</code>
   */
  public abstract void readAccount(
      com.google.protobuf.RpcController controller,
      zab_client.ReadAccountRequest request,
      com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done);

  /**
   * <code>rpc DebugReadAccount(.zab_client.ReadAccountRequest) returns (.zab_client.ReadAccountResponse);</code>
   */
  public abstract void debugReadAccount(
      com.google.protobuf.RpcController controller,
      zab_client.ReadAccountRequest request,
      com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done);

  /**
   * <code>rpc DebugHasOutstandingTransactions(.google.protobuf.Empty) returns (.zab_client.DebugHasOutstandingTransactionsResponse);</code>
   */
  public abstract void debugHasOutstandingTransactions(
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Empty request,
      com.google.protobuf.RpcCallback<zab_client.DebugHasOutstandingTransactionsResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return zab_client.ZabClient.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.writeTransaction(controller, (zab_client.WriteTransactionRequest)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 1:
        this.readAccount(controller, (zab_client.ReadAccountRequest)request,
          com.google.protobuf.RpcUtil.<zab_client.ReadAccountResponse>specializeCallback(
            done));
        return;
      case 2:
        this.debugReadAccount(controller, (zab_client.ReadAccountRequest)request,
          com.google.protobuf.RpcUtil.<zab_client.ReadAccountResponse>specializeCallback(
            done));
        return;
      case 3:
        this.debugHasOutstandingTransactions(controller, (com.google.protobuf.Empty)request,
          com.google.protobuf.RpcUtil.<zab_client.DebugHasOutstandingTransactionsResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return zab_client.WriteTransactionRequest.getDefaultInstance();
      case 1:
        return zab_client.ReadAccountRequest.getDefaultInstance();
      case 2:
        return zab_client.ReadAccountRequest.getDefaultInstance();
      case 3:
        return com.google.protobuf.Empty.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 1:
        return zab_client.ReadAccountResponse.getDefaultInstance();
      case 2:
        return zab_client.ReadAccountResponse.getDefaultInstance();
      case 3:
        return zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends zab_client.ZabClientService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void writeTransaction(
        com.google.protobuf.RpcController controller,
        zab_client.WriteTransactionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void readAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request,
        com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        zab_client.ReadAccountResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          zab_client.ReadAccountResponse.class,
          zab_client.ReadAccountResponse.getDefaultInstance()));
    }

    public  void debugReadAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request,
        com.google.protobuf.RpcCallback<zab_client.ReadAccountResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        zab_client.ReadAccountResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          zab_client.ReadAccountResponse.class,
          zab_client.ReadAccountResponse.getDefaultInstance()));
    }

    public  void debugHasOutstandingTransactions(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<zab_client.DebugHasOutstandingTransactionsResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          zab_client.DebugHasOutstandingTransactionsResponse.class,
          zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.google.protobuf.Empty writeTransaction(
        com.google.protobuf.RpcController controller,
        zab_client.WriteTransactionRequest request)
        throws com.google.protobuf.ServiceException;

    public zab_client.ReadAccountResponse readAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request)
        throws com.google.protobuf.ServiceException;

    public zab_client.ReadAccountResponse debugReadAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request)
        throws com.google.protobuf.ServiceException;

    public zab_client.DebugHasOutstandingTransactionsResponse debugHasOutstandingTransactions(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.google.protobuf.Empty writeTransaction(
        com.google.protobuf.RpcController controller,
        zab_client.WriteTransactionRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public zab_client.ReadAccountResponse readAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request)
        throws com.google.protobuf.ServiceException {
      return (zab_client.ReadAccountResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        zab_client.ReadAccountResponse.getDefaultInstance());
    }


    public zab_client.ReadAccountResponse debugReadAccount(
        com.google.protobuf.RpcController controller,
        zab_client.ReadAccountRequest request)
        throws com.google.protobuf.ServiceException {
      return (zab_client.ReadAccountResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        zab_client.ReadAccountResponse.getDefaultInstance());
    }


    public zab_client.DebugHasOutstandingTransactionsResponse debugHasOutstandingTransactions(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException {
      return (zab_client.DebugHasOutstandingTransactionsResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:zab_client.ZabClientService)
}

