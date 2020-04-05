package smarttv;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import io.grpc.stub.StreamObserver;

import smarttv.SmartTvServiceGrpc.SmartTvServiceImplBase;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import javax.xml.ws.Response;

public class SmartTvServer extends SmartTvServiceImplBase {
	
	private static class SampleListener implements ServiceListener {
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service addedPORT?: " + event.getInfo().getPort());

        }


        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }


        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
           
       		 try {
       			SmartTvServer smartTvServer = new SmartTvServer();
     		   
    		    int port = 50056;
    		    

    		
    		    Server server = ServerBuilder.forPort(event.getInfo().getPort())
    		        .addService(smartTvServer)
    		        .build()
    		        .start();

    		    logger.info("Smart TV server started, listening on " + port);
    		   

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
	

	

	String tvStatus , tvResponse;
	private static final Logger logger = Logger.getLogger(SmartTvServer.class.getName());
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
			 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 responseObserver.onNext(StringResponse.newBuilder().setText("Wifi Connection found").build());
			 try {
					Thread.sleep(3000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
			responseObserver.onNext(StringResponse.newBuilder().setText("Wifi Connected").build());
		 
		 responseObserver.onCompleted();
	}

	
     
}
		
