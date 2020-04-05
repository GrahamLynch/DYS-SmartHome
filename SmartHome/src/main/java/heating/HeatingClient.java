package heating;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;



public class HeatingClient{
	
	private static HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub;
	
	 public static void main (String args[]) throws Exception {
		 ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		 
		 blockingStub = HeatingServiceGrpc.newBlockingStub(channel);
		 
		 getCurrentHeatingTemp();
		 setHeatingTemp(40);
	 }
	 
	
	    public static int getCurrentHeatingTemp() throws io.grpc.StatusRuntimeException{
	        IntResponse response = blockingStub.getCurrentHeatingTemp(null);
	        System.out.print(response.getValue());
	        return response.getValue();
	    }
	    
	
	    public static void setHeatingTemp(int value) throws io.grpc.StatusRuntimeException{
	        IntRequest request = IntRequest.newBuilder().setValue(value).build();
	        blockingStub.setHeatingTemp(request);
	    }
	
}