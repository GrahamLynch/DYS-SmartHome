package smarttv;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tvview extends JFrame {
	
	private static SmartTvServiceGrpc.SmartTvServiceStub asyncStub;
    private static SmartTvServiceGrpc.SmartTvServiceBlockingStub blockingStub;

	private JPanel contentPane;
	static JTextArea turnOnTextArea;
	static JTextArea turnOffTextArea;
	private JButton turnOffButton;
	private JButton wifiBtn;
	private static JTextArea wifiTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50057).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = SmartTvServiceGrpc.newBlockingStub(channel);
		asyncStub = SmartTvServiceGrpc.newStub(channel);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tvview frame = new tvview();
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
	public tvview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 574);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton turnOnButton = new JButton("Turn on TV");
		turnOnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnOnTV();
			}
		});
		turnOnButton.setBounds(240, 86, 115, 29);
		contentPane.add(turnOnButton);
		
		turnOnTextArea = new JTextArea();
		turnOnTextArea.setBounds(209, 48, 191, 22);
		contentPane.add(turnOnTextArea);
		
		turnOffTextArea = new JTextArea();
		turnOffTextArea.setBounds(209, 169, 191, 22);
		contentPane.add(turnOffTextArea);
		
		turnOffButton = new JButton("Turn off TV");
		turnOffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnOffTV();
			}
		});
		turnOffButton.setBounds(240, 236, 115, 29);
		contentPane.add(turnOffButton);
		
		wifiBtn = new JButton("Connect to Wifi");
		wifiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connectToWifi();
			}
		});
		wifiBtn.setBounds(172, 440, 274, 29);
		contentPane.add(wifiBtn);
		
		wifiTextArea = new JTextArea();
		wifiTextArea.setBounds(85, 308, 440, 108);
		contentPane.add(wifiTextArea);
	}
	
	 // TURN ON TV
    public void turnOnTV(){
        StringResponse response = blockingStub.turnOnTv(null);
        System.out.print(response.getText());
        try {
        turnOnTextArea.append(response.getText());
        }catch(StatusRuntimeException e) {
        	System.out.print(e.getStatus());
        }
    }
    
    // TURN OFF TV
    public void turnOffTV(){
        StringResponse response = blockingStub.turnOffTv(null);
        System.out.print(response.getText());
        try {
            turnOffTextArea.append(response.getText());
            }catch(StatusRuntimeException e) {
            	System.out.print(e.getStatus());
            }
    }
    
    public static void connectToWifi() {
  		StringRequest request = StringRequest.newBuilder().setText("").build();

  		StreamObserver<StringResponse> responseObserver = new StreamObserver<StringResponse>() {

  			@Override
  			public void onNext(StringResponse value) {
  				wifiTextArea.append(value.getText());

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
