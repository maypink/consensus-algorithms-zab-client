// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_peer.proto

package zab_peer;

/**
 * Protobuf type {@code zab_peer.FollowerInfoRequest}
 */
public  final class FollowerInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab_peer.FollowerInfoRequest)
    FollowerInfoRequestOrBuilder {
  // Use FollowerInfoRequest.newBuilder() to construct.
  private FollowerInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FollowerInfoRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FollowerInfoRequest(
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
          case 10: {
            zab.ZxId.Builder subBuilder = null;
            if (lastZxId_ != null) {
              subBuilder = lastZxId_.toBuilder();
            }
            lastZxId_ = input.readMessage(zab.ZxId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastZxId_);
              lastZxId_ = subBuilder.buildPartial();
            }

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
    return zab_peer.ZabPeer.internal_static_zab_peer_FollowerInfoRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab_peer.ZabPeer.internal_static_zab_peer_FollowerInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab_peer.FollowerInfoRequest.class, zab_peer.FollowerInfoRequest.Builder.class);
  }

  public static final int LAST_ZX_ID_FIELD_NUMBER = 1;
  private zab.ZxId lastZxId_;
  /**
   * <code>optional .zab.ZxId last_zx_id = 1;</code>
   */
  public boolean hasLastZxId() {
    return lastZxId_ != null;
  }
  /**
   * <code>optional .zab.ZxId last_zx_id = 1;</code>
   */
  public zab.ZxId getLastZxId() {
    return lastZxId_ == null ? zab.ZxId.getDefaultInstance() : lastZxId_;
  }
  /**
   * <code>optional .zab.ZxId last_zx_id = 1;</code>
   */
  public zab.ZxIdOrBuilder getLastZxIdOrBuilder() {
    return getLastZxId();
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
    if (lastZxId_ != null) {
      output.writeMessage(1, getLastZxId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lastZxId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLastZxId());
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
    if (!(obj instanceof zab_peer.FollowerInfoRequest)) {
      return super.equals(obj);
    }
    zab_peer.FollowerInfoRequest other = (zab_peer.FollowerInfoRequest) obj;

    boolean result = true;
    result = result && (hasLastZxId() == other.hasLastZxId());
    if (hasLastZxId()) {
      result = result && getLastZxId()
          .equals(other.getLastZxId());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasLastZxId()) {
      hash = (37 * hash) + LAST_ZX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLastZxId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab_peer.FollowerInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_peer.FollowerInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab_peer.FollowerInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_peer.FollowerInfoRequest parseFrom(
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
  public static Builder newBuilder(zab_peer.FollowerInfoRequest prototype) {
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
   * Protobuf type {@code zab_peer.FollowerInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab_peer.FollowerInfoRequest)
      zab_peer.FollowerInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab_peer.ZabPeer.internal_static_zab_peer_FollowerInfoRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab_peer.ZabPeer.internal_static_zab_peer_FollowerInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab_peer.FollowerInfoRequest.class, zab_peer.FollowerInfoRequest.Builder.class);
    }

    // Construct using zab_peer.FollowerInfoRequest.newBuilder()
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
      if (lastZxIdBuilder_ == null) {
        lastZxId_ = null;
      } else {
        lastZxId_ = null;
        lastZxIdBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab_peer.ZabPeer.internal_static_zab_peer_FollowerInfoRequest_descriptor;
    }

    public zab_peer.FollowerInfoRequest getDefaultInstanceForType() {
      return zab_peer.FollowerInfoRequest.getDefaultInstance();
    }

    public zab_peer.FollowerInfoRequest build() {
      zab_peer.FollowerInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab_peer.FollowerInfoRequest buildPartial() {
      zab_peer.FollowerInfoRequest result = new zab_peer.FollowerInfoRequest(this);
      if (lastZxIdBuilder_ == null) {
        result.lastZxId_ = lastZxId_;
      } else {
        result.lastZxId_ = lastZxIdBuilder_.build();
      }
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
      if (other instanceof zab_peer.FollowerInfoRequest) {
        return mergeFrom((zab_peer.FollowerInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab_peer.FollowerInfoRequest other) {
      if (other == zab_peer.FollowerInfoRequest.getDefaultInstance()) return this;
      if (other.hasLastZxId()) {
        mergeLastZxId(other.getLastZxId());
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
      zab_peer.FollowerInfoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab_peer.FollowerInfoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private zab.ZxId lastZxId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder> lastZxIdBuilder_;
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public boolean hasLastZxId() {
      return lastZxIdBuilder_ != null || lastZxId_ != null;
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public zab.ZxId getLastZxId() {
      if (lastZxIdBuilder_ == null) {
        return lastZxId_ == null ? zab.ZxId.getDefaultInstance() : lastZxId_;
      } else {
        return lastZxIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public Builder setLastZxId(zab.ZxId value) {
      if (lastZxIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastZxId_ = value;
        onChanged();
      } else {
        lastZxIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public Builder setLastZxId(
        zab.ZxId.Builder builderForValue) {
      if (lastZxIdBuilder_ == null) {
        lastZxId_ = builderForValue.build();
        onChanged();
      } else {
        lastZxIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public Builder mergeLastZxId(zab.ZxId value) {
      if (lastZxIdBuilder_ == null) {
        if (lastZxId_ != null) {
          lastZxId_ =
            zab.ZxId.newBuilder(lastZxId_).mergeFrom(value).buildPartial();
        } else {
          lastZxId_ = value;
        }
        onChanged();
      } else {
        lastZxIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public Builder clearLastZxId() {
      if (lastZxIdBuilder_ == null) {
        lastZxId_ = null;
        onChanged();
      } else {
        lastZxId_ = null;
        lastZxIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public zab.ZxId.Builder getLastZxIdBuilder() {
      
      onChanged();
      return getLastZxIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    public zab.ZxIdOrBuilder getLastZxIdOrBuilder() {
      if (lastZxIdBuilder_ != null) {
        return lastZxIdBuilder_.getMessageOrBuilder();
      } else {
        return lastZxId_ == null ?
            zab.ZxId.getDefaultInstance() : lastZxId_;
      }
    }
    /**
     * <code>optional .zab.ZxId last_zx_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder> 
        getLastZxIdFieldBuilder() {
      if (lastZxIdBuilder_ == null) {
        lastZxIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder>(
                getLastZxId(),
                getParentForChildren(),
                isClean());
        lastZxId_ = null;
      }
      return lastZxIdBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zab_peer.FollowerInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:zab_peer.FollowerInfoRequest)
  private static final zab_peer.FollowerInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab_peer.FollowerInfoRequest();
  }

  public static zab_peer.FollowerInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FollowerInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<FollowerInfoRequest>() {
    public FollowerInfoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FollowerInfoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FollowerInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FollowerInfoRequest> getParserForType() {
    return PARSER;
  }

  public zab_peer.FollowerInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

