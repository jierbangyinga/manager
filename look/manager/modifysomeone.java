package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modify.modifyysomeone;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modifysomeone {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
		/**
	 * Create the application.
	 */
	public modifysomeone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("楷体",Font.BOLD,30);
		
		JLabel lblNewLabel = new JLabel("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel.setBounds(127, 0, 205, 52);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(200, 116, 114, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5BC6\u7801", "\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B", "\u7535\u8BDD", "\u90E8\u95E8", "\u804C\u4F4D"}));
		comboBox.setBounds(127, 116, 54, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("\u5458\u5DE5\u53F7");
		lblNewLabel_1.setBounds(147, 62, 54, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 65, 114, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message=textField.getText();
				String choice=comboBox.getSelectedItem().toString();
				String number=textField_1.getText();
				if("".equals(message)||"".equals(number)) {
					JOptionPane.showMessageDialog(null, "请输入完整信息！!");
				}else {
					new modifyysomeone().modifysomeone(number,choice,message,frame);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(170, 180, 93, 24);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_2.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
