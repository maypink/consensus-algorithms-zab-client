// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_client.proto

package zab_client;

/**
 * Protobuf type {@code zab_client.DebugHasOutstandingTransactionsResponse}
 */
public  final class DebugHasOutstandingTransactionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab_client.DebugHasOutstandingTransactionsResponse)
    DebugHasOutstandingTransactionsResponseOrBuilder {
  // Use DebugHasOutstandingTransactionsResponse.newBuilder() to construct.
  private DebugHasOutstandingTransactionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DebugHasOutstandingTransactionsResponse() {
    hasOutstandingTransactions_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DebugHasOutstandingTransactionsResponse(
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

            hasOutstandingTransactions_ = input.readBool();
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
    return zab_client.ZabClient.internal_static_zab_client_DebugHasOutstandingTransactionsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab_client.ZabClient.internal_static_zab_client_DebugHasOutstandingTransactionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab_client.DebugHasOutstandingTransactionsResponse.class, zab_client.DebugHasOutstandingTransactionsResponse.Builder.class);
  }

  public static final int HAS_OUTSTANDING_TRANSACTIONS_FIELD_NUMBER = 1;
  private boolean hasOutstandingTransactions_;
  /**
   * <code>optional bool has_outstanding_transactions = 1;</code>
   */
  public boolean getHasOutstandingTransactions() {
    return hasOutstandingTransactions_;
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
    if (hasOutstandingTransactions_ != false) {
      output.writeBool(1, hasOutstandingTransactions_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hasOutstandingTransactions_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, hasOutstandingTransactions_);
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
    if (!(obj instanceof zab_client.DebugHasOutstandingTransactionsResponse)) {
      return super.equals(obj);
    }
    zab_client.DebugHasOutstandingTransactionsResponse other = (zab_client.DebugHasOutstandingTransactionsResponse) obj;

    boolean result = true;
    result = result && (getHasOutstandingTransactions()
        == other.getHasOutstandingTransactions());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + HAS_OUTSTANDING_TRANSACTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasOutstandingTransactions());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_client.DebugHasOutstandingTransactionsResponse parseFrom(
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
  public static Builder newBuilder(zab_client.DebugHasOutstandingTransactionsResponse prototype) {
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
   * Protobuf type {@code zab_client.DebugHasOutstandingTransactionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab_client.DebugHasOutstandingTransactionsResponse)
      zab_client.DebugHasOutstandingTransactionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab_client.ZabClient.internal_static_zab_client_DebugHasOutstandingTransactionsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab_client.ZabClient.internal_static_zab_client_DebugHasOutstandingTransactionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab_client.DebugHasOutstandingTransactionsResponse.class, zab_client.DebugHasOutstandingTransactionsResponse.Builder.class);
    }

    // Construct using zab_client.DebugHasOutstandingTransactionsResponse.newBuilder()
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
      hasOutstandingTransactions_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab_client.ZabClient.internal_static_zab_client_DebugHasOutstandingTransactionsResponse_descriptor;
    }

    public zab_client.DebugHasOutstandingTransactionsResponse getDefaultInstanceForType() {
      return zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance();
    }

    public zab_client.DebugHasOutstandingTransactionsResponse build() {
      zab_client.DebugHasOutstandingTransactionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab_client.DebugHasOutstandingTransactionsResponse buildPartial() {
      zab_client.DebugHasOutstandingTransactionsResponse result = new zab_client.DebugHasOutstandingTransactionsResponse(this);
      result.hasOutstandingTransactions_ = hasOutstandingTransactions_;
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
      if (other instanceof zab_client.DebugHasOutstandingTransactionsResponse) {
        return mergeFrom((zab_client.DebugHasOutstandingTransactionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab_client.DebugHasOutstandingTransactionsResponse other) {
      if (other == zab_client.DebugHasOutstandingTransactionsResponse.getDefaultInstance()) return this;
      if (other.getHasOutstandingTransactions() != false) {
        setHasOutstandingTransactions(other.getHasOutstandingTransactions());
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
      zab_client.DebugHasOutstandingTransactionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab_client.DebugHasOutstandingTransactionsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean hasOutstandingTransactions_ ;
    /**
     * <code>optional bool has_outstanding_transactions = 1;</code>
     */
    public boolean getHasOutstandingTransactions() {
      return hasOutstandingTransactions_;
    }
    /**
     * <code>optional bool has_outstanding_transactions = 1;</code>
     */
    public Builder setHasOutstandingTransactions(boolean value) {
      
      hasOutstandingTransactions_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool has_outstanding_transactions = 1;</code>
     */
    public Builder clearHasOutstandingTransactions() {
      
      hasOutstandingTransactions_ = false;
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


    // @@protoc_insertion_point(builder_scope:zab_client.DebugHasOutstandingTransactionsResponse)
  }

  // @@protoc_insertion_point(class_scope:zab_client.DebugHasOutstandingTransactionsResponse)
  private static final zab_client.DebugHasOutstandingTransactionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab_client.DebugHasOutstandingTransactionsResponse();
  }

  public static zab_client.DebugHasOutstandingTransactionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebugHasOutstandingTransactionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<DebugHasOutstandingTransactionsResponse>() {
    public DebugHasOutstandingTransactionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DebugHasOutstandingTransactionsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DebugHasOutstandingTransactionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebugHasOutstandingTransactionsResponse> getParserForType() {
    return PARSER;
  }

  public zab_client.DebugHasOutstandingTransactionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
