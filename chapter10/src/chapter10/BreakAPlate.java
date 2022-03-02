package chapter10;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class BreakAPlate 
{

	private JFrame frame;
	private boolean clicked;
	ImageIcon allPlates = new ImageIcon("..\\Chapter10\\images\\plates_all_broken.gif");
	
	ImageIcon twoPlates = new ImageIcon("..\\Chapter10\\images\\plates_two_broken.gif");
	ImageIcon noImage = new ImageIcon("..\\Chapter10\\images\\placeholder.gif");
	ImageIcon sticker = new ImageIcon("..\\Chapter10\\images\\sticker.gif");
	
	ImageIcon freshPlates = new ImageIcon("..\\Chapter10\\images\\plates.gif");
	ImageIcon tigerPlush =  new ImageIcon("..\\Chapter10\\images\\tiger_plush.gif");
	
	/**
	 * Create the application.
	 */
	public BreakAPlate() 
	{
		initialize();
		clicked = true;
	}
	
	public boolean getClicked()
	{
		return clicked;
	}
	
	public void setClicked(boolean input)
	{
		clicked = input;
	}
	
	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				}
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon plates = new ImageIcon("");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.getContentPane().setForeground(new Color(255, 250, 240));
		frame.setBounds(100, 100, 617, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		JLabel plates = new JLabel(new ImageIcon("..\\Chapter10\\plates.gif"));
		plates.setBackground(new Color(255, 250, 205));
		plates.setForeground(SystemColor.activeCaption);
		plates.setOpaque(true);
		plates.setBounds(32,80,514,146);
		frame.getContentPane().add(plates);
		
		JLabel prize = new JLabel(new ImageIcon("..\\Chapter10\\placeholder.gif"));
		prize.setBackground(new Color(255, 250, 205));
		prize.setBounds(155,303,285,100);
		prize.setOpaque(true);
		frame.getContentPane().add(prize);
		
		JButton btn = new JButton("Play Again");
		btn.setBackground(new Color(255, 250, 205));
		btn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn.setBounds(123, 237, 330, 42);
		frame.getContentPane().add(btn);
		
		JLabel titleLabel = new JLabel("Break Plates");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setForeground(Color.BLACK);
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(new Color(255, 250, 205));
		titleLabel.setBounds(32, 0, 514, 83);
		frame.getContentPane().add(titleLabel);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (getClicked() == true)
				{
					btn.setText("Restart");
			        int plateOne = (int)(2 * Math.random() + 0);
			        int plateTwo = (int)(2 * Math.random() + 0);
			        int plateThree = (int)(2 * Math.random() + 0);
			        
			        if (plateOne == plateTwo && plateOne == plateThree)
			        {
			        	plates.setIcon(allPlates);
			        	prize.setIcon(tigerPlush);
			        }
			        
			        else
			        {
			        	plates.setIcon(twoPlates);
			        	prize.setIcon(sticker);
			        }
			        
			        setClicked(false);
				}	
				
				else
				{
					btn.setText("Break");
					plates.setIcon(freshPlates);
					prize.setIcon(noImage);
					setClicked(true);
				}
			}
		});				
	}
}
