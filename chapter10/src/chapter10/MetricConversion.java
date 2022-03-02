package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimetres", "Foot to Metres", "Gallon to Litres", "Pound to Kilograms"}));
		comboBox.setBounds(58, 77, 276, 40);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Select Conversion Type :");
		lblNewLabel.setFont(new Font("Calibri", Font.ITALIC, 18));
		lblNewLabel.setBounds(58, 33, 216, 33);
		frame.getContentPane().add(lblNewLabel);
	}
}
