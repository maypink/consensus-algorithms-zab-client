// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package zab;

/**
 * Protobuf enum {@code zab.State}
 */
public enum State
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Election = 0;</code>
   */
  Election(0),
  /**
   * <code>Following = 1;</code>
   */
  Following(1),
  /**
   * <code>Leading = 2;</code>
   */
  Leading(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Election = 0;</code>
   */
  public static final int Election_VALUE = 0;
  /**
   * <code>Following = 1;</code>
   */
  public static final int Following_VALUE = 1;
  /**
   * <code>Leading = 2;</code>
   */
  public static final int Leading_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static State valueOf(int value) {
    return forNumber(value);
  }

  public static State forNumber(int value) {
    switch (value) {
      case 0: return Election;
      case 1: return Following;
      case 2: return Leading;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<State>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return zab.Types.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final State[] VALUES = values();

  public static State valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private State(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:zab.State)
}

