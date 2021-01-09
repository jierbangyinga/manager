package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import create.settmanager;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class setmanager {

	private JFrame frame;
	private JTextField textField;
	private final JLabel lblNewLabel_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public setmanager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 338, 162);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5DE5\u53F7");
		lblNewLabel.setBounds(134, 0, 322, 27);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(100, 27, 120, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				if("".equals(number)||number.length()>10) {
					JOptionPane.showMessageDialog(null, "工号输入不规范");
				}else {
					new settmanager().setmanager(number,frame);
				}
				
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(110, 58, 93, 23);
		frame.getContentPane().add(btnNewButton);
		lblNewLabel_1.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_1.setBounds(0, 0, 322, 124);
		frame.getContentPane().add(lblNewLabel_1);
		
	}

}
