// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_peer.proto

package zab_peer;

/**
 * Protobuf service {@code zab_peer.ZabPeerService}
 */
public  abstract class ZabPeerService
    implements com.google.protobuf.Service {
  protected ZabPeerService() {}

  public interface Interface {
    /**
     * <code>rpc SendElectionNotification(.zab_peer.ElectionRequest) returns (.google.protobuf.Empty);</code>
     */
    public abstract void sendElectionNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.ElectionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc GetState(.google.protobuf.Empty) returns (.zab_peer.GetStateResponse);</code>
     */
    public abstract void getState(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<zab_peer.GetStateResponse> done);

    /**
     * <code>rpc SendFollowerInfo(.zab_peer.FollowerInfoRequest) returns (.zab_peer.FollowerInfoResponse);</code>
     */
    public abstract void sendFollowerInfo(
        com.google.protobuf.RpcController controller,
        zab_peer.FollowerInfoRequest request,
        com.google.protobuf.RpcCallback<zab_peer.FollowerInfoResponse> done);

    /**
     * <code>rpc SendAckNewLeader(.google.protobuf.Empty) returns (.google.protobuf.Empty);</code>
     */
    public abstract void sendAckNewLeader(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc SendNewLeaderNotification(.zab_peer.NewLeaderRequest) returns (.google.protobuf.Empty);</code>
     */
    public abstract void sendNewLeaderNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.NewLeaderRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc ProposeTransaction(.zab_peer.ProposeTransactionRequest) returns (.google.protobuf.Empty);</code>
     */
    public abstract void proposeTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.ProposeTransactionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc CommitTransaction(.zab_peer.CommitTransactionRequest) returns (.google.protobuf.Empty);</code>
     */
    public abstract void commitTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.CommitTransactionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc ReadBalances(.zab_peer.BalanceRequest) returns (.zab_peer.BalanceResponse);</code>
     */
    public abstract void readBalances(
        com.google.protobuf.RpcController controller,
        zab_peer.BalanceRequest request,
        com.google.protobuf.RpcCallback<zab_peer.BalanceResponse> done);

    /**
     * <code>rpc UpdateHistoryOldThreshold(.zab_peer.UpdateHistoryOldThresholdRequest) returns (.google.protobuf.Empty);</code>
     */
    public abstract void updateHistoryOldThreshold(
        com.google.protobuf.RpcController controller,
        zab_peer.UpdateHistoryOldThresholdRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

    /**
     * <code>rpc SendHeartbeat(.google.protobuf.Empty) returns (.google.protobuf.Empty);</code>
     */
    public abstract void sendHeartbeat(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new ZabPeerService() {
      @java.lang.Override
      public  void sendElectionNotification(
          com.google.protobuf.RpcController controller,
          zab_peer.ElectionRequest request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.sendElectionNotification(controller, request, done);
      }

      @java.lang.Override
      public  void getState(
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Empty request,
          com.google.protobuf.RpcCallback<zab_peer.GetStateResponse> done) {
        impl.getState(controller, request, done);
      }

      @java.lang.Override
      public  void sendFollowerInfo(
          com.google.protobuf.RpcController controller,
          zab_peer.FollowerInfoRequest request,
          com.google.protobuf.RpcCallback<zab_peer.FollowerInfoResponse> done) {
        impl.sendFollowerInfo(controller, request, done);
      }

      @java.lang.Override
      public  void sendAckNewLeader(
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Empty request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.sendAckNewLeader(controller, request, done);
      }

      @java.lang.Override
      public  void sendNewLeaderNotification(
          com.google.protobuf.RpcController controller,
          zab_peer.NewLeaderRequest request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.sendNewLeaderNotification(controller, request, done);
      }

      @java.lang.Override
      public  void proposeTransaction(
          com.google.protobuf.RpcController controller,
          zab_peer.ProposeTransactionRequest request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.proposeTransaction(controller, request, done);
      }

      @java.lang.Override
      public  void commitTransaction(
          com.google.protobuf.RpcController controller,
          zab_peer.CommitTransactionRequest request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.commitTransaction(controller, request, done);
      }

      @java.lang.Override
      public  void readBalances(
          com.google.protobuf.RpcController controller,
          zab_peer.BalanceRequest request,
          com.google.protobuf.RpcCallback<zab_peer.BalanceResponse> done) {
        impl.readBalances(controller, request, done);
      }

      @java.lang.Override
      public  void updateHistoryOldThreshold(
          com.google.protobuf.RpcController controller,
          zab_peer.UpdateHistoryOldThresholdRequest request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.updateHistoryOldThreshold(controller, request, done);
      }

      @java.lang.Override
      public  void sendHeartbeat(
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Empty request,
          com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
        impl.sendHeartbeat(controller, request, done);
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
            return impl.sendElectionNotification(controller, (zab_peer.ElectionRequest)request);
          case 1:
            return impl.getState(controller, (com.google.protobuf.Empty)request);
          case 2:
            return impl.sendFollowerInfo(controller, (zab_peer.FollowerInfoRequest)request);
          case 3:
            return impl.sendAckNewLeader(controller, (com.google.protobuf.Empty)request);
          case 4:
            return impl.sendNewLeaderNotification(controller, (zab_peer.NewLeaderRequest)request);
          case 5:
            return impl.proposeTransaction(controller, (zab_peer.ProposeTransactionRequest)request);
          case 6:
            return impl.commitTransaction(controller, (zab_peer.CommitTransactionRequest)request);
          case 7:
            return impl.readBalances(controller, (zab_peer.BalanceRequest)request);
          case 8:
            return impl.updateHistoryOldThreshold(controller, (zab_peer.UpdateHistoryOldThresholdRequest)request);
          case 9:
            return impl.sendHeartbeat(controller, (com.google.protobuf.Empty)request);
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
            return zab_peer.ElectionRequest.getDefaultInstance();
          case 1:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 2:
            return zab_peer.FollowerInfoRequest.getDefaultInstance();
          case 3:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 4:
            return zab_peer.NewLeaderRequest.getDefaultInstance();
          case 5:
            return zab_peer.ProposeTransactionRequest.getDefaultInstance();
          case 6:
            return zab_peer.CommitTransactionRequest.getDefaultInstance();
          case 7:
            return zab_peer.BalanceRequest.getDefaultInstance();
          case 8:
            return zab_peer.UpdateHistoryOldThresholdRequest.getDefaultInstance();
          case 9:
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
            return zab_peer.GetStateResponse.getDefaultInstance();
          case 2:
            return zab_peer.FollowerInfoResponse.getDefaultInstance();
          case 3:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 4:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 5:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 6:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 7:
            return zab_peer.BalanceResponse.getDefaultInstance();
          case 8:
            return com.google.protobuf.Empty.getDefaultInstance();
          case 9:
            return com.google.protobuf.Empty.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc SendElectionNotification(.zab_peer.ElectionRequest) returns (.google.protobuf.Empty);</code>
   */
  public abstract void sendElectionNotification(
      com.google.protobuf.RpcController controller,
      zab_peer.ElectionRequest request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc GetState(.google.protobuf.Empty) returns (.zab_peer.GetStateResponse);</code>
   */
  public abstract void getState(
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Empty request,
      com.google.protobuf.RpcCallback<zab_peer.GetStateResponse> done);

  /**
   * <code>rpc SendFollowerInfo(.zab_peer.FollowerInfoRequest) returns (.zab_peer.FollowerInfoResponse);</code>
   */
  public abstract void sendFollowerInfo(
      com.google.protobuf.RpcController controller,
      zab_peer.FollowerInfoRequest request,
      com.google.protobuf.RpcCallback<zab_peer.FollowerInfoResponse> done);

  /**
   * <code>rpc SendAckNewLeader(.google.protobuf.Empty) returns (.google.protobuf.Empty);</code>
   */
  public abstract void sendAckNewLeader(
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Empty request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc SendNewLeaderNotification(.zab_peer.NewLeaderRequest) returns (.google.protobuf.Empty);</code>
   */
  public abstract void sendNewLeaderNotification(
      com.google.protobuf.RpcController controller,
      zab_peer.NewLeaderRequest request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc ProposeTransaction(.zab_peer.ProposeTransactionRequest) returns (.google.protobuf.Empty);</code>
   */
  public abstract void proposeTransaction(
      com.google.protobuf.RpcController controller,
      zab_peer.ProposeTransactionRequest request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc CommitTransaction(.zab_peer.CommitTransactionRequest) returns (.google.protobuf.Empty);</code>
   */
  public abstract void commitTransaction(
      com.google.protobuf.RpcController controller,
      zab_peer.CommitTransactionRequest request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc ReadBalances(.zab_peer.BalanceRequest) returns (.zab_peer.BalanceResponse);</code>
   */
  public abstract void readBalances(
      com.google.protobuf.RpcController controller,
      zab_peer.BalanceRequest request,
      com.google.protobuf.RpcCallback<zab_peer.BalanceResponse> done);

  /**
   * <code>rpc UpdateHistoryOldThreshold(.zab_peer.UpdateHistoryOldThresholdRequest) returns (.google.protobuf.Empty);</code>
   */
  public abstract void updateHistoryOldThreshold(
      com.google.protobuf.RpcController controller,
      zab_peer.UpdateHistoryOldThresholdRequest request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  /**
   * <code>rpc SendHeartbeat(.google.protobuf.Empty) returns (.google.protobuf.Empty);</code>
   */
  public abstract void sendHeartbeat(
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Empty request,
      com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return zab_peer.ZabPeer.getDescriptor().getServices().get(0);
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
        this.sendElectionNotification(controller, (zab_peer.ElectionRequest)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 1:
        this.getState(controller, (com.google.protobuf.Empty)request,
          com.google.protobuf.RpcUtil.<zab_peer.GetStateResponse>specializeCallback(
            done));
        return;
      case 2:
        this.sendFollowerInfo(controller, (zab_peer.FollowerInfoRequest)request,
          com.google.protobuf.RpcUtil.<zab_peer.FollowerInfoResponse>specializeCallback(
            done));
        return;
      case 3:
        this.sendAckNewLeader(controller, (com.google.protobuf.Empty)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 4:
        this.sendNewLeaderNotification(controller, (zab_peer.NewLeaderRequest)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 5:
        this.proposeTransaction(controller, (zab_peer.ProposeTransactionRequest)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 6:
        this.commitTransaction(controller, (zab_peer.CommitTransactionRequest)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 7:
        this.readBalances(controller, (zab_peer.BalanceRequest)request,
          com.google.protobuf.RpcUtil.<zab_peer.BalanceResponse>specializeCallback(
            done));
        return;
      case 8:
        this.updateHistoryOldThreshold(controller, (zab_peer.UpdateHistoryOldThresholdRequest)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
            done));
        return;
      case 9:
        this.sendHeartbeat(controller, (com.google.protobuf.Empty)request,
          com.google.protobuf.RpcUtil.<com.google.protobuf.Empty>specializeCallback(
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
        return zab_peer.ElectionRequest.getDefaultInstance();
      case 1:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 2:
        return zab_peer.FollowerInfoRequest.getDefaultInstance();
      case 3:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 4:
        return zab_peer.NewLeaderRequest.getDefaultInstance();
      case 5:
        return zab_peer.ProposeTransactionRequest.getDefaultInstance();
      case 6:
        return zab_peer.CommitTransactionRequest.getDefaultInstance();
      case 7:
        return zab_peer.BalanceRequest.getDefaultInstance();
      case 8:
        return zab_peer.UpdateHistoryOldThresholdRequest.getDefaultInstance();
      case 9:
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
        return zab_peer.GetStateResponse.getDefaultInstance();
      case 2:
        return zab_peer.FollowerInfoResponse.getDefaultInstance();
      case 3:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 4:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 5:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 6:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 7:
        return zab_peer.BalanceResponse.getDefaultInstance();
      case 8:
        return com.google.protobuf.Empty.getDefaultInstance();
      case 9:
        return com.google.protobuf.Empty.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends zab_peer.ZabPeerService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void sendElectionNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.ElectionRequest request,
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

    public  void getState(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<zab_peer.GetStateResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        zab_peer.GetStateResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          zab_peer.GetStateResponse.class,
          zab_peer.GetStateResponse.getDefaultInstance()));
    }

    public  void sendFollowerInfo(
        com.google.protobuf.RpcController controller,
        zab_peer.FollowerInfoRequest request,
        com.google.protobuf.RpcCallback<zab_peer.FollowerInfoResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        zab_peer.FollowerInfoResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          zab_peer.FollowerInfoResponse.class,
          zab_peer.FollowerInfoResponse.getDefaultInstance()));
    }

    public  void sendAckNewLeader(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void sendNewLeaderNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.NewLeaderRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void proposeTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.ProposeTransactionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void commitTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.CommitTransactionRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(6),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void readBalances(
        com.google.protobuf.RpcController controller,
        zab_peer.BalanceRequest request,
        com.google.protobuf.RpcCallback<zab_peer.BalanceResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(7),
        controller,
        request,
        zab_peer.BalanceResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          zab_peer.BalanceResponse.class,
          zab_peer.BalanceResponse.getDefaultInstance()));
    }

    public  void updateHistoryOldThreshold(
        com.google.protobuf.RpcController controller,
        zab_peer.UpdateHistoryOldThresholdRequest request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(8),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }

    public  void sendHeartbeat(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request,
        com.google.protobuf.RpcCallback<com.google.protobuf.Empty> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(9),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.google.protobuf.Empty.class,
          com.google.protobuf.Empty.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.google.protobuf.Empty sendElectionNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.ElectionRequest request)
        throws com.google.protobuf.ServiceException;

    public zab_peer.GetStateResponse getState(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException;

    public zab_peer.FollowerInfoResponse sendFollowerInfo(
        com.google.protobuf.RpcController controller,
        zab_peer.FollowerInfoRequest request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty sendAckNewLeader(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty sendNewLeaderNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.NewLeaderRequest request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty proposeTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.ProposeTransactionRequest request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty commitTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.CommitTransactionRequest request)
        throws com.google.protobuf.ServiceException;

    public zab_peer.BalanceResponse readBalances(
        com.google.protobuf.RpcController controller,
        zab_peer.BalanceRequest request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty updateHistoryOldThreshold(
        com.google.protobuf.RpcController controller,
        zab_peer.UpdateHistoryOldThresholdRequest request)
        throws com.google.protobuf.ServiceException;

    public com.google.protobuf.Empty sendHeartbeat(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.google.protobuf.Empty sendElectionNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.ElectionRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public zab_peer.GetStateResponse getState(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException {
      return (zab_peer.GetStateResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        zab_peer.GetStateResponse.getDefaultInstance());
    }


    public zab_peer.FollowerInfoResponse sendFollowerInfo(
        com.google.protobuf.RpcController controller,
        zab_peer.FollowerInfoRequest request)
        throws com.google.protobuf.ServiceException {
      return (zab_peer.FollowerInfoResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        zab_peer.FollowerInfoResponse.getDefaultInstance());
    }


    public com.google.protobuf.Empty sendAckNewLeader(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public com.google.protobuf.Empty sendNewLeaderNotification(
        com.google.protobuf.RpcController controller,
        zab_peer.NewLeaderRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public com.google.protobuf.Empty proposeTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.ProposeTransactionRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public com.google.protobuf.Empty commitTransaction(
        com.google.protobuf.RpcController controller,
        zab_peer.CommitTransactionRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(6),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public zab_peer.BalanceResponse readBalances(
        com.google.protobuf.RpcController controller,
        zab_peer.BalanceRequest request)
        throws com.google.protobuf.ServiceException {
      return (zab_peer.BalanceResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(7),
        controller,
        request,
        zab_peer.BalanceResponse.getDefaultInstance());
    }


    public com.google.protobuf.Empty updateHistoryOldThreshold(
        com.google.protobuf.RpcController controller,
        zab_peer.UpdateHistoryOldThresholdRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(8),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }


    public com.google.protobuf.Empty sendHeartbeat(
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Empty request)
        throws com.google.protobuf.ServiceException {
      return (com.google.protobuf.Empty) channel.callBlockingMethod(
        getDescriptor().getMethods().get(9),
        controller,
        request,
        com.google.protobuf.Empty.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:zab_peer.ZabPeerService)
}

