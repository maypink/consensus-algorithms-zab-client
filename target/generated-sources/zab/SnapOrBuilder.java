// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package zab;

public interface SnapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zab.Snap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, int32&gt; db = 1;</code>
   */
  int getDbCount();
  /**
   * <code>map&lt;uint32, int32&gt; db = 1;</code>
   */
  boolean containsDb(
      int key);
  /**
   * Use {@link #getDbMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getDb();
  /**
   * <code>map&lt;uint32, int32&gt; db = 1;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getDbMap();
  /**
   * <code>map&lt;uint32, int32&gt; db = 1;</code>
   */

  int getDbOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, int32&gt; db = 1;</code>
   */

  int getDbOrThrow(
      int key);

  /**
   * <code>optional .zab.History history = 2;</code>
   */
  boolean hasHistory();
  /**
   * <code>optional .zab.History history = 2;</code>
   */
  zab.History getHistory();
  /**
   * <code>optional .zab.History history = 2;</code>
   */
  zab.HistoryOrBuilder getHistoryOrBuilder();
}
