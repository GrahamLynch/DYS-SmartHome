package heating;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class heatingview extends JFrame {
	
	private static HeatingServiceGrpc.HeatingServiceBlockingStub blockingStub;

	private JPanel contentPane;
	private JTextArea currentHeatingTempTextArea;
	private JButton currentHeatingTempBtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		 
		 blockingStub = HeatingServiceGrpc.newBlockingStub(channel);
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					heatingview frame = new heatingview();
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
	public heatingview() {
		setBackground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 531);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		currentHeatingTempTextArea = new JTextArea();
		currentHeatingTempTextArea.setBounds(176, 183, 208, 39);
		contentPane.add(currentHeatingTempTextArea);
		
		currentHeatingTempBtn = new JButton("Current heating temp");
		currentHeatingTempBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getCurrentHeatingTemp();
			}
		});
		currentHeatingTempBtn.setBounds(176, 261, 194, 29);
		contentPane.add(currentHeatingTempBtn);
	}
	
	
	
	public void getCurrentHeatingTemp() throws io.grpc.StatusRuntimeException{
        IntResponse response = blockingStub.getCurrentHeatingTemp(null);
        System.out.print(response.getValue());
        currentHeatingTempTextArea.append("" + response.getValue());
    }
}
