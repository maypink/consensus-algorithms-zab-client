// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_peer.proto

package zab_peer;

public final class ZabPeer {
  private ZabPeer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_ElectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_ElectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_GetStateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_GetStateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_FollowerInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_FollowerInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_FollowerInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_FollowerInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_ProposeTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_ProposeTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_AckTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_AckTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_CommitTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_CommitTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_UpdateHistoryOldThresholdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_UpdateHistoryOldThresholdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_peer_HistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_peer_HistoryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016zab_peer.proto\022\010zab_peer\032\034google/proto" +
      "buf/struct.proto\032\033google/protobuf/empty." +
      "proto\032\013types.proto\"`\n\017ElectionRequest\022\027\n" +
      "\004vote\030\001 \001(\0132\t.zab.Vote\022\n\n\002id\030\002 \001(\r\022\031\n\005st" +
      "ate\030\003 \001(\0162\n.zab.State\022\r\n\005round\030\004 \001(\r\"-\n\020" +
      "GetStateResponse\022\031\n\005state\030\001 \001(\0162\n.zab.St" +
      "ate\"4\n\023FollowerInfoRequest\022\035\n\nlast_zx_id" +
      "\030\001 \001(\0132\t.zab.ZxId\"\220\001\n\024FollowerInfoRespon" +
      "se\022\035\n\nlast_zx_id\030\001 \001(\0132\t.zab.ZxId\022\033\n\005tru" +
      "nc\030\002 \001(\0132\n.zab.TruncH\000\022\031\n\004diff\030\003 \001(\0132\t.z",
      "ab.DiffH\000\022\031\n\004snap\030\004 \001(\0132\t.zab.SnapH\000B\006\n\004" +
      "type\"`\n\031ProposeTransactionRequest\022\030\n\005zx_" +
      "id\030\001 \001(\0132\t.zab.ZxId\022)\n\013transaction\030\002 \001(\013" +
      "2\024.zab.BankTransaction\"1\n\025AckTransaction" +
      "Request\022\030\n\005zx_id\030\001 \001(\0132\t.zab.ZxId\"4\n\030Com" +
      "mitTransactionRequest\022\030\n\005zx_id\030\001 \001(\0132\t.z" +
      "ab.ZxId\"<\n UpdateHistoryOldThresholdRequ" +
      "est\022\030\n\005zx_id\030\001 \001(\0132\t.zab.ZxId\"/\n\016History" +
      "Request\022\035\n\007history\030\001 \001(\0132\014.zab.History2\220" +
      "\005\n\022ZabPeerGrpcService\022O\n\030SendElectionNot",
      "ification\022\031.zab_peer.ElectionRequest\032\026.g" +
      "oogle.protobuf.Empty\"\000\022@\n\010GetState\022\026.goo" +
      "gle.protobuf.Empty\032\032.zab_peer.GetStateRe" +
      "sponse\"\000\022S\n\020SendFollowerInfo\022\035.zab_peer." +
      "FollowerInfoRequest\032\036.zab_peer.FollowerI" +
      "nfoResponse\"\000\022D\n\020SendAckNewLeader\022\026.goog" +
      "le.protobuf.Empty\032\026.google.protobuf.Empt" +
      "y\"\000\022S\n\022ProposeTransaction\022#.zab_peer.Pro" +
      "poseTransactionRequest\032\026.google.protobuf" +
      ".Empty\"\000\022Q\n\021CommitTransaction\022\".zab_peer",
      ".CommitTransactionRequest\032\026.google.proto" +
      "buf.Empty\"\000\022a\n\031UpdateHistoryOldThreshold" +
      "\022*.zab_peer.UpdateHistoryOldThresholdReq" +
      "uest\032\026.google.protobuf.Empty\"\000\022A\n\rSendHe" +
      "artbeat\022\026.google.protobuf.Empty\032\026.google" +
      ".protobuf.Empty\"\000B\005P\001\210\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          zab.Types.getDescriptor(),
        }, assigner);
    internal_static_zab_peer_ElectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zab_peer_ElectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_ElectionRequest_descriptor,
        new java.lang.String[] { "Vote", "Id", "State", "Round", });
    internal_static_zab_peer_GetStateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zab_peer_GetStateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_GetStateResponse_descriptor,
        new java.lang.String[] { "State", });
    internal_static_zab_peer_FollowerInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_zab_peer_FollowerInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_FollowerInfoRequest_descriptor,
        new java.lang.String[] { "LastZxId", });
    internal_static_zab_peer_FollowerInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_zab_peer_FollowerInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_FollowerInfoResponse_descriptor,
        new java.lang.String[] { "LastZxId", "Trunc", "Diff", "Snap", "Type", });
    internal_static_zab_peer_ProposeTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_zab_peer_ProposeTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_ProposeTransactionRequest_descriptor,
        new java.lang.String[] { "ZxId", "Transaction", });
    internal_static_zab_peer_AckTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_zab_peer_AckTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_AckTransactionRequest_descriptor,
        new java.lang.String[] { "ZxId", });
    internal_static_zab_peer_CommitTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_zab_peer_CommitTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_CommitTransactionRequest_descriptor,
        new java.lang.String[] { "ZxId", });
    internal_static_zab_peer_UpdateHistoryOldThresholdRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_zab_peer_UpdateHistoryOldThresholdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_UpdateHistoryOldThresholdRequest_descriptor,
        new java.lang.String[] { "ZxId", });
    internal_static_zab_peer_HistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_zab_peer_HistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_peer_HistoryRequest_descriptor,
        new java.lang.String[] { "History", });
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    zab.Types.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
