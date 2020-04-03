package speakers;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import speakers.SpeakersServiceGrpc;

public class SpeakersClient{
	
	private static SpeakersServiceGrpc.SpeakersServiceStub asyncStub;
    private static SpeakersServiceGrpc.SpeakersServiceBlockingStub blockingStub;
	
	public static void main (String args[]) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SpeakersServiceGrpc.newBlockingStub(channel);
		asyncStub = SpeakersServiceGrpc.newStub(channel);
		
		chnageVolume();
		turnOnSpeakers();
		turnOffSpeakers();
		
		
	}

// CHANGE VOLUME LEVEL
    public static void chnageVolume() throws io.grpc.StatusRuntimeException{
    	StreamObserver<StringResponse> responseStreamObserver = new StreamObserver<StringResponse>() {

			@Override
			public void onNext(StringResponse response) {
				System.out.println(response.getText());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
			
				
			}
			
    	};
    	StreamObserver<IntRequest> requestObserver = asyncStub.chnageVolume(responseStreamObserver); 
    	try {
    		requestObserver.onNext(IntRequest.newBuilder().setValue(110).build());
    		requestObserver.onCompleted();
    		
    		Thread.sleep(1000);
    	} catch (RuntimeException e) {
    		requestObserver.onError(e);
    		throw e;
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
		
    	
    	
    }
    
 // TURN ON SPEAKERS
    public static String turnOnSpeakers(){
        StringResponse response = blockingStub.turnOnSpeakers(null);
        System.out.print(response.getText());
        return response.getText();
    }
    
 // TURN OFF SPEAKERS
    public static String turnOffSpeakers() {
        StringResponse response = blockingStub.turnOffSpeakers(null);
        System.out.print(response.getText());
        return response.getText();
    }
    
}

