// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package zab;

public interface BankTransactionMapEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zab.BankTransactionMapEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .zab.ZxId key = 1;</code>
   */
  boolean hasKey();
  /**
   * <code>optional .zab.ZxId key = 1;</code>
   */
  zab.ZxId getKey();
  /**
   * <code>optional .zab.ZxId key = 1;</code>
   */
  zab.ZxIdOrBuilder getKeyOrBuilder();

  /**
   * <code>optional .zab.BankTransaction value = 2;</code>
   */
  boolean hasValue();
  /**
   * <code>optional .zab.BankTransaction value = 2;</code>
   */
  zab.BankTransaction getValue();
  /**
   * <code>optional .zab.BankTransaction value = 2;</code>
   */
  zab.BankTransactionOrBuilder getValueOrBuilder();
}