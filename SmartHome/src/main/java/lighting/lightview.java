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
	private JButton btnNewButton;

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
		
		btnNewButton = new JButton("Turn off lights!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(275, 483, 205, 29);
		contentPane.add(btnNewButton);
	}
	
	
	

	
	 // TURN ON LIGHTS
    public void turnOnLights() throws io.grpc.StatusRuntimeException{
        StringResponse response = blockingStub.turnOnLights(null);
        System.out.print(response.getText());
        lightsOnTextArea.append(response.getText());
        
        
    }

}
