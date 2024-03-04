package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counters {

	// variables
	private JFrame frame;
	private JTextField textField1;
	private int counter = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counters window = new Counters();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Counters() {
		initialize();
		textField1.setText(Integer.toString(counter));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// up button code
				counter++;
				textField1.setText(Integer.toString(counter));
			}
		});
		btnNewButton.setBounds(96, 104, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField1 = new JTextField();
		textField1.setBounds(240, 129, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Down");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// down button code
				counter--;
				textField1.setText(Integer.toString(counter));
			}
		});
		btnNewButton_1.setBounds(96, 157, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Counter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(182, 51, 120, 23);
		frame.getContentPane().add(lblNewLabel);
	}
}
