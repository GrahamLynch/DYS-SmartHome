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
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50060).usePlaintext().build();

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
 // CONNECT TO WIFI   
    public static void connectToWifi() {
		StringRequest request = StringRequest.newBuilder().setText("").build();

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
   		
		
	}	

	
