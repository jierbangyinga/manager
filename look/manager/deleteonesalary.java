package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import delete.deleteeonesalary;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deleteonesalary {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public deleteonesalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5220\u9664\u4FE1\u606F");
		frame.setBounds(100, 100, 250, 193);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(54, 37, 137, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5DE5\u53F7");
		lblNewLabel.setBounds(52, 20, 76, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4\u5220\u9664");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				if("".equals(number)) {
					JOptionPane.showMessageDialog(null, "请输入完整信息！");
				}else {
					new deleteeonesalary().deleteonesalary(number,frame);
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(72, 94, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\salarymanager\\img\\8.jpg"));
		lblNewLabel_1.setBounds(0, 0, 234, 155);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
