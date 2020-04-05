package speakers;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import speakers.SpeakersServiceGrpc.SpeakersServiceImplBase;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;


public class SpeakersServer extends SpeakersServiceImplBase {
	
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
	       			SpeakersServer speakerServer = new SpeakersServer();
	     		   
	    		    int port = 50057;
	    		    

	    		    Server server = ServerBuilder.forPort(event.getInfo().getPort())
	    		        .addService(speakerServer)
	    		        .build()
	    		        .start();

	    		    logger.info("Tv Server started, listening on " + port);
	    		   

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
	
	
	
	
	
	String speakerStatus , speakerResponse;
	int maxVol = 100;
	int minVol = 0;
	private static final Logger logger = Logger.getLogger(SpeakersServer.class.getName());
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

	
	public void turnOnSpeakers(final Empty request,final StreamObserver<StringResponse> responseObserver) {
		speakerStatus = "On";
		speakerResponse = "The speakers have been turned on!";
		
		StringResponse response = StringResponse.newBuilder()
	            .setText(speakerResponse)
	            .build();
		responseObserver.onNext(response);
		try {
			responseObserver.onCompleted();
			}catch(StatusRuntimeException e){
				System.out.print(e.getStatus());
			}
	}
	
	public void turnOffSpeakers(final Empty request,final StreamObserver<StringResponse> responseObserver) {
		speakerStatus = "Off";
		speakerResponse = "The speakers have been turned off!";
		
		StringResponse response = StringResponse.newBuilder()
	            .setText(speakerResponse)
	            .build();
		responseObserver.onNext(response);
		try {
			responseObserver.onCompleted();
			}catch(StatusRuntimeException e){
				System.out.print(e.getStatus());
			}
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