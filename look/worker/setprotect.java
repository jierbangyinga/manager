package worker;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import create.settprotect;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class setprotect {

	private JFrame frame;
	private JTextField textField;
	private String number;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public setprotect(String number) {
		this.number=number;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 238, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4E3A\u4F60\u7684\u5E10\u53F7\u8BBE\u7F6E\u5BC6\u4FDD\uFF0C\u4EE5\u65B9\u4FBF\u627E\u56DE");
		lblNewLabel.setBounds(20, 10, 211, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(30, 36, 152, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message=textField.getText();
				if("".equals(message)) {
					JOptionPane.showMessageDialog(null, "密保不能为空");
				}else {
					new settprotect().setprotect(number,message,frame);
				}
				
			}
		});
		btnNewButton.setBounds(57, 87, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\salarymanager\\img\\9.jpg"));
		lblNewLabel_1.setBounds(0, 0, 211, 157);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
