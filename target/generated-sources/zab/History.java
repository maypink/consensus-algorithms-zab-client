// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package zab;

/**
 * Protobuf type {@code zab.History}
 */
public  final class History extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab.History)
    HistoryOrBuilder {
  // Use History.newBuilder() to construct.
  private History(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private History() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private History(
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
          case 18: {
            zab.ZxId.Builder subBuilder = null;
            if (oldThreshold_ != null) {
              subBuilder = oldThreshold_.toBuilder();
            }
            oldThreshold_ = input.readMessage(zab.ZxId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(oldThreshold_);
              oldThreshold_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            zab.BankTransactionMap.Builder subBuilder = null;
            if (proposed_ != null) {
              subBuilder = proposed_.toBuilder();
            }
            proposed_ = input.readMessage(zab.BankTransactionMap.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proposed_);
              proposed_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            zab.BankTransactionMap.Builder subBuilder = null;
            if (committed_ != null) {
              subBuilder = committed_.toBuilder();
            }
            committed_ = input.readMessage(zab.BankTransactionMap.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(committed_);
              committed_ = subBuilder.buildPartial();
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
    return zab.Types.internal_static_zab_History_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab.Types.internal_static_zab_History_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab.History.class, zab.History.Builder.class);
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

  public static final int OLD_THRESHOLD_FIELD_NUMBER = 2;
  private zab.ZxId oldThreshold_;
  /**
   * <code>optional .zab.ZxId old_threshold = 2;</code>
   */
  public boolean hasOldThreshold() {
    return oldThreshold_ != null;
  }
  /**
   * <code>optional .zab.ZxId old_threshold = 2;</code>
   */
  public zab.ZxId getOldThreshold() {
    return oldThreshold_ == null ? zab.ZxId.getDefaultInstance() : oldThreshold_;
  }
  /**
   * <code>optional .zab.ZxId old_threshold = 2;</code>
   */
  public zab.ZxIdOrBuilder getOldThresholdOrBuilder() {
    return getOldThreshold();
  }

  public static final int PROPOSED_FIELD_NUMBER = 3;
  private zab.BankTransactionMap proposed_;
  /**
   * <code>optional .zab.BankTransactionMap proposed = 3;</code>
   */
  public boolean hasProposed() {
    return proposed_ != null;
  }
  /**
   * <code>optional .zab.BankTransactionMap proposed = 3;</code>
   */
  public zab.BankTransactionMap getProposed() {
    return proposed_ == null ? zab.BankTransactionMap.getDefaultInstance() : proposed_;
  }
  /**
   * <code>optional .zab.BankTransactionMap proposed = 3;</code>
   */
  public zab.BankTransactionMapOrBuilder getProposedOrBuilder() {
    return getProposed();
  }

  public static final int COMMITTED_FIELD_NUMBER = 4;
  private zab.BankTransactionMap committed_;
  /**
   * <code>optional .zab.BankTransactionMap committed = 4;</code>
   */
  public boolean hasCommitted() {
    return committed_ != null;
  }
  /**
   * <code>optional .zab.BankTransactionMap committed = 4;</code>
   */
  public zab.BankTransactionMap getCommitted() {
    return committed_ == null ? zab.BankTransactionMap.getDefaultInstance() : committed_;
  }
  /**
   * <code>optional .zab.BankTransactionMap committed = 4;</code>
   */
  public zab.BankTransactionMapOrBuilder getCommittedOrBuilder() {
    return getCommitted();
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
    if (oldThreshold_ != null) {
      output.writeMessage(2, getOldThreshold());
    }
    if (proposed_ != null) {
      output.writeMessage(3, getProposed());
    }
    if (committed_ != null) {
      output.writeMessage(4, getCommitted());
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
    if (oldThreshold_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOldThreshold());
    }
    if (proposed_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProposed());
    }
    if (committed_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCommitted());
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
    if (!(obj instanceof zab.History)) {
      return super.equals(obj);
    }
    zab.History other = (zab.History) obj;

    boolean result = true;
    result = result && (hasLastCommitedZxId() == other.hasLastCommitedZxId());
    if (hasLastCommitedZxId()) {
      result = result && getLastCommitedZxId()
          .equals(other.getLastCommitedZxId());
    }
    result = result && (hasOldThreshold() == other.hasOldThreshold());
    if (hasOldThreshold()) {
      result = result && getOldThreshold()
          .equals(other.getOldThreshold());
    }
    result = result && (hasProposed() == other.hasProposed());
    if (hasProposed()) {
      result = result && getProposed()
          .equals(other.getProposed());
    }
    result = result && (hasCommitted() == other.hasCommitted());
    if (hasCommitted()) {
      result = result && getCommitted()
          .equals(other.getCommitted());
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
    if (hasOldThreshold()) {
      hash = (37 * hash) + OLD_THRESHOLD_FIELD_NUMBER;
      hash = (53 * hash) + getOldThreshold().hashCode();
    }
    if (hasProposed()) {
      hash = (37 * hash) + PROPOSED_FIELD_NUMBER;
      hash = (53 * hash) + getProposed().hashCode();
    }
    if (hasCommitted()) {
      hash = (37 * hash) + COMMITTED_FIELD_NUMBER;
      hash = (53 * hash) + getCommitted().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab.History parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab.History parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab.History parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab.History parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab.History parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab.History parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab.History parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab.History parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab.History parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab.History parseFrom(
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
  public static Builder newBuilder(zab.History prototype) {
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
   * Protobuf type {@code zab.History}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab.History)
      zab.HistoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab.Types.internal_static_zab_History_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab.Types.internal_static_zab_History_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab.History.class, zab.History.Builder.class);
    }

    // Construct using zab.History.newBuilder()
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
      if (oldThresholdBuilder_ == null) {
        oldThreshold_ = null;
      } else {
        oldThreshold_ = null;
        oldThresholdBuilder_ = null;
      }
      if (proposedBuilder_ == null) {
        proposed_ = null;
      } else {
        proposed_ = null;
        proposedBuilder_ = null;
      }
      if (committedBuilder_ == null) {
        committed_ = null;
      } else {
        committed_ = null;
        committedBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab.Types.internal_static_zab_History_descriptor;
    }

    public zab.History getDefaultInstanceForType() {
      return zab.History.getDefaultInstance();
    }

    public zab.History build() {
      zab.History result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab.History buildPartial() {
      zab.History result = new zab.History(this);
      if (lastCommitedZxIdBuilder_ == null) {
        result.lastCommitedZxId_ = lastCommitedZxId_;
      } else {
        result.lastCommitedZxId_ = lastCommitedZxIdBuilder_.build();
      }
      if (oldThresholdBuilder_ == null) {
        result.oldThreshold_ = oldThreshold_;
      } else {
        result.oldThreshold_ = oldThresholdBuilder_.build();
      }
      if (proposedBuilder_ == null) {
        result.proposed_ = proposed_;
      } else {
        result.proposed_ = proposedBuilder_.build();
      }
      if (committedBuilder_ == null) {
        result.committed_ = committed_;
      } else {
        result.committed_ = committedBuilder_.build();
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
      if (other instanceof zab.History) {
        return mergeFrom((zab.History)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab.History other) {
      if (other == zab.History.getDefaultInstance()) return this;
      if (other.hasLastCommitedZxId()) {
        mergeLastCommitedZxId(other.getLastCommitedZxId());
      }
      if (other.hasOldThreshold()) {
        mergeOldThreshold(other.getOldThreshold());
      }
      if (other.hasProposed()) {
        mergeProposed(other.getProposed());
      }
      if (other.hasCommitted()) {
        mergeCommitted(other.getCommitted());
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
      zab.History parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab.History) e.getUnfinishedMessage();
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

    private zab.ZxId oldThreshold_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder> oldThresholdBuilder_;
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public boolean hasOldThreshold() {
      return oldThresholdBuilder_ != null || oldThreshold_ != null;
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public zab.ZxId getOldThreshold() {
      if (oldThresholdBuilder_ == null) {
        return oldThreshold_ == null ? zab.ZxId.getDefaultInstance() : oldThreshold_;
      } else {
        return oldThresholdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public Builder setOldThreshold(zab.ZxId value) {
      if (oldThresholdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        oldThreshold_ = value;
        onChanged();
      } else {
        oldThresholdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public Builder setOldThreshold(
        zab.ZxId.Builder builderForValue) {
      if (oldThresholdBuilder_ == null) {
        oldThreshold_ = builderForValue.build();
        onChanged();
      } else {
        oldThresholdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public Builder mergeOldThreshold(zab.ZxId value) {
      if (oldThresholdBuilder_ == null) {
        if (oldThreshold_ != null) {
          oldThreshold_ =
            zab.ZxId.newBuilder(oldThreshold_).mergeFrom(value).buildPartial();
        } else {
          oldThreshold_ = value;
        }
        onChanged();
      } else {
        oldThresholdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public Builder clearOldThreshold() {
      if (oldThresholdBuilder_ == null) {
        oldThreshold_ = null;
        onChanged();
      } else {
        oldThreshold_ = null;
        oldThresholdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public zab.ZxId.Builder getOldThresholdBuilder() {
      
      onChanged();
      return getOldThresholdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    public zab.ZxIdOrBuilder getOldThresholdOrBuilder() {
      if (oldThresholdBuilder_ != null) {
        return oldThresholdBuilder_.getMessageOrBuilder();
      } else {
        return oldThreshold_ == null ?
            zab.ZxId.getDefaultInstance() : oldThreshold_;
      }
    }
    /**
     * <code>optional .zab.ZxId old_threshold = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder> 
        getOldThresholdFieldBuilder() {
      if (oldThresholdBuilder_ == null) {
        oldThresholdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zab.ZxId, zab.ZxId.Builder, zab.ZxIdOrBuilder>(
                getOldThreshold(),
                getParentForChildren(),
                isClean());
        oldThreshold_ = null;
      }
      return oldThresholdBuilder_;
    }

    private zab.BankTransactionMap proposed_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.BankTransactionMap, zab.BankTransactionMap.Builder, zab.BankTransactionMapOrBuilder> proposedBuilder_;
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public boolean hasProposed() {
      return proposedBuilder_ != null || proposed_ != null;
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public zab.BankTransactionMap getProposed() {
      if (proposedBuilder_ == null) {
        return proposed_ == null ? zab.BankTransactionMap.getDefaultInstance() : proposed_;
      } else {
        return proposedBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public Builder setProposed(zab.BankTransactionMap value) {
      if (proposedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proposed_ = value;
        onChanged();
      } else {
        proposedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public Builder setProposed(
        zab.BankTransactionMap.Builder builderForValue) {
      if (proposedBuilder_ == null) {
        proposed_ = builderForValue.build();
        onChanged();
      } else {
        proposedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public Builder mergeProposed(zab.BankTransactionMap value) {
      if (proposedBuilder_ == null) {
        if (proposed_ != null) {
          proposed_ =
            zab.BankTransactionMap.newBuilder(proposed_).mergeFrom(value).buildPartial();
        } else {
          proposed_ = value;
        }
        onChanged();
      } else {
        proposedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public Builder clearProposed() {
      if (proposedBuilder_ == null) {
        proposed_ = null;
        onChanged();
      } else {
        proposed_ = null;
        proposedBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public zab.BankTransactionMap.Builder getProposedBuilder() {
      
      onChanged();
      return getProposedFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    public zab.BankTransactionMapOrBuilder getProposedOrBuilder() {
      if (proposedBuilder_ != null) {
        return proposedBuilder_.getMessageOrBuilder();
      } else {
        return proposed_ == null ?
            zab.BankTransactionMap.getDefaultInstance() : proposed_;
      }
    }
    /**
     * <code>optional .zab.BankTransactionMap proposed = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.BankTransactionMap, zab.BankTransactionMap.Builder, zab.BankTransactionMapOrBuilder> 
        getProposedFieldBuilder() {
      if (proposedBuilder_ == null) {
        proposedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zab.BankTransactionMap, zab.BankTransactionMap.Builder, zab.BankTransactionMapOrBuilder>(
                getProposed(),
                getParentForChildren(),
                isClean());
        proposed_ = null;
      }
      return proposedBuilder_;
    }

    private zab.BankTransactionMap committed_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.BankTransactionMap, zab.BankTransactionMap.Builder, zab.BankTransactionMapOrBuilder> committedBuilder_;
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public boolean hasCommitted() {
      return committedBuilder_ != null || committed_ != null;
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public zab.BankTransactionMap getCommitted() {
      if (committedBuilder_ == null) {
        return committed_ == null ? zab.BankTransactionMap.getDefaultInstance() : committed_;
      } else {
        return committedBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public Builder setCommitted(zab.BankTransactionMap value) {
      if (committedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        committed_ = value;
        onChanged();
      } else {
        committedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public Builder setCommitted(
        zab.BankTransactionMap.Builder builderForValue) {
      if (committedBuilder_ == null) {
        committed_ = builderForValue.build();
        onChanged();
      } else {
        committedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public Builder mergeCommitted(zab.BankTransactionMap value) {
      if (committedBuilder_ == null) {
        if (committed_ != null) {
          committed_ =
            zab.BankTransactionMap.newBuilder(committed_).mergeFrom(value).buildPartial();
        } else {
          committed_ = value;
        }
        onChanged();
      } else {
        committedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public Builder clearCommitted() {
      if (committedBuilder_ == null) {
        committed_ = null;
        onChanged();
      } else {
        committed_ = null;
        committedBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public zab.BankTransactionMap.Builder getCommittedBuilder() {
      
      onChanged();
      return getCommittedFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    public zab.BankTransactionMapOrBuilder getCommittedOrBuilder() {
      if (committedBuilder_ != null) {
        return committedBuilder_.getMessageOrBuilder();
      } else {
        return committed_ == null ?
            zab.BankTransactionMap.getDefaultInstance() : committed_;
      }
    }
    /**
     * <code>optional .zab.BankTransactionMap committed = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.BankTransactionMap, zab.BankTransactionMap.Builder, zab.BankTransactionMapOrBuilder> 
        getCommittedFieldBuilder() {
      if (committedBuilder_ == null) {
        committedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zab.BankTransactionMap, zab.BankTransactionMap.Builder, zab.BankTransactionMapOrBuilder>(
                getCommitted(),
                getParentForChildren(),
                isClean());
        committed_ = null;
      }
      return committedBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zab.History)
  }

  // @@protoc_insertion_point(class_scope:zab.History)
  private static final zab.History DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab.History();
  }

  public static zab.History getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<History>
      PARSER = new com.google.protobuf.AbstractParser<History>() {
    public History parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new History(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<History> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<History> getParserForType() {
    return PARSER;
  }

  public zab.History getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
