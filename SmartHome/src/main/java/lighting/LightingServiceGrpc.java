package lighting;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: lighting.proto")
public final class LightingServiceGrpc {

  private LightingServiceGrpc() {}

  public static final String SERVICE_NAME = "lighting.LightingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lighting.Empty,
      lighting.StringResponse> getTurnOnLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnLights",
      requestType = lighting.Empty.class,
      responseType = lighting.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lighting.Empty,
      lighting.StringResponse> getTurnOnLightsMethod() {
    io.grpc.MethodDescriptor<lighting.Empty, lighting.StringResponse> getTurnOnLightsMethod;
    if ((getTurnOnLightsMethod = LightingServiceGrpc.getTurnOnLightsMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getTurnOnLightsMethod = LightingServiceGrpc.getTurnOnLightsMethod) == null) {
          LightingServiceGrpc.getTurnOnLightsMethod = getTurnOnLightsMethod = 
              io.grpc.MethodDescriptor.<lighting.Empty, lighting.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lighting.LightingService", "turnOnLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("turnOnLights"))
                  .build();
          }
        }
     }
     return getTurnOnLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lighting.Empty,
      lighting.StringResponse> getTurnOffLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOffLights",
      requestType = lighting.Empty.class,
      responseType = lighting.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lighting.Empty,
      lighting.StringResponse> getTurnOffLightsMethod() {
    io.grpc.MethodDescriptor<lighting.Empty, lighting.StringResponse> getTurnOffLightsMethod;
    if ((getTurnOffLightsMethod = LightingServiceGrpc.getTurnOffLightsMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getTurnOffLightsMethod = LightingServiceGrpc.getTurnOffLightsMethod) == null) {
          LightingServiceGrpc.getTurnOffLightsMethod = getTurnOffLightsMethod = 
              io.grpc.MethodDescriptor.<lighting.Empty, lighting.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lighting.LightingService", "turnOffLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("turnOffLights"))
                  .build();
          }
        }
     }
     return getTurnOffLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lighting.LightsSetting,
      lighting.StringResponse> getChangeLightsSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeLightsSetting",
      requestType = lighting.LightsSetting.class,
      responseType = lighting.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lighting.LightsSetting,
      lighting.StringResponse> getChangeLightsSettingMethod() {
    io.grpc.MethodDescriptor<lighting.LightsSetting, lighting.StringResponse> getChangeLightsSettingMethod;
    if ((getChangeLightsSettingMethod = LightingServiceGrpc.getChangeLightsSettingMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getChangeLightsSettingMethod = LightingServiceGrpc.getChangeLightsSettingMethod) == null) {
          LightingServiceGrpc.getChangeLightsSettingMethod = getChangeLightsSettingMethod = 
              io.grpc.MethodDescriptor.<lighting.LightsSetting, lighting.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lighting.LightingService", "changeLightsSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.LightsSetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("changeLightsSetting"))
                  .build();
          }
        }
     }
     return getChangeLightsSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lighting.IntRequest,
      lighting.StringResponse> getChangeLightingLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeLightingLevel",
      requestType = lighting.IntRequest.class,
      responseType = lighting.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lighting.IntRequest,
      lighting.StringResponse> getChangeLightingLevelMethod() {
    io.grpc.MethodDescriptor<lighting.IntRequest, lighting.StringResponse> getChangeLightingLevelMethod;
    if ((getChangeLightingLevelMethod = LightingServiceGrpc.getChangeLightingLevelMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getChangeLightingLevelMethod = LightingServiceGrpc.getChangeLightingLevelMethod) == null) {
          LightingServiceGrpc.getChangeLightingLevelMethod = getChangeLightingLevelMethod = 
              io.grpc.MethodDescriptor.<lighting.IntRequest, lighting.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lighting.LightingService", "changeLightingLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.IntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("changeLightingLevel"))
                  .build();
          }
        }
     }
     return getChangeLightingLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightingServiceStub newStub(io.grpc.Channel channel) {
    return new LightingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LightingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOnLights(lighting.Empty request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnLightsMethod(), responseObserver);
    }

    /**
     */
    public void turnOffLights(lighting.Empty request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffLightsMethod(), responseObserver);
    }

    /**
     */
    public void changeLightsSetting(lighting.LightsSetting request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeLightsSettingMethod(), responseObserver);
    }

    /**
     */
    public void changeLightingLevel(lighting.IntRequest request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeLightingLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lighting.Empty,
                lighting.StringResponse>(
                  this, METHODID_TURN_ON_LIGHTS)))
          .addMethod(
            getTurnOffLightsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lighting.Empty,
                lighting.StringResponse>(
                  this, METHODID_TURN_OFF_LIGHTS)))
          .addMethod(
            getChangeLightsSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lighting.LightsSetting,
                lighting.StringResponse>(
                  this, METHODID_CHANGE_LIGHTS_SETTING)))
          .addMethod(
            getChangeLightingLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                lighting.IntRequest,
                lighting.StringResponse>(
                  this, METHODID_CHANGE_LIGHTING_LEVEL)))
          .build();
    }
  }

  /**
   */
  public static final class LightingServiceStub extends io.grpc.stub.AbstractStub<LightingServiceStub> {
    private LightingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOnLights(lighting.Empty request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffLights(lighting.Empty request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeLightsSetting(lighting.LightsSetting request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeLightsSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeLightingLevel(lighting.IntRequest request,
        io.grpc.stub.StreamObserver<lighting.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeLightingLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LightingServiceBlockingStub extends io.grpc.stub.AbstractStub<LightingServiceBlockingStub> {
    private LightingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public lighting.StringResponse turnOnLights(lighting.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public lighting.StringResponse turnOffLights(lighting.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffLightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public lighting.StringResponse changeLightsSetting(lighting.LightsSetting request) {
      return blockingUnaryCall(
          getChannel(), getChangeLightsSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public lighting.StringResponse changeLightingLevel(lighting.IntRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeLightingLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LightingServiceFutureStub extends io.grpc.stub.AbstractStub<LightingServiceFutureStub> {
    private LightingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lighting.StringResponse> turnOnLights(
        lighting.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lighting.StringResponse> turnOffLights(
        lighting.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffLightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lighting.StringResponse> changeLightsSetting(
        lighting.LightsSetting request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeLightsSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lighting.StringResponse> changeLightingLevel(
        lighting.IntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeLightingLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_LIGHTS = 0;
  private static final int METHODID_TURN_OFF_LIGHTS = 1;
  private static final int METHODID_CHANGE_LIGHTS_SETTING = 2;
  private static final int METHODID_CHANGE_LIGHTING_LEVEL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_LIGHTS:
          serviceImpl.turnOnLights((lighting.Empty) request,
              (io.grpc.stub.StreamObserver<lighting.StringResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_LIGHTS:
          serviceImpl.turnOffLights((lighting.Empty) request,
              (io.grpc.stub.StreamObserver<lighting.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_LIGHTS_SETTING:
          serviceImpl.changeLightsSetting((lighting.LightsSetting) request,
              (io.grpc.stub.StreamObserver<lighting.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_LIGHTING_LEVEL:
          serviceImpl.changeLightingLevel((lighting.IntRequest) request,
              (io.grpc.stub.StreamObserver<lighting.StringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lighting.Lighting.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightingService");
    }
  }

  private static final class LightingServiceFileDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier {
    LightingServiceFileDescriptorSupplier() {}
  }

  private static final class LightingServiceMethodDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LightingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightingServiceFileDescriptorSupplier())
              .addMethod(getTurnOnLightsMethod())
              .addMethod(getTurnOffLightsMethod())
              .addMethod(getChangeLightsSettingMethod())
              .addMethod(getChangeLightingLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
