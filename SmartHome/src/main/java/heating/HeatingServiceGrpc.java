package heating;

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
    comments = "Source: heating.proto")
public final class HeatingServiceGrpc {

  private HeatingServiceGrpc() {}

  public static final String SERVICE_NAME = "heating.HeatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<heating.IntRequest,
      heating.StringResponse> getSetHeatingTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setHeatingTemp",
      requestType = heating.IntRequest.class,
      responseType = heating.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<heating.IntRequest,
      heating.StringResponse> getSetHeatingTempMethod() {
    io.grpc.MethodDescriptor<heating.IntRequest, heating.StringResponse> getSetHeatingTempMethod;
    if ((getSetHeatingTempMethod = HeatingServiceGrpc.getSetHeatingTempMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getSetHeatingTempMethod = HeatingServiceGrpc.getSetHeatingTempMethod) == null) {
          HeatingServiceGrpc.getSetHeatingTempMethod = getSetHeatingTempMethod = 
              io.grpc.MethodDescriptor.<heating.IntRequest, heating.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeatingService", "setHeatingTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.IntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("setHeatingTemp"))
                  .build();
          }
        }
     }
     return getSetHeatingTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<heating.Empty,
      heating.IntResponse> getGetCurrentHeatingTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentHeatingTemp",
      requestType = heating.Empty.class,
      responseType = heating.IntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<heating.Empty,
      heating.IntResponse> getGetCurrentHeatingTempMethod() {
    io.grpc.MethodDescriptor<heating.Empty, heating.IntResponse> getGetCurrentHeatingTempMethod;
    if ((getGetCurrentHeatingTempMethod = HeatingServiceGrpc.getGetCurrentHeatingTempMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getGetCurrentHeatingTempMethod = HeatingServiceGrpc.getGetCurrentHeatingTempMethod) == null) {
          HeatingServiceGrpc.getGetCurrentHeatingTempMethod = getGetCurrentHeatingTempMethod = 
              io.grpc.MethodDescriptor.<heating.Empty, heating.IntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeatingService", "getCurrentHeatingTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  heating.IntResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("getCurrentHeatingTemp"))
                  .build();
          }
        }
     }
     return getGetCurrentHeatingTempMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatingServiceStub newStub(io.grpc.Channel channel) {
    return new HeatingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeatingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeatingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setHeatingTemp(heating.IntRequest request,
        io.grpc.stub.StreamObserver<heating.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetHeatingTempMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentHeatingTemp(heating.Empty request,
        io.grpc.stub.StreamObserver<heating.IntResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentHeatingTempMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetHeatingTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                heating.IntRequest,
                heating.StringResponse>(
                  this, METHODID_SET_HEATING_TEMP)))
          .addMethod(
            getGetCurrentHeatingTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                heating.Empty,
                heating.IntResponse>(
                  this, METHODID_GET_CURRENT_HEATING_TEMP)))
          .build();
    }
  }

  /**
   */
  public static final class HeatingServiceStub extends io.grpc.stub.AbstractStub<HeatingServiceStub> {
    private HeatingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void setHeatingTemp(heating.IntRequest request,
        io.grpc.stub.StreamObserver<heating.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetHeatingTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentHeatingTemp(heating.Empty request,
        io.grpc.stub.StreamObserver<heating.IntResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentHeatingTempMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeatingServiceBlockingStub extends io.grpc.stub.AbstractStub<HeatingServiceBlockingStub> {
    private HeatingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public heating.StringResponse setHeatingTemp(heating.IntRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetHeatingTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public heating.IntResponse getCurrentHeatingTemp(heating.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentHeatingTempMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeatingServiceFutureStub extends io.grpc.stub.AbstractStub<HeatingServiceFutureStub> {
    private HeatingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<heating.StringResponse> setHeatingTemp(
        heating.IntRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetHeatingTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<heating.IntResponse> getCurrentHeatingTemp(
        heating.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentHeatingTempMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_HEATING_TEMP = 0;
  private static final int METHODID_GET_CURRENT_HEATING_TEMP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_HEATING_TEMP:
          serviceImpl.setHeatingTemp((heating.IntRequest) request,
              (io.grpc.stub.StreamObserver<heating.StringResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_HEATING_TEMP:
          serviceImpl.getCurrentHeatingTemp((heating.Empty) request,
              (io.grpc.stub.StreamObserver<heating.IntResponse>) responseObserver);
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

  private static abstract class HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return heating.Heating.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeatingService");
    }
  }

  private static final class HeatingServiceFileDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier {
    HeatingServiceFileDescriptorSupplier() {}
  }

  private static final class HeatingServiceMethodDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatingServiceFileDescriptorSupplier())
              .addMethod(getSetHeatingTempMethod())
              .addMethod(getGetCurrentHeatingTempMethod())
              .build();
        }
      }
    }
    return result;
  }
}
