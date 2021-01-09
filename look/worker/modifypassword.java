package worker;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modify.modifyypassword;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modifypassword {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public modifypassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4FEE\u6539\u5BC6\u7801");
		frame.setBounds(100, 100, 450, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("楷体",Font.BOLD,30);
		
		JLabel lblNewLabel = new JLabel("\u4FEE\u6539\u5BC6\u7801");
		lblNewLabel.setBounds(147, 0, 158, 35);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5DE5\u53F7");
		lblNewLabel_1.setBounds(147, 75, 54, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(190, 72, 132, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u539F\u5BC6\u7801");
		lblNewLabel_2.setBounds(133, 117, 54, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 114, 132, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u65B0\u5BC6\u7801");
		lblNewLabel_3.setBounds(133, 161, 54, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 156, 132, 21);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("\u518D\u6B21\u786E\u8BA4");
		lblNewLabel_4.setBounds(121, 204, 54, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				String password1=textField_1.getText();
				String password2=new String(passwordField.getPassword());
				String password3=new String(passwordField_1.getPassword());
				if(!password2.equals(password3)) {
					JOptionPane.showMessageDialog(null, "两次密码输入的不一样");
				}else if(password2.length()>10||password2.length()<5){
					JOptionPane.showMessageDialog(null, "密码长度应在5~10位！");
				}else if(password1.equals(password2)) {
					JOptionPane.showMessageDialog(null, "修改的密码和原密码一样");
				}else {
					new modifyypassword().modifypassword(number,password1,password2,frame);
				}
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 153, 153));
		btnNewButton.setBounds(176, 256, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(190, 198, 132, 21);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\\u6211\u7684\u6587\u6863\\My Pictures\\109951165037722393.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 289);
		frame.getContentPane().add(lblNewLabel_5);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
