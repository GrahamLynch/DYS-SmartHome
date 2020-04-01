package lighting;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class LightingClient{

	
	
	private static LightingServiceGrpc.LightingServiceStub asyncStub;
    private static LightingServiceGrpc.LightingServiceBlockingStub blockingStub;
    
    public static void main (String args[]) throws Exception {
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = LightingServiceGrpc.newBlockingStub(channel);
		asyncStub = LightingServiceGrpc.newStub(channel);
		
		turnOnLights();
		turnOffLights();
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
}