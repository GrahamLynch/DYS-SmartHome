package lighting;

import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class LightingClient{

	
	
	private static LightingServiceGrpc.LightingServiceStub asyncStub;
    private static LightingServiceGrpc.LightingServiceBlockingStub blockingStub;
    private static StreamObserver<IntRequest> lightlevel;
    
    public static void main (String args[]) throws Exception {
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = LightingServiceGrpc.newBlockingStub(channel);
		asyncStub = LightingServiceGrpc.newStub(channel);
		
		turnOnLights();
		turnOffLights();
		changeLightingLevel();
    }
    
   
    
    // TURN ON LIGHTS
    public static String turnOnLights() throws io.grpc.StatusRuntimeException{
        StringResponse response = blockingStub.turnOnLights(null);
        System.out.print(response.getText());
        return response.getText();
    }
    
 // TURN OFF LIGHTS
    public static String turnOffLights() throws io.grpc.StatusRuntimeException{
        StringResponse response = blockingStub.turnOffLights(null);
        System.out.print(response.getText());
        return response.getText();
    }
 // CHANGE LIGHTNING LEVEL
    public static void changeLightingLevel() throws io.grpc.StatusRuntimeException{
    	StreamObserver<StringResponse> responseStreamObserver = new StreamObserver<StringResponse>() {

			@Override
			public void onNext(StringResponse response) {
				System.out.println("receiving length: " + response.getText());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
			
				
			}
			
    	};
    	StreamObserver<IntRequest> requestObserver = asyncStub.changeLightingLevel(responseStreamObserver); 
    	try {
    		requestObserver.onNext(IntRequest.newBuilder().setValue(30).build());
    		
    		requestObserver.onCompleted();
    		
    		Thread.sleep(1000);
    	} catch (RuntimeException e) {
    		requestObserver.onError(e);
    		throw e;
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
		
    	
    	
    }
  
}