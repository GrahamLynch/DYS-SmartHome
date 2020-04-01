package lighting;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lighting.LightingServiceGrpc.LightingServiceImplBase;

import java.io.IOException;
import java.util.logging.Logger;

public class LightingServer extends LightingServiceImplBase {
	String lightStatus;
	String lightResponse;
	private LightsSetting.Setting setting;
	private StringResponse response;
	int lightningLevel = 0;
	private static final Logger logger = Logger.getLogger(LightingServer.class.getName());
	public static void main(final String args[]) throws IOException , InterruptedException {
	LightingServer lightingServer = new LightingServer();
	int port = 50051;
	
    Server server = ServerBuilder.forPort(port)
	        .addService(lightingServer)
	        .build()
	        .start();
	    
    System.out.println ("Server is listening" +port);
	    		    
	    server.awaitTermination();
 }
@Override	
public void turnOnLights(final Empty request,final StreamObserver<StringResponse> responseObserver) {
	lightStatus = "On";
	lightResponse = "The lights have been turned on!";
	
	StringResponse response = StringResponse.newBuilder()
            .setText(lightResponse)
            .build();
	responseObserver.onNext(response);
	responseObserver.onCompleted();
}
@Override
public void turnOffLights(final Empty request,final StreamObserver<StringResponse> responseObserver) {
	lightStatus = "Off";
	lightResponse = "The lights have been turned off!";
	
	StringResponse response = StringResponse.newBuilder()
            .setText(lightResponse)
            .build();
	responseObserver.onNext(response);
	responseObserver.onCompleted();
}

@Override
public void changeLightsSetting(LightsSetting request, StreamObserver<StringResponse> responseObserver) {
    setting = request.getSetting();
    System.out.println(setting);
    response = StringResponse.newBuilder().setText("Lights seetting has been changed to" + setting).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
}

@Override
public void changeLightingLevel(IntRequest request, StreamObserver<StringResponse> responseObserver) {
	lightningLevel = request.getValue();
	System.out.println(lightningLevel);
    response = StringResponse.newBuilder().setText("Lightning level has been changed").build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
}
}

