// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontEndGRPC.proto

package com.intel.analytics.zoo.serving.grpc.service.generated;

/**
 * Protobuf type {@code grpc.PredictReq}
 */
public  final class PredictReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.PredictReq)
    PredictReqOrBuilder {
  // Use PredictReq.newBuilder() to construct.
  private PredictReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PredictReq() {
    modelName_ = "";
    modelVersion_ = "";
    input_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PredictReq(
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
            String s = input.readStringRequireUtf8();

            modelName_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            modelVersion_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            input_ = s;
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
    return GrpcFrontEndProto.internal_static_grpc_PredictReq_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GrpcFrontEndProto.internal_static_grpc_PredictReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PredictReq.class, PredictReq.Builder.class);
  }

  public static final int MODELNAME_FIELD_NUMBER = 1;
  private volatile Object modelName_;
  /**
   * <code>optional string modelName = 1;</code>
   */
  public String getModelName() {
    Object ref = modelName_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      modelName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string modelName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getModelNameBytes() {
    Object ref = modelName_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      modelName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODELVERSION_FIELD_NUMBER = 2;
  private volatile Object modelVersion_;
  /**
   * <code>optional string modelVersion = 2;</code>
   */
  public String getModelVersion() {
    Object ref = modelVersion_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      modelVersion_ = s;
      return s;
    }
  }
  /**
   * <code>optional string modelVersion = 2;</code>
   */
  public com.google.protobuf.ByteString
      getModelVersionBytes() {
    Object ref = modelVersion_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      modelVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_FIELD_NUMBER = 3;
  private volatile Object input_;
  /**
   * <code>optional string input = 3;</code>
   */
  public String getInput() {
    Object ref = input_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      input_ = s;
      return s;
    }
  }
  /**
   * <code>optional string input = 3;</code>
   */
  public com.google.protobuf.ByteString
      getInputBytes() {
    Object ref = input_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      input_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getModelNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, modelName_);
    }
    if (!getModelVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, modelVersion_);
    }
    if (!getInputBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, input_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getModelNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, modelName_);
    }
    if (!getModelVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, modelVersion_);
    }
    if (!getInputBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, input_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof PredictReq)) {
      return super.equals(obj);
    }
    PredictReq other = (PredictReq) obj;

    boolean result = true;
    result = result && getModelName()
        .equals(other.getModelName());
    result = result && getModelVersion()
        .equals(other.getModelVersion());
    result = result && getInput()
        .equals(other.getInput());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MODELNAME_FIELD_NUMBER;
    hash = (53 * hash) + getModelName().hashCode();
    hash = (37 * hash) + MODELVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getModelVersion().hashCode();
    hash = (37 * hash) + INPUT_FIELD_NUMBER;
    hash = (53 * hash) + getInput().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PredictReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PredictReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PredictReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PredictReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PredictReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PredictReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PredictReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PredictReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PredictReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PredictReq parseFrom(
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
  public static Builder newBuilder(PredictReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.PredictReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.PredictReq)
      PredictReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GrpcFrontEndProto.internal_static_grpc_PredictReq_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GrpcFrontEndProto.internal_static_grpc_PredictReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PredictReq.class, PredictReq.Builder.class);
    }

    // Construct using com.intel.analytics.zoo.serving.grpc.service.com.intel.analytics.zoo.serving.generated.PredictReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      modelName_ = "";

      modelVersion_ = "";

      input_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GrpcFrontEndProto.internal_static_grpc_PredictReq_descriptor;
    }

    public PredictReq getDefaultInstanceForType() {
      return PredictReq.getDefaultInstance();
    }

    public PredictReq build() {
      PredictReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public PredictReq buildPartial() {
      PredictReq result = new PredictReq(this);
      result.modelName_ = modelName_;
      result.modelVersion_ = modelVersion_;
      result.input_ = input_;
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
      if (other instanceof PredictReq) {
        return mergeFrom((PredictReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PredictReq other) {
      if (other == PredictReq.getDefaultInstance()) return this;
      if (!other.getModelName().isEmpty()) {
        modelName_ = other.modelName_;
        onChanged();
      }
      if (!other.getModelVersion().isEmpty()) {
        modelVersion_ = other.modelVersion_;
        onChanged();
      }
      if (!other.getInput().isEmpty()) {
        input_ = other.input_;
        onChanged();
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
      PredictReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (PredictReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object modelName_ = "";
    /**
     * <code>optional string modelName = 1;</code>
     */
    public String getModelName() {
      Object ref = modelName_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        modelName_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getModelNameBytes() {
      Object ref = modelName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        modelName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public Builder setModelName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      modelName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public Builder clearModelName() {

      modelName_ = getDefaultInstance().getModelName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string modelName = 1;</code>
     */
    public Builder setModelNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      modelName_ = value;
      onChanged();
      return this;
    }

    private Object modelVersion_ = "";
    /**
     * <code>optional string modelVersion = 2;</code>
     */
    public String getModelVersion() {
      Object ref = modelVersion_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        modelVersion_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string modelVersion = 2;</code>
     */
    public com.google.protobuf.ByteString
        getModelVersionBytes() {
      Object ref = modelVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        modelVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string modelVersion = 2;</code>
     */
    public Builder setModelVersion(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      modelVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string modelVersion = 2;</code>
     */
    public Builder clearModelVersion() {

      modelVersion_ = getDefaultInstance().getModelVersion();
      onChanged();
      return this;
    }
    /**
     * <code>optional string modelVersion = 2;</code>
     */
    public Builder setModelVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      modelVersion_ = value;
      onChanged();
      return this;
    }

    private Object input_ = "";
    /**
     * <code>optional string input = 3;</code>
     */
    public String getInput() {
      Object ref = input_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        input_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string input = 3;</code>
     */
    public com.google.protobuf.ByteString
        getInputBytes() {
      Object ref = input_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        input_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string input = 3;</code>
     */
    public Builder setInput(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      input_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string input = 3;</code>
     */
    public Builder clearInput() {

      input_ = getDefaultInstance().getInput();
      onChanged();
      return this;
    }
    /**
     * <code>optional string input = 3;</code>
     */
    public Builder setInputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      input_ = value;
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


    // @@protoc_insertion_point(builder_scope:grpc.PredictReq)
  }

  // @@protoc_insertion_point(class_scope:grpc.PredictReq)
  private static final PredictReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PredictReq();
  }

  public static PredictReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredictReq>
      PARSER = new com.google.protobuf.AbstractParser<PredictReq>() {
    public PredictReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PredictReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PredictReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PredictReq> getParserForType() {
    return PARSER;
  }

  public PredictReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

