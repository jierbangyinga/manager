package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class loginchoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public loginchoice() {
		setBackground(Color.PINK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u804C\u5DE5\u767B\u5F55");
		btnNewButton.setForeground(new Color(102, 0, 0));
		btnNewButton.setBackground(new Color(153, 153, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new workerlogin();
			}
		});
		btnNewButton.setBounds(72, 168, 87, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7BA1\u7406\u5458\u767B\u5F55");
		btnNewButton_1.setForeground(new Color(153, 0, 0));
		btnNewButton_1.setBackground(new Color(153, 153, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new managerlogin();
			}
		});
		btnNewButton_1.setBounds(272, 168, 105, 34);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u804C \u5DE5 \u5DE5 \u8D44 \u7BA1 \u7406");
		lblNewLabel.setForeground(Color.PINK);
		Font f=new Font("Serief",Font.BOLD,40);
		lblNewLabel.setFont(f);
		lblNewLabel.setBounds(62, 0, 321, 90);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\\u6211\u7684\u6587\u6863\\My Pictures\\5.jpg"));
		lblNewLabel_1.setBounds(0, 0, 436, 262);
		contentPane.add(lblNewLabel_1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
}
