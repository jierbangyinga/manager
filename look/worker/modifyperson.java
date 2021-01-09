package worker;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import modify.modifyyperson;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class modifyperson {

	private JFrame frame;
	private JTextField textField;
	private String number;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public modifyperson(String number) {
		this.number=number;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4FEE\u6539\u4E2A\u4EBA\u4FE1\u606F");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("楷体",Font.BOLD,30);
		
		JLabel lblNewLabel = new JLabel("\u4FEE\u6539\u4E2A\u4EBA\u4FE1\u606F");
		lblNewLabel.setBounds(117, 0, 424, 35);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B", "\u7535\u8BDD"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(117, 102, 74, 21);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(190, 102, 124, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message=textField.getText();
				String choice=comboBox.getSelectedItem().toString();
				if("".equals(message)) {
					JOptionPane.showMessageDialog(null, "信息不能为空！");
				}else {
					new modifyyperson().modifyperson(number,choice,message,frame);
				}
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(167, 155, 93, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
