package lighting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class lightview extends JFrame {
	
	private static LightingServiceGrpc.LightingServiceStub asyncStub;
    private static LightingServiceGrpc.LightingServiceBlockingStub blockingStub;
    static JTextArea lightsOnTextArea = new JTextArea();

	private JPanel contentPane;
	private JButton lightsOffButton;
	private JTextArea lightsOffTextArea;
	private JButton changeColourButton;
	private JTextArea colourTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = LightingServiceGrpc.newBlockingStub(channel);
		asyncStub = LightingServiceGrpc.newStub(channel);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lightview frame = new lightview();
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
	public lightview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 701);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lightsOnTextArea.setBounds(229, 158, 303, 35);
		contentPane.add(lightsOnTextArea);
		
		JButton lightsOnButton = new JButton("Turn on lights!");
		lightsOnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnOnLights();
			}
		});
		lightsOnButton.setBounds(275, 83, 208, 29);
		contentPane.add(lightsOnButton);
		
		lightsOffButton = new JButton("Turn off lights!");
		lightsOffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnOffLights();
			}
		});
		lightsOffButton.setBounds(275, 274, 205, 29);
		contentPane.add(lightsOffButton);
		
		lightsOffTextArea = new JTextArea();
		lightsOffTextArea.setBounds(229, 365, 303, 35);
		contentPane.add(lightsOffTextArea);
		
		changeColourButton = new JButton("Change colour of lights!");
		changeColourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		changeColourButton.setBounds(240, 466, 275, 29);
		contentPane.add(changeColourButton);
		
		colourTextArea = new JTextArea();
		colourTextArea.setBounds(234, 542, 298, 35);
		contentPane.add(colourTextArea);
	}
	
	
	

	
	 // TURN ON LIGHTS
    public void turnOnLights() throws io.grpc.StatusRuntimeException{
        StringResponse response = blockingStub.turnOnLights(null);
        System.out.print(response.getText());
        lightsOnTextArea.append(response.getText());
        
    }
    
 // TURN OFF LIGHTS
    public void turnOffLights() throws io.grpc.StatusRuntimeException{
        StringResponse response = blockingStub.turnOffLights(null);
        System.out.print(response.getText());
        lightsOffTextArea.append(response.getText());
    }
    
    // CHANGE LIGHTS COLOUR
    public void changeLightColour() throws io.grpc.StatusRuntimeException{
        StringResponse response = blockingStub.changeLightColour(null);
        System.out.print(response.getText());
        colourTextArea.append(response.getText());
        
    }

}
