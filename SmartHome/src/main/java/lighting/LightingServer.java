package lighting;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lighting.LightingServiceGrpc.LightingServiceImplBase;
import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.io.IOException;
import java.util.logging.Logger;
import jmDNS.Discovery;
import jmDNS.Discovery.SampleListener;

public class LightingServer extends LightingServiceImplBase {
	
	
	 private static class SampleListener implements ServiceListener {
	        public void serviceAdded(ServiceEvent event) {
	            System.out.println("Service added: " + event.getInfo().getPort());

	        }


	        public void serviceRemoved(ServiceEvent event) {
	            System.out.println("Service removed: " + event.getInfo());
	        }


	        public void serviceResolved(ServiceEvent event) {
	            System.out.println("Service resolved: " + event.getInfo());
	           
	       		 try {
	       			LightingServer lightingServer = new LightingServer();
	     		   
	    		    int port = 50055;
	    		    

	    	
	    		    Server server = ServerBuilder.forPort(event.getInfo().getPort())
	    		        .addService(lightingServer)
	    		        .build()
	    		        .start();

	    		    logger.info("Lightning server started, listening on " + port);
	    		   

	    		    server.awaitTermination();
	    	 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
	        }
	    	
	String lightStatus;
	String lightResponse;
	private StringResponse response;
	int currentLightning = 50;
	private static final Logger logger = Logger.getLogger(LightingServer.class.getName());
	public static void main(final String args[]) throws IOException , InterruptedException {
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());


	            // Add a service listener
	            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
	            System.out.println("Listening");
	            // Wait a bit
	            Thread.sleep(30000);
	        } catch (UnknownHostException e) {
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
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

