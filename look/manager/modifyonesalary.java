package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import modify.modifyyonesalary;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modifyonesalary {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public modifyonesalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4FEE\u6539\u5DE5\u8D44\u4FE1\u606F");
		frame.setBounds(100, 100, 319, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 55, 183, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u4F60\u7684\u5DE5\u53F7");
		lblNewLabel.setBounds(99, 38, 96, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u57FA\u7840\u5DE5\u8D44", "\u59D3\u540D", "\u52A0\u73ED", "\u591C\u73ED", "\u8FDF\u5230"}));
		comboBox.setBounds(57, 103, 74, 21);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 103, 103, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				String message=textField_1.getText();
				String choice=comboBox.getSelectedItem().toString();
				if("".equals(number)||"".equals(message)||"".equals(choice)) {
					JOptionPane.showMessageDialog(null, "请输入完整信息！");
				}else {
					new modifyyonesalary().modifyonesalary(choice,message,number,frame);
				}
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(99, 159, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_1.setBounds(0, 0, 303, 233);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
