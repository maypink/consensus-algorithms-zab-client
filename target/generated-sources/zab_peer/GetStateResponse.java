// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_peer.proto

package zab_peer;

/**
 * Protobuf type {@code zab_peer.GetStateResponse}
 */
public  final class GetStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab_peer.GetStateResponse)
    GetStateResponseOrBuilder {
  // Use GetStateResponse.newBuilder() to construct.
  private GetStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetStateResponse() {
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetStateResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zab_peer.ZabPeer.internal_static_zab_peer_GetStateResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab_peer.ZabPeer.internal_static_zab_peer_GetStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab_peer.GetStateResponse.class, zab_peer.GetStateResponse.Builder.class);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   * <code>optional .zab.State state = 1;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <code>optional .zab.State state = 1;</code>
   */
  public zab.State getState() {
    zab.State result = zab.State.valueOf(state_);
    return result == null ? zab.State.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (state_ != zab.State.Election.getNumber()) {
      output.writeEnum(1, state_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != zab.State.Election.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof zab_peer.GetStateResponse)) {
      return super.equals(obj);
    }
    zab_peer.GetStateResponse other = (zab_peer.GetStateResponse) obj;

    boolean result = true;
    result = result && state_ == other.state_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab_peer.GetStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_peer.GetStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_peer.GetStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_peer.GetStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_peer.GetStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_peer.GetStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_peer.GetStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab_peer.GetStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_peer.GetStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_peer.GetStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(zab_peer.GetStateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code zab_peer.GetStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab_peer.GetStateResponse)
      zab_peer.GetStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab_peer.ZabPeer.internal_static_zab_peer_GetStateResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab_peer.ZabPeer.internal_static_zab_peer_GetStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab_peer.GetStateResponse.class, zab_peer.GetStateResponse.Builder.class);
    }

    // Construct using zab_peer.GetStateResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      state_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab_peer.ZabPeer.internal_static_zab_peer_GetStateResponse_descriptor;
    }

    public zab_peer.GetStateResponse getDefaultInstanceForType() {
      return zab_peer.GetStateResponse.getDefaultInstance();
    }

    public zab_peer.GetStateResponse build() {
      zab_peer.GetStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab_peer.GetStateResponse buildPartial() {
      zab_peer.GetStateResponse result = new zab_peer.GetStateResponse(this);
      result.state_ = state_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof zab_peer.GetStateResponse) {
        return mergeFrom((zab_peer.GetStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab_peer.GetStateResponse other) {
      if (other == zab_peer.GetStateResponse.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      zab_peer.GetStateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab_peer.GetStateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     * <code>optional .zab.State state = 1;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <code>optional .zab.State state = 1;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .zab.State state = 1;</code>
     */
    public zab.State getState() {
      zab.State result = zab.State.valueOf(state_);
      return result == null ? zab.State.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .zab.State state = 1;</code>
     */
    public Builder setState(zab.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .zab.State state = 1;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zab_peer.GetStateResponse)
  }

  // @@protoc_insertion_point(class_scope:zab_peer.GetStateResponse)
  private static final zab_peer.GetStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab_peer.GetStateResponse();
  }

  public static zab_peer.GetStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetStateResponse>() {
    public GetStateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetStateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetStateResponse> getParserForType() {
    return PARSER;
  }

  public zab_peer.GetStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

