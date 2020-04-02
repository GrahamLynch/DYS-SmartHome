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
	private StringResponse response;
	int currentLightning = 50;
	private static final Logger logger = Logger.getLogger(LightingServer.class.getName());
	public static void main(final String args[]) throws IOException , InterruptedException {
	LightingServer lightingServer = new LightingServer();
	int port = 50051;
	
    Server server = ServerBuilder.forPort(port)
	        .addService(lightingServer)
	        .build()
	        .start();
	    
    System.out.println ("Server is listening" + port);
	    		    
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
public void changeLightColour(final Empty request,final StreamObserver<StringResponse> responseObserver) {
	lightResponse = "The lights have changed colour!";
	
	StringResponse response = StringResponse.newBuilder()
            .setText(lightResponse)
            .build();
	responseObserver.onNext(response);
	responseObserver.onCompleted();
}



@Override
public StreamObserver<IntRequest> changeLightingLevel (final StreamObserver<StringResponse> responseObserver) {

	return new StreamObserver<IntRequest>() {
		int newLightning;

		@Override
		public void onNext(IntRequest value) {
			
			String message;
			if(value.getValue() < currentLightning) {
				newLightning = value.getValue();
				message = "Lighting decreased to" + newLightning;
				
			}
			else if(value.getValue() > currentLightning) {
				newLightning = value.getValue();
				message = "Lightning increased to" + newLightning;
	
			}
			else {
				message = "You have not changed the lightning level";
			}
            responseObserver.onNext(StringResponse.newBuilder().setText(message).build());
            System.out.print(message);
          
		}

		@Override
		public void onError(Throwable t) {
			t.printStackTrace();
			
		}

		@Override
		public void onCompleted() {
            responseObserver.onCompleted();
			
		}
		
		
	};	
}


}

