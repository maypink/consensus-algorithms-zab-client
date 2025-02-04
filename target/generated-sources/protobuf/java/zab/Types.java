// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package zab;

public final class Types {
  private Types() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_ZxId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_ZxId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_Vote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_Vote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_BankTransaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_BankTransaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_BankTransactionMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_BankTransactionMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_BankTransactionMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_BankTransactionMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_History_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_History_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_Snap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_Snap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_Snap_DbEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_Snap_DbEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_Diff_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_Diff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zab_Trunc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zab_Trunc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013types.proto\022\003zab\"&\n\004ZxId\022\r\n\005epoch\030\001 \001(" +
      "\r\022\017\n\007counter\030\002 \001(\r\"1\n\004Vote\022\n\n\002id\030\001 \001(\r\022\035" +
      "\n\nlast_zx_id\030\002 \001(\0132\t.zab.ZxId\"5\n\017BankTra" +
      "nsaction\022\022\n\naccount_id\030\001 \001(\r\022\016\n\006amount\030\002" +
      " \001(\005\"V\n\027BankTransactionMapEntry\022\026\n\003key\030\001" +
      " \001(\0132\t.zab.ZxId\022#\n\005value\030\002 \001(\0132\024.zab.Ban" +
      "kTransaction\"C\n\022BankTransactionMap\022-\n\007en" +
      "tries\030\001 \003(\0132\034.zab.BankTransactionMapEntr" +
      "y\"\252\001\n\007History\022&\n\023last_commited_zx_id\030\001 \001" +
      "(\0132\t.zab.ZxId\022 \n\rold_threshold\030\002 \001(\0132\t.z" +
      "ab.ZxId\022)\n\010proposed\030\003 \001(\0132\027.zab.BankTran" +
      "sactionMap\022*\n\tcommitted\030\004 \001(\0132\027.zab.Bank" +
      "TransactionMap\"o\n\004Snap\022\035\n\002db\030\001 \003(\0132\021.zab" +
      ".Snap.DbEntry\022\035\n\007history\030\002 \001(\0132\014.zab.His" +
      "tory\032)\n\007DbEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 " +
      "\001(\005:\0028\001\"5\n\004Diff\022-\n\014transactions\030\001 \001(\0132\027." +
      "zab.BankTransactionMap\"/\n\005Trunc\022&\n\023last_" +
      "commited_zx_id\030\001 \001(\0132\t.zab.ZxId*1\n\005State" +
      "\022\014\n\010Election\020\000\022\r\n\tFollowing\020\001\022\013\n\007Leading" +
      "\020\002B\005P\001\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_zab_ZxId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zab_ZxId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_ZxId_descriptor,
        new java.lang.String[] { "Epoch", "Counter", });
    internal_static_zab_Vote_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zab_Vote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_Vote_descriptor,
        new java.lang.String[] { "Id", "LastZxId", });
    internal_static_zab_BankTransaction_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_zab_BankTransaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_BankTransaction_descriptor,
        new java.lang.String[] { "AccountId", "Amount", });
    internal_static_zab_BankTransactionMapEntry_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_zab_BankTransactionMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_BankTransactionMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_zab_BankTransactionMap_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_zab_BankTransactionMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_BankTransactionMap_descriptor,
        new java.lang.String[] { "Entries", });
    internal_static_zab_History_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_zab_History_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_History_descriptor,
        new java.lang.String[] { "LastCommitedZxId", "OldThreshold", "Proposed", "Committed", });
    internal_static_zab_Snap_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_zab_Snap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_Snap_descriptor,
        new java.lang.String[] { "Db", "History", });
    internal_static_zab_Snap_DbEntry_descriptor =
      internal_static_zab_Snap_descriptor.getNestedTypes().get(0);
    internal_static_zab_Snap_DbEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_Snap_DbEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_zab_Diff_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_zab_Diff_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_Diff_descriptor,
        new java.lang.String[] { "Transactions", });
    internal_static_zab_Trunc_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_zab_Trunc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zab_Trunc_descriptor,
        new java.lang.String[] { "LastCommitedZxId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
