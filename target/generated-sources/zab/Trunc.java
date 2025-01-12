// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package zab;

/**
 * Protobuf type {@code zab.Trunc}
 */
public  final class Trunc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab.Trunc)
    TruncOrBuilder {
  // Use Trunc.newBuilder() to construct.
  private Trunc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Trunc() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Trunc(
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
            if (lastCommitedZxId_ != null) {
              subBuilder = lastCommitedZxId_.toBuilder();
            }
            lastCommitedZxId_ = input.readMessage(zab.ZxId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastCommitedZxId_);
              lastCommitedZxId_ = subBuilder.buildPartial();
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
    return zab.Types.internal_static_zab_Trunc_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab.Types.internal_static_zab_Trunc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab.Trunc.class, zab.Trunc.Builder.class);
  }

  public static final int LAST_COMMITED_ZX_ID_FIELD_NUMBER = 1;
  private zab.ZxId lastCommitedZxId_;
  /**
   * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
   */
  public boolean hasLastCommitedZxId() {
    return lastCommitedZxId_ != null;
  }
  /**
   * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
   */
  public zab.ZxId getLastCommitedZxId() {
    return lastCommitedZxId_ == null ? zab.ZxId.getDefaultInstance() : lastCommitedZxId_;
  }
  /**
   * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
   */
  public zab.ZxIdOrBuilder getLastCommitedZxIdOrBuilder() {
    return getLastCommitedZxId();
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
    if (lastCommitedZxId_ != null) {
      output.writeMessage(1, getLastCommitedZxId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lastCommitedZxId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLastCommitedZxId());
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
    if (!(obj instanceof zab.Trunc)) {
      return super.equals(obj);
    }
    zab.Trunc other = (zab.Trunc) obj;

    boolean result = true;
    result = result && (hasLastCommitedZxId() == other.hasLastCommitedZxId());
    if (hasLastCommitedZxId()) {
      result = result && getLastCommitedZxId()
          .equals(other.getLastCommitedZxId());
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
    if (hasLastCommitedZxId()) {
      hash = (37 * hash) + LAST_COMMITED_ZX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLastCommitedZxId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab.Trunc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab.Trunc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab.Trunc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab.Trunc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab.Trunc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab.Trunc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab.Trunc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab.Trunc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab.Trunc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab.Trunc parseFrom(
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
  public static Builder newBuilder(zab.Trunc prototype) {
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
   * Protobuf type {@code zab.Trunc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab.Trunc)
      zab.TruncOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab.Types.internal_static_zab_Trunc_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab.Types.internal_static_zab_Trunc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab.Trunc.class, zab.Trunc.Builder.class);
    }

    // Construct using zab.Trunc.newBuilder()
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
      if (lastCommitedZxIdBuilder_ == null) {
        lastCommitedZxId_ = null;
      } else {
        lastCommitedZxId_ = null;
        lastCommitedZxIdBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab.Types.internal_static_zab_Trunc_descriptor;
    }

    public zab.Trunc getDefaultInstanceForType() {
      return zab.Trunc.getDefaultInstance();
    }

    public zab.Trunc build() {
      zab.Trunc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab.Trunc buildPartial() {
      zab.Trunc result = new zab.Trunc(this);
      if (lastCommitedZxIdBuilder_ == null) {
        result.lastCommitedZxId_ = lastCommitedZxId_;
      } else {
        result.lastCommitedZxId_ = lastCommitedZxIdBuilder_.build();
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
      if (other instanceof zab.Trunc) {
        return mergeFrom((zab.Trunc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab.Trunc other) {
      if (other == zab.Trunc.getDefaultInstance()) return this;
      if (other.hasLastCommitedZxId()) {
        mergeLastCommitedZxId(other.getLastCommitedZxId());
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
      zab.Trunc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab.Trunc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private zab.ZxId lastCommitedZxId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder> lastCommitedZxIdBuilder_;
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public boolean hasLastCommitedZxId() {
      return lastCommitedZxIdBuilder_ != null || lastCommitedZxId_ != null;
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public zab.ZxId getLastCommitedZxId() {
      if (lastCommitedZxIdBuilder_ == null) {
        return lastCommitedZxId_ == null ? zab.ZxId.getDefaultInstance() : lastCommitedZxId_;
      } else {
        return lastCommitedZxIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public Builder setLastCommitedZxId(zab.ZxId value) {
      if (lastCommitedZxIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastCommitedZxId_ = value;
        onChanged();
      } else {
        lastCommitedZxIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public Builder setLastCommitedZxId(
        zab.ZxId.Builder builderForValue) {
      if (lastCommitedZxIdBuilder_ == null) {
        lastCommitedZxId_ = builderForValue.build();
        onChanged();
      } else {
        lastCommitedZxIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public Builder mergeLastCommitedZxId(zab.ZxId value) {
      if (lastCommitedZxIdBuilder_ == null) {
        if (lastCommitedZxId_ != null) {
          lastCommitedZxId_ =
            zab.ZxId.newBuilder(lastCommitedZxId_).mergeFrom(value).buildPartial();
        } else {
          lastCommitedZxId_ = value;
        }
        onChanged();
      } else {
        lastCommitedZxIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public Builder clearLastCommitedZxId() {
      if (lastCommitedZxIdBuilder_ == null) {
        lastCommitedZxId_ = null;
        onChanged();
      } else {
        lastCommitedZxId_ = null;
        lastCommitedZxIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public zab.ZxId.Builder getLastCommitedZxIdBuilder() {
      
      onChanged();
      return getLastCommitedZxIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    public zab.ZxIdOrBuilder getLastCommitedZxIdOrBuilder() {
      if (lastCommitedZxIdBuilder_ != null) {
        return lastCommitedZxIdBuilder_.getMessageOrBuilder();
      } else {
        return lastCommitedZxId_ == null ?
            zab.ZxId.getDefaultInstance() : lastCommitedZxId_;
      }
    }
    /**
     * <code>optional .zab.ZxId last_commited_zx_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder> 
        getLastCommitedZxIdFieldBuilder() {
      if (lastCommitedZxIdBuilder_ == null) {
        lastCommitedZxIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder>(
                getLastCommitedZxId(),
                getParentForChildren(),
                isClean());
        lastCommitedZxId_ = null;
      }
      return lastCommitedZxIdBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zab.Trunc)
  }

  // @@protoc_insertion_point(class_scope:zab.Trunc)
  private static final zab.Trunc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab.Trunc();
  }

  public static zab.Trunc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Trunc>
      PARSER = new com.google.protobuf.AbstractParser<Trunc>() {
    public Trunc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Trunc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Trunc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Trunc> getParserForType() {
    return PARSER;
  }

  public zab.Trunc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
