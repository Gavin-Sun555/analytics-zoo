// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: az_inference.proto

package com.intel.analytics.zoo.grpc.generated.azinference;

public final class AZInferenceProto {
  private AZInferenceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azinference_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_azinference_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azinference_Prediction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_azinference_Prediction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022az_inference.proto\022\013azinference\032\033googl" +
      "e/protobuf/empty.proto\"\035\n\007Content\022\022\n\nenc" +
      "odedStr\030\001 \001(\t\" \n\nPrediction\022\022\n\npredictSt" +
      "r\030\001 \001(\t2K\n\013AZInference\022<\n\tdoPredict\022\024.az" +
      "inference.Content\032\027.azinference.Predicti" +
      "on\"\000BN\n2com.intel.analytics.zoo.grpc.gen" +
      "erated.azinferenceB\020AZInferenceProtoP\001\242\002" +
      "\003RTGb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_azinference_Content_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_azinference_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_azinference_Content_descriptor,
        new String[] { "EncodedStr", });
    internal_static_azinference_Prediction_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_azinference_Prediction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_azinference_Prediction_descriptor,
        new String[] { "PredictStr", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
