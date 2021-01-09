package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import search.summallsalary;

public class sumallsalary {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public sumallsalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 234, 190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("Ώ¬Με",Font.BOLD,25);
		
		JLabel lblNewLabel = new JLabel("\u603B\u652F\u51FA");
		lblNewLabel.setBounds(69, 10, 87, 30);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new summallsalary().sumallsalary()+"Τͺ");
		lblNewLabel_1.setBounds(68, 60, 259, 68);
		lblNewLabel_1.setFont(f);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
