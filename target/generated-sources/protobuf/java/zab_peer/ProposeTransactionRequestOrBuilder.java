// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_peer.proto

package zab_peer;

public interface ProposeTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zab_peer.ProposeTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.zab.ZxId zx_id = 1;</code>
   * @return Whether the zxId field is set.
   */
  boolean hasZxId();
  /**
   * <code>.zab.ZxId zx_id = 1;</code>
   * @return The zxId.
   */
  zab.ZxId getZxId();
  /**
   * <code>.zab.ZxId zx_id = 1;</code>
   */
  zab.ZxIdOrBuilder getZxIdOrBuilder();

  /**
   * <code>.zab.BankTransaction transaction = 2;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.zab.BankTransaction transaction = 2;</code>
   * @return The transaction.
   */
  zab.BankTransaction getTransaction();
  /**
   * <code>.zab.BankTransaction transaction = 2;</code>
   */
  zab.BankTransactionOrBuilder getTransactionOrBuilder();
}