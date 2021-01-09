package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import loginn.workerloginn;
import worker.findpassword;
import worker.modifypassword;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class workerlogin extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public workerlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5458\u5DE5\u767B\u5F55");
		frame.setBounds(100, 100, 450, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Icon i=new ImageIcon("/img/5.jpg");
		JLabel lblNewLabel = new JLabel(i,JLabel.CENTER);
		
		lblNewLabel.setText("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, 0, 434, 112);
		
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u804C\u5DE5\u53F7");
		lblNewLabel_1.setBounds(117, 140, 63, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(177, 140, 155, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6\u7801");
		lblNewLabel_2.setBounds(116, 185, 54, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 182, 155, 21);
		frame.getContentPane().add(passwordField);
		
		
		JButton btnNewButton = new JButton("\u767B      \u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=new String(passwordField.getPassword());
				new workerloginn().login(username,password);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(119, 223, 213, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("\u4FEE\u6539\u5BC6\u7801");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new modifypassword();
			}
		});
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(380, 257, 54, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("\u627E\u56DE\u5BC6\u7801");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new findpassword();
			}
		});
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(0, 257, 54, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
