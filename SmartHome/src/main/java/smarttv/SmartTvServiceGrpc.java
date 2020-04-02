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
      smarttv.StringResponse> getTurnOnTvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnTv",
      requestType = smarttv.Empty.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOnTvMethod() {
    io.grpc.MethodDescriptor<smarttv.Empty, smarttv.StringResponse> getTurnOnTvMethod;
    if ((getTurnOnTvMethod = SmartTvServiceGrpc.getTurnOnTvMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getTurnOnTvMethod = SmartTvServiceGrpc.getTurnOnTvMethod) == null) {
          SmartTvServiceGrpc.getTurnOnTvMethod = getTurnOnTvMethod = 
              io.grpc.MethodDescriptor.<smarttv.Empty, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "turnOnTv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("turnOnTv"))
                  .build();
          }
        }
     }
     return getTurnOnTvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOffTvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOffTv",
      requestType = smarttv.Empty.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarttv.Empty,
      smarttv.StringResponse> getTurnOffTvMethod() {
    io.grpc.MethodDescriptor<smarttv.Empty, smarttv.StringResponse> getTurnOffTvMethod;
    if ((getTurnOffTvMethod = SmartTvServiceGrpc.getTurnOffTvMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getTurnOffTvMethod = SmartTvServiceGrpc.getTurnOffTvMethod) == null) {
          SmartTvServiceGrpc.getTurnOffTvMethod = getTurnOffTvMethod = 
              io.grpc.MethodDescriptor.<smarttv.Empty, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "turnOffTv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("turnOffTv"))
                  .build();
          }
        }
     }
     return getTurnOffTvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarttv.StringRequest,
      smarttv.StringResponse> getConnectToWifiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connectToWifi",
      requestType = smarttv.StringRequest.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smarttv.StringRequest,
      smarttv.StringResponse> getConnectToWifiMethod() {
    io.grpc.MethodDescriptor<smarttv.StringRequest, smarttv.StringResponse> getConnectToWifiMethod;
    if ((getConnectToWifiMethod = SmartTvServiceGrpc.getConnectToWifiMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getConnectToWifiMethod = SmartTvServiceGrpc.getConnectToWifiMethod) == null) {
          SmartTvServiceGrpc.getConnectToWifiMethod = getConnectToWifiMethod = 
              io.grpc.MethodDescriptor.<smarttv.StringRequest, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "connectToWifi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("connectToWifi"))
                  .build();
          }
        }
     }
     return getConnectToWifiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarttv.StringRequest,
      smarttv.StringResponse> getChangeChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeChannel",
      requestType = smarttv.StringRequest.class,
      responseType = smarttv.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smarttv.StringRequest,
      smarttv.StringResponse> getChangeChannelMethod() {
    io.grpc.MethodDescriptor<smarttv.StringRequest, smarttv.StringResponse> getChangeChannelMethod;
    if ((getChangeChannelMethod = SmartTvServiceGrpc.getChangeChannelMethod) == null) {
      synchronized (SmartTvServiceGrpc.class) {
        if ((getChangeChannelMethod = SmartTvServiceGrpc.getChangeChannelMethod) == null) {
          SmartTvServiceGrpc.getChangeChannelMethod = getChangeChannelMethod = 
              io.grpc.MethodDescriptor.<smarttv.StringRequest, smarttv.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smarttv.SmartTvService", "changeChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarttv.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartTvServiceMethodDescriptorSupplier("changeChannel"))
                  .build();
          }
        }
     }
     return getChangeChannelMethod;
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
    public void turnOnTv(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnTvMethod(), responseObserver);
    }

    /**
     */
    public void turnOffTv(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffTvMethod(), responseObserver);
    }

    /**
     */
    public void connectToWifi(smarttv.StringRequest request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectToWifiMethod(), responseObserver);
    }

    /**
     */
    public void changeChannel(smarttv.StringRequest request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeChannelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnTvMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarttv.Empty,
                smarttv.StringResponse>(
                  this, METHODID_TURN_ON_TV)))
          .addMethod(
            getTurnOffTvMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarttv.Empty,
                smarttv.StringResponse>(
                  this, METHODID_TURN_OFF_TV)))
          .addMethod(
            getConnectToWifiMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                smarttv.StringRequest,
                smarttv.StringResponse>(
                  this, METHODID_CONNECT_TO_WIFI)))
          .addMethod(
            getChangeChannelMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                smarttv.StringRequest,
                smarttv.StringResponse>(
                  this, METHODID_CHANGE_CHANNEL)))
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
    public void turnOnTv(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnTvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffTv(smarttv.Empty request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffTvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void connectToWifi(smarttv.StringRequest request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getConnectToWifiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeChannel(smarttv.StringRequest request,
        io.grpc.stub.StreamObserver<smarttv.StringResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeChannelMethod(), getCallOptions()), request, responseObserver);
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
    public smarttv.StringResponse turnOnTv(smarttv.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnTvMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarttv.StringResponse turnOffTv(smarttv.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffTvMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<smarttv.StringResponse> connectToWifi(
        smarttv.StringRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getConnectToWifiMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<smarttv.StringResponse> changeChannel(
        smarttv.StringRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeChannelMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<smarttv.StringResponse> turnOnTv(
        smarttv.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnTvMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarttv.StringResponse> turnOffTv(
        smarttv.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffTvMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_TV = 0;
  private static final int METHODID_TURN_OFF_TV = 1;
  private static final int METHODID_CONNECT_TO_WIFI = 2;
  private static final int METHODID_CHANGE_CHANNEL = 3;

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
          serviceImpl.turnOnTv((smarttv.Empty) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_TV:
          serviceImpl.turnOffTv((smarttv.Empty) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
          break;
        case METHODID_CONNECT_TO_WIFI:
          serviceImpl.connectToWifi((smarttv.StringRequest) request,
              (io.grpc.stub.StreamObserver<smarttv.StringResponse>) responseObserver);
          break;
        case METHODID_CHANGE_CHANNEL:
          serviceImpl.changeChannel((smarttv.StringRequest) request,
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
              .addMethod(getTurnOnTvMethod())
              .addMethod(getTurnOffTvMethod())
              .addMethod(getConnectToWifiMethod())
              .addMethod(getChangeChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
