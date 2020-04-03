package speakers;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import speakers.SpeakersServiceGrpc.SpeakersServiceImplBase;

import java.io.IOException;
import java.util.logging.Logger;


public class SpeakersServer extends SpeakersServiceImplBase {
	String speakerStatus , speakerResponse;
	int maxVol = 100;
	int minVol = 0;
	private static final Logger logger = Logger.getLogger(SpeakersServer.class.getName());
	public static void main(final String args[]) throws IOException , InterruptedException {
		SpeakersServer smarttvserver = new SpeakersServer();
		int port = 50055;
		
	    Server server = ServerBuilder.forPort(port)
		        .addService(smarttvserver)
		        .build()
		        .start();
		    
	    System.out.println ("Server is listening" +port);
		    		    
		    server.awaitTermination();
	}
	
	public void turnOnSpeakers(final Empty request,final StreamObserver<StringResponse> responseObserver) {
		speakerStatus = "On";
		speakerResponse = "The speakers have been turned on!";
		
		StringResponse response = StringResponse.newBuilder()
	            .setText(speakerResponse)
	            .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	public void turnOffSpeakers(final Empty request,final StreamObserver<StringResponse> responseObserver) {
		speakerStatus = "Off";
		speakerResponse = "The speakers have been turned off!";
		
		StringResponse response = StringResponse.newBuilder()
	            .setText(speakerResponse)
	            .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	@Override
	public StreamObserver<IntRequest> chnageVolume (final StreamObserver<StringResponse> responseObserver) {

		return new StreamObserver<IntRequest>() {
			int newVol;

			@Override
			public void onNext(IntRequest value) {
				
				String message;
				if(value.getValue() < minVol) {
					newVol = value.getValue();
					message = newVol + " volume is too low";
					
				}
				else if(value.getValue() > maxVol) {
					newVol = value.getValue();
					message = newVol + " volume is too high";
		
				}
				else {
					newVol = value.getValue();
					message = "Volume changed to" + newVol;
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