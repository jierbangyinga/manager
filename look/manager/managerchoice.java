package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class managerchoice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public managerchoice() {
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
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u8FDB\u5165\u7BA1\u7406\u5458\u7CFB\u7EDF");
		lblNewLabel.setForeground(new Color(153, 204, 255));
		Font f=new Font("¿¬Ìå",Font.BOLD,30);
		lblNewLabel.setBounds(73, 0, 299, 46);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u5458\u5DE5\u4FE1\u606F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new manageworker();
			}
		});
		btnNewButton.setForeground(new Color(0, 102, 255));
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setBounds(166, 80, 93, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5DE5\u8D44\u4FE1\u606F");
		btnNewButton_1.setForeground(new Color(0, 102, 255));
		btnNewButton_1.setBackground(new Color(204, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new managesalary();
			}
		});
		btnNewButton_1.setBounds(166, 163, 93, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img/10.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
