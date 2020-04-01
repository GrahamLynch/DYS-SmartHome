package smarttv;

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
    comments = "Source: smarttv.proto")
public final class SmartTvServiceGrpc {

  private SmartTvServiceGrpc() {}

  public static final String SERVICE_NAME = "smarttv.SmartTvService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOnTVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnTV",
      requestType = smarttv.Empty.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOnTVMethod() {
    io.grpc.MethodDescriptor<smarttv.Empty, smarttv.StringResponse> getTurnOnTVMethod;
    if ((getTurnOnTVMethod = SmartTvServiceGrpc.getTurnOnTVMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getTurnOnTVMethod = SmartTvServiceGrpc.getTurnOnTVMethod) == null) {
          SmartTvServiceGrpc.getTurnOnTVMethod = getTurnOnTVMethod = 
              io.grpc.MethodDescriptor.<smarttv.Empty, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "turnOnTV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("turnOnTV"))
                  .build();
          }
        }
     }
     return getTurnOnTVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOffTVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOffTV",
      requestType = smarttv.Empty.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOffTVMethod() {
    io.grpc.MethodDescriptor<smarttv.Empty, smarttv.StringResponse> getTurnOffTVMethod;
    if ((getTurnOffTVMethod = SmartTvServiceGrpc.getTurnOffTVMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getTurnOffTVMethod = SmartTvServiceGrpc.getTurnOffTVMethod) == null) {
          SmartTvServiceGrpc.getTurnOffTVMethod = getTurnOffTVMethod = 
              io.grpc.MethodDescriptor.<smarttv.Empty, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "turnOffTV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("turnOffTV"))
                  .build();
          }
        }
     }
     return getTurnOffTVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarttv.TvSetting,
      smarttv.StringResponse> getChangeTVSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTVSetting",
      requestType = smarttv.TvSetting.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarttv.TvSetting,
      smarttv.StringResponse> getChangeTVSettingMethod() {
    io.grpc.MethodDescriptor<smarttv.TvSetting, smarttv.StringResponse> getChangeTVSettingMethod;
    if ((getChangeTVSettingMethod = SmartTvServiceGrpc.getChangeTVSettingMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getChangeTVSettingMethod = SmartTvServiceGrpc.getChangeTVSettingMethod) == null) {
          SmartTvServiceGrpc.getChangeTVSettingMethod = getChangeTVSettingMethod = 
              io.grpc.MethodDescriptor.<smarttv.TvSetting, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "changeTVSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.TvSetting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("changeTVSetting"))
                  .build();
          }
        }
     }
     return getChangeTVSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarttv.IntRequest,
      smarttv.StringResponse> getChangeVolumeLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolumeLevel",
      requestType = smarttv.IntRequest.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarttv.IntRequest,
      smarttv.StringResponse> getChangeVolumeLevelMethod() {
    io.grpc.MethodDescriptor<smarttv.IntRequest, smarttv.StringResponse> getChangeVolumeLevelMethod;
    if ((getChangeVolumeLevelMethod = SmartTvServiceGrpc.getChangeVolumeLevelMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getChangeVolumeLevelMethod = SmartTvServiceGrpc.getChangeVolumeLevelMethod) == null) {
          SmartTvServiceGrpc.getChangeVolumeLevelMethod = getChangeVolumeLevelMethod = 
              io.grpc.MethodDescriptor.<smarttv.IntRequest, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "changeVolumeLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.IntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("changeVolumeLevel"))
                  .build();
          }
        }
     }
     return getChangeVolumeLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartTvServiceStub newStub(io.grpc.Channel channel) {
    return new SmartTvServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartTvServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartTvServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartTvServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartTvServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartTvServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOnTV(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnTVMethod(), responseObserver);
    }

    /**
     */
    public void turnOffTV(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffTVMethod(), responseObserver);
    }

    /**
     */
    public void changeTVSetting(smarttv.TvSetting request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeTVSettingMethod(), responseObserver);
    }

    /**
     */
    public void changeVolumeLevel(smarttv.IntRequest request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnTVMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarttv.Empty,
                smarttv.StringResponse>(
                  this, METHODID_TURN_ON_TV)))
          .addMethod(
            getTurnOffTVMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarttv.Empty,
                smarttv.StringResponse>(
                  this, METHODID_TURN_OFF_TV)))
          .addMethod(
            getChangeTVSettingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarttv.TvSetting,
                smarttv.StringResponse>(
                  this, METHODID_CHANGE_TVSETTING)))
          .addMethod(
            getChangeVolumeLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarttv.IntRequest,
                smarttv.StringResponse>(
                  this, METHODID_CHANGE_VOLUME_LEVEL)))
          .build();
    }
  }

  /**
   */
  public static final class SmartTvServiceStub extends io.grpc.stub.AbstractStub<SmartTvServiceStub> {
    private SmartTvServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartTvServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartTvServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartTvServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOnTV(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnTVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffTV(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffTVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeTVSetting(smarttv.TvSetting request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeTVSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolumeLevel(smarttv.IntRequest request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeVolumeLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartTvServiceBlockingStub extends io.grpc.stub.AbstractStub<SmartTvServiceBlockingStub> {
    private SmartTvServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartTvServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartTvServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartTvServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smarttv.StringResponse turnOnTV(smarttv.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnTVMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarttv.StringResponse turnOffTV(smarttv.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffTVMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarttv.StringResponse changeTVSetting(smarttv.TvSetting request) {
      return blockingUnaryCall(
          getChannel(), getChangeTVSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarttv.StringResponse changeVolumeLevel(smarttv.IntRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeVolumeLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartTvServiceFutureStub extends io.grpc.stub.AbstractStub<SmartTvServiceFutureStub> {
    private SmartTvServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartTvServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartTvServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartTvServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarttv.StringResponse> turnOnTV(
        smarttv.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnTVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarttv.StringResponse> turnOffTV(
        smarttv.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffTVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarttv.StringResponse> changeTVSetting(
        smarttv.TvSetting request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeTVSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarttv.StringResponse> changeVolumeLevel(
        smarttv.IntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeVolumeLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_TV = 0;
  private static final int METHODID_TURN_OFF_TV = 1;
  private static final int METHODID_CHANGE_TVSETTING = 2;
  private static final int METHODID_CHANGE_VOLUME_LEVEL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartTvServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartTvServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_TV:
          serviceImpl.turnOnTV((smarttv.Empty) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_TV:
          serviceImpl.turnOffTV((smarttv.Empty) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TVSETTING:
          serviceImpl.changeTVSetting((smarttv.TvSetting) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME_LEVEL:
          serviceImpl.changeVolumeLevel((smarttv.IntRequest) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
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

  private static abstract class SmartTvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartTvServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smarttv.Smarttv.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartTvService");
    }
  }

  private static final class SmartTvServiceFileDescriptorSupplier
      extends SmartTvServiceBaseDescriptorSupplier {
    SmartTvServiceFileDescriptorSupplier() {}
  }

  private static final class SmartTvServiceMethodDescriptorSupplier
      extends SmartTvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartTvServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartTvServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartTvServiceFileDescriptorSupplier())
              .addMethod(getTurnOnTVMethod())
              .addMethod(getTurnOffTVMethod())
              .addMethod(getChangeTVSettingMethod())
              .addMethod(getChangeVolumeLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
