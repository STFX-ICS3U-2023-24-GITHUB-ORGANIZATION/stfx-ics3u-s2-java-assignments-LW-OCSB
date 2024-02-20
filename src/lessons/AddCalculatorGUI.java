package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculatorGUI window = new AddCalculatorGUI();
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
	public AddCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// Add button code
				int num1 = 0;
				int num2 = 0;
				int answer = 0;
				
				// get first number
				try  {
					num1 = Integer.parseInt(textField1.getText());
				}
				
				catch (Exception e1)  {
					
					textField1.setText("Please enter an integer");
				}
				
				
				// get second number
				try  {
					num2 = Integer.parseInt(textField2.getText());
				}
				
				catch (Exception e1)  {
					
					textField2.setText("Please enter an integer");
				}
				
				// add numbers and display answer
				answer = num1 + num2;
				textField3.setText(Integer.toString(answer));
				
				
			}
		});
		button1.setBounds(20, 110, 89, 23);
		frame.getContentPane().add(button1);
		
		textField1 = new JTextField();
		textField1.setBounds(203, 65, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(203, 131, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(203, 193, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel label1 = new JLabel("First Integer");
		label1.setBounds(221, 46, 121, 20);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Second Integer");
		label2.setBounds(203, 110, 89, 23);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Answer");
		label3.setBounds(221, 176, 46, 14);
		frame.getContentPane().add(label3);
	}
}
