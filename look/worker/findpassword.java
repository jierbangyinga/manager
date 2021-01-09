package worker;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import search.finddpassword;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class findpassword {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public findpassword() {
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
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Font f=new Font("楷体",Font.BOLD,30);
		
		JLabel lblNewLabel = new JLabel("\u5DE5\u53F7");
		lblNewLabel.setBounds(113, 55, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 52, 186, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u627E\u56DE\u5BC6\u7801");
		lblNewLabel_1.setBounds(159, 10, 169, 32);
		lblNewLabel_1.setFont(f);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6\u4FDD");
		lblNewLabel_2.setBounds(113, 109, 54, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 106, 186, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				String protect=textField_1.getText();
				if("".equals(number)||"".equals(protect)) {
					JOptionPane.showMessageDialog(null,"不能为空");
				}else {
					new finddpassword().findpassword(number,protect);
				}
			}
		});
		btnNewButton.setBounds(170, 171, 93, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
