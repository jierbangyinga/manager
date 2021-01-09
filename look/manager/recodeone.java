package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import create.recoddone;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class recodeone {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public recodeone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u767B\u8BB0");
		frame.setBounds(100, 100, 291, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(116, 48, 126, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u52A0\u73ED", "\u591C\u73ED", "\u8FDF\u5230"}));
		comboBox.setBounds(40, 48, 66, 21);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("\u8BB0\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				String choice=comboBox.getSelectedItem().toString();
				if("".equals(number)) {
					JOptionPane.showMessageDialog(null, "工号不能为空！");
				}else {
					new recoddone().recodeone(number,choice,frame);
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(86, 117, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/1.jpg"));
		lblNewLabel.setBounds(0, 0, 275, 189);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
