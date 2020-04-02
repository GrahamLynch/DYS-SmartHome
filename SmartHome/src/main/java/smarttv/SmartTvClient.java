package smarttv;



import java.util.Random;

import javax.xml.ws.Response;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import smarttv.StringResponse;




public class SmartTvClient{
	
	private static SmartTvServiceGrpc.SmartTvServiceStub asyncStub;
    private static SmartTvServiceGrpc.SmartTvServiceBlockingStub blockingStub;
    
	
	
	public static void main (String args[]) throws Exception {
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SmartTvServiceGrpc.newBlockingStub(channel);
		asyncStub = SmartTvServiceGrpc.newStub(channel);
		
		connectToWifi();
		turnOnTV();
		turnOffTV();
		
    }
	
	  // TURN ON TV
    public static String turnOnTV(){
        StringResponse response = blockingStub.turnOnTv(null);
        System.out.print(response.getText());
        return response.getText();
    }
    
 // TURN OFF TV
    public static String turnOffTV(){
        StringResponse response = blockingStub.turnOffTv(null);
        System.out.print(response.getText());
        return response.getText();
    }
    
    public static void connectToWifi() {
		StringRequest request = StringRequest.newBuilder().setText("message 1 - introduction").build();

		StreamObserver<StringResponse> responseObserver = new StreamObserver<StringResponse>() {

			@Override
			public void onNext(StringResponse value) {
				System.out.println("receiving " + value);

			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("on completed ");
			}

		};

		asyncStub.connectToWifi(request, responseObserver);


		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
	public static void connectTvToNetwork() {
		StreamObserver<StringResponse> responseObserver = new StreamObserver<StringResponse>() {

			@Override
			public void onNext(StringResponse value) {
				System.out.println("receiving words: " + value.getText());
			
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub

			}

		};
		
		StreamObserver<StringRequest> requestObserver = asyncStub.connectTvToNetwork(responseObserver); 
		try {
			requestObserver.onNext(StringRequest.newBuilder().setText("Dominic").build());
			requestObserver.onNext(StringRequest.newBuilder().setText("James").build());
			requestObserver.onNext(StringRequest.newBuilder().setText("Paul").build());
			requestObserver.onNext(StringRequest.newBuilder().setText("Pramod").build());
			requestObserver.onCompleted();
			
			Thread.sleep(new Random().nextInt(1000)+500);
		} catch (RuntimeException e) {
			requestObserver.onError(e);
			throw e;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		*/
		
		
	}	

	
