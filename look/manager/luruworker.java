package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import create.luruuworker;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class luruworker {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public luruworker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5F55\u5165\u5458\u5DE5\u4FE1\u606F");
		frame.setBounds(100, 100, 459, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("楷体",Font.BOLD,30);
		JLabel lblNewLabel = new JLabel("\u5F55\u5165\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel.setBounds(122, 0, 209, 25);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5DE5\u53F7");
		lblNewLabel_1.setBounds(136, 57, 54, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(186, 54, 123, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D");
		lblNewLabel_2.setBounds(136, 105, 54, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 102, 123, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B");
		lblNewLabel_3.setBounds(136, 153, 54, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 150, 123, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u5E74\u9F84");
		lblNewLabel_4.setBounds(136, 198, 54, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u7535\u8BDD");
		lblNewLabel_5.setBounds(136, 240, 54, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(186, 195, 123, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(186, 237, 123, 21);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u90E8\u95E8");
		lblNewLabel_6.setBounds(136, 286, 54, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(186, 283, 123, 21);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u804C\u4F4D");
		lblNewLabel_7.setBounds(136, 325, 54, 15);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(186, 322, 123, 21);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				String name=textField_1.getText();
				String sex=textField_2.getText();
				String age=textField_3.getText();
				String phone=textField_4.getText();
				String dept=textField_5.getText();
				String work=textField_6.getText();
				if("".equals(number)||"".equals(name)||"".equals(sex)||"".equals(age)||"".equals(phone)||"".equals(dept)||"".equals(work)) {
					JOptionPane.showMessageDialog(null, "把信息填写完整");
				}else if(!("男".equals(sex)||"女".equals(sex))) {
					JOptionPane.showMessageDialog(null, "填写正确的性别！");
				}else if(name.length()<0||name.length()>20) {
					JOptionPane.showMessageDialog(null, "名字格式不正确！");
				}else if(phone.length()!=11) {
					JOptionPane.showMessageDialog(null, "电话号码不正确！");
				}else {
					new luruuworker().luruworker(number,name,sex,age,phone,dept,work,frame);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(177, 359, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_8.setBounds(0, 0, 443, 392);
		frame.getContentPane().add(lblNewLabel_8);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
