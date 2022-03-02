package chapter10;


import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

	public class DivisableByThree {

		private JFrame frame;
		private JTextField UserIn;
		 
		int userNum ;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DivisableByThree window = new DivisableByThree();
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
		public  DivisableByThree() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(127, 255, 212));
			frame.setBackground(new Color(127, 255, 212));
			frame.setBounds(100, 100, 566, 358);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			
			panel.setBounds(0, 0, 562, 333);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter an Interger:");
			lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
			
			lblNewLabel.setBounds(158, 89, 109, 34);
			panel.add(lblNewLabel);
			
			UserIn = new JTextField();
			UserIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
			UserIn.setBounds(135, 118, 168, 27);
			panel.add(UserIn);
			UserIn.setColumns(10);
			
			
			JLabel YesNo = new JLabel("");
			YesNo.setFont(new Font("Calibri", Font.PLAIN, 14));
			
			YesNo.setBounds(123, 219, 207, 45);
			panel.add(YesNo);
			
			JButton CheckButton = new JButton("Check divisiblity");
			CheckButton.setFont(new Font("Calibri", Font.PLAIN, 14));
			CheckButton.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) { //when the button is pressed
					String userIn = UserIn.getText();
					
					if (userIn != null && !userIn.trim().isEmpty()) { //making sure that there is no case where a null vallue is typecasted otherwise it would error on an empty text field
						  userNum = Integer.parseInt(userIn); //converting the users string to an integer so that we can preferom dvistion on it
						  
						  if (userNum % 3 == 0) {
							  YesNo.setText("The number is divisable by 3");  // the part where it is divisble by 3
						  }
						  else{
							 YesNo.setText("The number is not divisable by 3"); //the case where it is not divisable by three 
						  }
						  
						  
						 // alpha[i] + alpha[n] n increments all the time but i increments only when n gets to 26
						  
						 
						}
					
				
					
					
				}
			});
			
			CheckButton.setBounds(163, 158, 122, 45);
			panel.add(CheckButton);
			
			
		}
	}

