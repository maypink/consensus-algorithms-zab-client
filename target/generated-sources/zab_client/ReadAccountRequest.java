// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_client.proto

package zab_client;

/**
 * Protobuf type {@code zab_client.ReadAccountRequest}
 */
public  final class ReadAccountRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab_client.ReadAccountRequest)
    ReadAccountRequestOrBuilder {
  // Use ReadAccountRequest.newBuilder() to construct.
  private ReadAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadAccountRequest() {
    accountId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReadAccountRequest(
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

            accountId_ = input.readUInt32();
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
    return zab_client.ZabClient.internal_static_zab_client_ReadAccountRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab_client.ZabClient.internal_static_zab_client_ReadAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab_client.ReadAccountRequest.class, zab_client.ReadAccountRequest.Builder.class);
  }

  public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
  private int accountId_;
  /**
   * <code>optional uint32 account_id = 1;</code>
   */
  public int getAccountId() {
    return accountId_;
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
    if (accountId_ != 0) {
      output.writeUInt32(1, accountId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, accountId_);
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
    if (!(obj instanceof zab_client.ReadAccountRequest)) {
      return super.equals(obj);
    }
    zab_client.ReadAccountRequest other = (zab_client.ReadAccountRequest) obj;

    boolean result = true;
    result = result && (getAccountId()
        == other.getAccountId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ACCOUNT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab_client.ReadAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_client.ReadAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_client.ReadAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_client.ReadAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_client.ReadAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_client.ReadAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_client.ReadAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab_client.ReadAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_client.ReadAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_client.ReadAccountRequest parseFrom(
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
  public static Builder newBuilder(zab_client.ReadAccountRequest prototype) {
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
   * Protobuf type {@code zab_client.ReadAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab_client.ReadAccountRequest)
      zab_client.ReadAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab_client.ZabClient.internal_static_zab_client_ReadAccountRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab_client.ZabClient.internal_static_zab_client_ReadAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab_client.ReadAccountRequest.class, zab_client.ReadAccountRequest.Builder.class);
    }

    // Construct using zab_client.ReadAccountRequest.newBuilder()
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
      accountId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab_client.ZabClient.internal_static_zab_client_ReadAccountRequest_descriptor;
    }

    public zab_client.ReadAccountRequest getDefaultInstanceForType() {
      return zab_client.ReadAccountRequest.getDefaultInstance();
    }

    public zab_client.ReadAccountRequest build() {
      zab_client.ReadAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab_client.ReadAccountRequest buildPartial() {
      zab_client.ReadAccountRequest result = new zab_client.ReadAccountRequest(this);
      result.accountId_ = accountId_;
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
      if (other instanceof zab_client.ReadAccountRequest) {
        return mergeFrom((zab_client.ReadAccountRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab_client.ReadAccountRequest other) {
      if (other == zab_client.ReadAccountRequest.getDefaultInstance()) return this;
      if (other.getAccountId() != 0) {
        setAccountId(other.getAccountId());
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
      zab_client.ReadAccountRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab_client.ReadAccountRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int accountId_ ;
    /**
     * <code>optional uint32 account_id = 1;</code>
     */
    public int getAccountId() {
      return accountId_;
    }
    /**
     * <code>optional uint32 account_id = 1;</code>
     */
    public Builder setAccountId(int value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 account_id = 1;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:zab_client.ReadAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:zab_client.ReadAccountRequest)
  private static final zab_client.ReadAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab_client.ReadAccountRequest();
  }

  public static zab_client.ReadAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadAccountRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadAccountRequest>() {
    public ReadAccountRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadAccountRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadAccountRequest> getParserForType() {
    return PARSER;
  }

  public zab_client.ReadAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

