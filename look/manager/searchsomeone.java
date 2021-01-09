package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class searchsomeone {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public searchsomeone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u67E5\u8BE2");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("¿¬Ìå",Font.BOLD,30);
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u5DE5\u53F7", "\u59D3\u540D", "\u90E8\u95E8", "\u804C\u4F4D", "\u5E74\u9F84", "\u6027\u522B"}));
		comboBox.setBounds(94, 95, 79, 21);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(183, 95, 175, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u641C\u7D22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String choice=comboBox.getSelectedItem().toString();
				String message=textField.getText();
				new searchsomeoneResult(choice,message);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(159, 149, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u67E5\u8BE2\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel.setBounds(128, 10, 197, 47);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel_1);
		

	}
}
