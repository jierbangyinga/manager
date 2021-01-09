package worker;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import create.passworddprotect;
import loginn.lookkperson;
import lookk.lookksalary;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class workerchoice {

	private JFrame frame;
	private String number;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public workerchoice(String number) {
		this.number=number;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5458\u5DE5\u754C\u9762");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u8FDB\u5165\u5458\u5DE5\u7CFB\u7EDF");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBackground(Color.WHITE);
		Font f=new Font("¿¬Ìå",Font.BOLD,30);
		lblNewLabel.setBounds(86, 0, 266, 55);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u67E5\u770B\u5DE5\u8D44\u4FE1\u606F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new lookksalary().looksalary(number);
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(151, 91, 113, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u770B\u4E2A\u4EBA\u4FE1\u606F");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new lookkperson().lookperson(number);
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(151, 152, 113, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4FEE\u6539\u4E2A\u4EBA\u4FE1\u606F");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new modifyperson(number);
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(151, 213, 113, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img/2.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		new passworddprotect().protectpassword(number);
	}

}
