package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import create.daochu;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inputlu {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public inputlu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 228, 157);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5BFC\u51FA\u8DEF\u5F84(\u4EE5.xls\u7ED3\u5C3E)");
		lblNewLabel.setBounds(39, 10, 192, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(37, 35, 148, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lu=textField.getText();
				if("".equals(lu)||!(lu.endsWith(".xls"))) {
					JOptionPane.showMessageDialog(null, "路径不正确！");
				}else {
					new daochu().dao(lu,frame);
				}
				
			}
		});
		btnNewButton.setBounds(63, 66, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\salarymanager\\img\\8.jpg"));
		lblNewLabel_1.setBounds(0, 0, 212, 119);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
