package speakers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class speakersview extends JFrame {
	
	static JTextArea changeVolumeTextField;
	static JTextArea turnOnSpeakersTextField;
	static JTextArea turnOffSpeakersTextField;
	private static SpeakersServiceGrpc.SpeakersServiceStub asyncStub;
    private static SpeakersServiceGrpc.SpeakersServiceBlockingStub blockingStub;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SpeakersServiceGrpc.newBlockingStub(channel);
		asyncStub = SpeakersServiceGrpc.newStub(channel);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					speakersview frame = new speakersview();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public speakersview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 573);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton turnOnSpeakersBtn = new JButton("Turn on Speakers!");
		turnOnSpeakersBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnOnSpeakers();
			}
		});
		turnOnSpeakersBtn.setBounds(189, 97, 210, 29);
		contentPane.add(turnOnSpeakersBtn);
		
		turnOnSpeakersTextField = new JTextArea();
		turnOnSpeakersTextField.setBounds(179, 36, 232, 29);
		contentPane.add(turnOnSpeakersTextField);
		
		JButton turnOffSpeakersBtn = new JButton("Turn off Speakers!");
		turnOffSpeakersBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnOffSpeakers();
			}
		});
		turnOffSpeakersBtn.setBounds(189, 212, 210, 29);
		contentPane.add(turnOffSpeakersBtn);
		
		turnOffSpeakersTextField = new JTextArea();
		turnOffSpeakersTextField.setBounds(179, 155, 232, 31);
		contentPane.add(turnOffSpeakersTextField);
		
		changeVolumeTextField = new JTextArea();
		changeVolumeTextField.setBounds(179, 282, 232, 29);
		contentPane.add(changeVolumeTextField);
		
		JButton changeVolumeButton = new JButton("Change Volume");
		changeVolumeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chnageVolume();
			}
		});
		changeVolumeButton.setBounds(233, 352, 115, 29);
		contentPane.add(changeVolumeButton);
	}
	
	// CHANGE VOLUME LEVEL
    public static void chnageVolume() throws io.grpc.StatusRuntimeException{
    	StreamObserver<StringResponse> responseStreamObserver = new StreamObserver<StringResponse>() {

			@Override
			public void onNext(StringResponse response) {
				changeVolumeTextField.append(response.getText());
				
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
    public void turnOnSpeakers(){
        StringResponse response = blockingStub.turnOnSpeakers(null);
        
        turnOnSpeakersTextField.append(response.getText());
    }
    
 // TURN OFF SPEAKERS
    public void turnOffSpeakers() {
        StringResponse response = blockingStub.turnOffSpeakers(null);
        
        turnOffSpeakersTextField.append(response.getText());
    }
    
}
