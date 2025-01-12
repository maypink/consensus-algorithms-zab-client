// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zab_peer.proto

package zab_peer;

/**
 * Protobuf type {@code zab_peer.ElectionRequest}
 */
public  final class ElectionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zab_peer.ElectionRequest)
    ElectionRequestOrBuilder {
  // Use ElectionRequest.newBuilder() to construct.
  private ElectionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ElectionRequest() {
    id_ = 0;
    state_ = 0;
    round_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ElectionRequest(
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
            zab.Vote.Builder subBuilder = null;
            if (vote_ != null) {
              subBuilder = vote_.toBuilder();
            }
            vote_ = input.readMessage(zab.Vote.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vote_);
              vote_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            id_ = input.readUInt32();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          case 32: {

            round_ = input.readUInt32();
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
    return zab_peer.ZabPeer.internal_static_zab_peer_ElectionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zab_peer.ZabPeer.internal_static_zab_peer_ElectionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zab_peer.ElectionRequest.class, zab_peer.ElectionRequest.Builder.class);
  }

  public static final int VOTE_FIELD_NUMBER = 1;
  private zab.Vote vote_;
  /**
   * <code>optional .zab.Vote vote = 1;</code>
   */
  public boolean hasVote() {
    return vote_ != null;
  }
  /**
   * <code>optional .zab.Vote vote = 1;</code>
   */
  public zab.Vote getVote() {
    return vote_ == null ? zab.Vote.getDefaultInstance() : vote_;
  }
  /**
   * <code>optional .zab.Vote vote = 1;</code>
   */
  public zab.VoteOrBuilder getVoteOrBuilder() {
    return getVote();
  }

  public static final int ID_FIELD_NUMBER = 2;
  private int id_;
  /**
   * <code>optional uint32 id = 2;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_;
  /**
   * <code>optional .zab.State state = 3;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <code>optional .zab.State state = 3;</code>
   */
  public zab.State getState() {
    zab.State result = zab.State.valueOf(state_);
    return result == null ? zab.State.UNRECOGNIZED : result;
  }

  public static final int ROUND_FIELD_NUMBER = 4;
  private int round_;
  /**
   * <code>optional uint32 round = 4;</code>
   */
  public int getRound() {
    return round_;
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
    if (vote_ != null) {
      output.writeMessage(1, getVote());
    }
    if (id_ != 0) {
      output.writeUInt32(2, id_);
    }
    if (state_ != zab.State.Election.getNumber()) {
      output.writeEnum(3, state_);
    }
    if (round_ != 0) {
      output.writeUInt32(4, round_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vote_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVote());
    }
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, id_);
    }
    if (state_ != zab.State.Election.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, state_);
    }
    if (round_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, round_);
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
    if (!(obj instanceof zab_peer.ElectionRequest)) {
      return super.equals(obj);
    }
    zab_peer.ElectionRequest other = (zab_peer.ElectionRequest) obj;

    boolean result = true;
    result = result && (hasVote() == other.hasVote());
    if (hasVote()) {
      result = result && getVote()
          .equals(other.getVote());
    }
    result = result && (getId()
        == other.getId());
    result = result && state_ == other.state_;
    result = result && (getRound()
        == other.getRound());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasVote()) {
      hash = (37 * hash) + VOTE_FIELD_NUMBER;
      hash = (53 * hash) + getVote().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + ROUND_FIELD_NUMBER;
    hash = (53 * hash) + getRound();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zab_peer.ElectionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_peer.ElectionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_peer.ElectionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zab_peer.ElectionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zab_peer.ElectionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_peer.ElectionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_peer.ElectionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zab_peer.ElectionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zab_peer.ElectionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zab_peer.ElectionRequest parseFrom(
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
  public static Builder newBuilder(zab_peer.ElectionRequest prototype) {
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
   * Protobuf type {@code zab_peer.ElectionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zab_peer.ElectionRequest)
      zab_peer.ElectionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zab_peer.ZabPeer.internal_static_zab_peer_ElectionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zab_peer.ZabPeer.internal_static_zab_peer_ElectionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zab_peer.ElectionRequest.class, zab_peer.ElectionRequest.Builder.class);
    }

    // Construct using zab_peer.ElectionRequest.newBuilder()
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
      if (voteBuilder_ == null) {
        vote_ = null;
      } else {
        vote_ = null;
        voteBuilder_ = null;
      }
      id_ = 0;

      state_ = 0;

      round_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zab_peer.ZabPeer.internal_static_zab_peer_ElectionRequest_descriptor;
    }

    public zab_peer.ElectionRequest getDefaultInstanceForType() {
      return zab_peer.ElectionRequest.getDefaultInstance();
    }

    public zab_peer.ElectionRequest build() {
      zab_peer.ElectionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public zab_peer.ElectionRequest buildPartial() {
      zab_peer.ElectionRequest result = new zab_peer.ElectionRequest(this);
      if (voteBuilder_ == null) {
        result.vote_ = vote_;
      } else {
        result.vote_ = voteBuilder_.build();
      }
      result.id_ = id_;
      result.state_ = state_;
      result.round_ = round_;
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
      if (other instanceof zab_peer.ElectionRequest) {
        return mergeFrom((zab_peer.ElectionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zab_peer.ElectionRequest other) {
      if (other == zab_peer.ElectionRequest.getDefaultInstance()) return this;
      if (other.hasVote()) {
        mergeVote(other.getVote());
      }
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getRound() != 0) {
        setRound(other.getRound());
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
      zab_peer.ElectionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zab_peer.ElectionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private zab.Vote vote_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.Vote, zab.Vote.Builder, zab.VoteOrBuilder> voteBuilder_;
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public boolean hasVote() {
      return voteBuilder_ != null || vote_ != null;
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public zab.Vote getVote() {
      if (voteBuilder_ == null) {
        return vote_ == null ? zab.Vote.getDefaultInstance() : vote_;
      } else {
        return voteBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public Builder setVote(zab.Vote value) {
      if (voteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vote_ = value;
        onChanged();
      } else {
        voteBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public Builder setVote(
        zab.Vote.Builder builderForValue) {
      if (voteBuilder_ == null) {
        vote_ = builderForValue.build();
        onChanged();
      } else {
        voteBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public Builder mergeVote(zab.Vote value) {
      if (voteBuilder_ == null) {
        if (vote_ != null) {
          vote_ =
            zab.Vote.newBuilder(vote_).mergeFrom(value).buildPartial();
        } else {
          vote_ = value;
        }
        onChanged();
      } else {
        voteBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public Builder clearVote() {
      if (voteBuilder_ == null) {
        vote_ = null;
        onChanged();
      } else {
        vote_ = null;
        voteBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public zab.Vote.Builder getVoteBuilder() {
      
      onChanged();
      return getVoteFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    public zab.VoteOrBuilder getVoteOrBuilder() {
      if (voteBuilder_ != null) {
        return voteBuilder_.getMessageOrBuilder();
      } else {
        return vote_ == null ?
            zab.Vote.getDefaultInstance() : vote_;
      }
    }
    /**
     * <code>optional .zab.Vote vote = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        zab.Vote, zab.Vote.Builder, zab.VoteOrBuilder> 
        getVoteFieldBuilder() {
      if (voteBuilder_ == null) {
        voteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            zab.Vote, zab.Vote.Builder, zab.VoteOrBuilder>(
                getVote(),
                getParentForChildren(),
                isClean());
        vote_ = null;
      }
      return voteBuilder_;
    }

    private int id_ ;
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>optional .zab.State state = 3;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <code>optional .zab.State state = 3;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .zab.State state = 3;</code>
     */
    public zab.State getState() {
      zab.State result = zab.State.valueOf(state_);
      return result == null ? zab.State.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .zab.State state = 3;</code>
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
     * <code>optional .zab.State state = 3;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }

    private int round_ ;
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public int getRound() {
      return round_;
    }
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public Builder setRound(int value) {
      
      round_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public Builder clearRound() {
      
      round_ = 0;
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


    // @@protoc_insertion_point(builder_scope:zab_peer.ElectionRequest)
  }

  // @@protoc_insertion_point(class_scope:zab_peer.ElectionRequest)
  private static final zab_peer.ElectionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zab_peer.ElectionRequest();
  }

  public static zab_peer.ElectionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ElectionRequest>
      PARSER = new com.google.protobuf.AbstractParser<ElectionRequest>() {
    public ElectionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ElectionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ElectionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ElectionRequest> getParserForType() {
    return PARSER;
  }

  public zab_peer.ElectionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
