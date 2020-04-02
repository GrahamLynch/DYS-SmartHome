package smarttv;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import io.grpc.stub.StreamObserver;
import smarttv.SmartTvServiceGrpc.SmartTvServiceImplBase;


import java.io.IOException;
import java.util.logging.Logger;

import javax.xml.ws.Response;

public class SmartTvServer extends SmartTvServiceImplBase {

	String tvStatus , tvResponse;
	private static final Logger logger = Logger.getLogger(SmartTvServer.class.getName());
	public static void main(final String args[]) throws IOException , InterruptedException {
	SmartTvServer smarttvserver = new SmartTvServer();
	int port = 50052;
	
    Server server = ServerBuilder.forPort(port)
	        .addService(smarttvserver)
	        .build()
	        .start();
	    
    System.out.println ("Server is listening" +port);
	    		    
	    server.awaitTermination();
 }
	
	public void turnOnTv(final Empty request,final StreamObserver<StringResponse> responseObserver) {
		tvStatus = "On";
		tvResponse = "The tv has been turned on!";
		
		StringResponse response = StringResponse.newBuilder()
	            .setText(tvResponse)
	            .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	public void turnOffTv(final Empty request,final StreamObserver<StringResponse> responseObserver) {
		tvStatus = "Off";
		tvResponse = "The tv has been turned off!";
		
		StringResponse response = StringResponse.newBuilder()
	            .setText(tvResponse)
	            .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
	
	 public void connectToWifi(StringRequest request, StreamObserver<StringResponse> responseObserver) {
		 System.out.println("Recieving Request");
		 
		
			 responseObserver.onNext(StringResponse.newBuilder().setText("Connecting to wifi").build());
			 responseObserver.onNext(StringResponse.newBuilder().setText("Wifi Connected").build());
	
		 
		 
		 responseObserver.onCompleted();
	}
	/*
	@Override
	public StreamObserver<StringRequest> connectTvToNetwork(StreamObserver<StringResponse> responseObserver) {
		return new StreamObserver<StringRequest>() {

			@Override
			public void onNext(StringRequest value) {
					StringBuilder input1 = new StringBuilder(); 
		            input1.append(value.getText()); 
		            input1 = input1.reverse();
		        
		            StringResponse reply = StringResponse.newBuilder().setText(input1.toString()).build();
		            System.out.println("" + reply);
		            responseObserver.onNext(reply);
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				StringResponse res = StringResponse.newBuilder().setText("Hello").build();
		          responseObserver.onNext(res);
		          responseObserver.onCompleted();
				
			}
			
		};
		
		
	}
	*/
	
	
   
   
}
		
