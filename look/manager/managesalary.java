package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import create.daochu;
import modify.chushihua;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class managesalary {

	private JFrame frame;
	private final JLabel lblNewLabel_10 = new JLabel("\u5BFC\u51FA\u672C\u6708\u6570\u636E");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public managesalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5458\u5DE5\u5DE5\u8D44\u7BA1\u7406");
		frame.setBounds(100, 100, 450, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("¿¬Ìå",Font.BOLD,30);
		JLabel lblNewLabel = new JLabel("\u5458\u5DE5\u5DE5\u8D44\u7BA1\u7406");
		lblNewLabel.setBounds(122, 0, 217, 42);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u67E5\u770B\u6240\u6709\u5458\u5DE5\u5DE5\u8D44\u60C5\u51B5");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new lookallsalary();
			}
		});
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(162, 60, 134, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u67E5\u770B\u67D0\u4E2A\u5458\u5DE5\u5DE5\u8D44\u60C5\u51B5");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new searchonesalary();
			}
		});
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(162, 97, 134, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5F55\u5165\u5458\u5DE5\u5DE5\u8D44\u60C5\u51B5");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new lurusalary();
			}
		});
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(173, 134, 107, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u4FEE\u6539\u5458\u5DE5\u5DE5\u8D44\u60C5\u51B5");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new modifyonesalary();
			}
		});
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setBounds(173, 169, 107, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u5220\u9664\u5458\u5DE5\u5DE5\u8D44\u60C5\u51B5");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new deleteonesalary();
			}
		});
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setBounds(173, 207, 123, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u767B\u8BB0\u5458\u5DE5\u8FDF\u5230/\u52A0\u73ED");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new recodeone();
			}
		});
		lblNewLabel_6.setForeground(new Color(0, 0, 255));
		lblNewLabel_6.setBounds(173, 244, 113, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u7EDF\u8BA1\u672C\u6708\u516C\u53F8\u5DE5\u8D44\u652F\u51FA");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new sumallsalary();
			}
		});
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setBounds(162, 280, 134, 15);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u7EDF\u8BA1\u672A\u53D1\u653E\u5458\u5DE5");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new tongissell();
			}
		});
		lblNewLabel_8.setForeground(new Color(0, 0, 255));
		lblNewLabel_8.setBounds(176, 310, 93, 15);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u6708\u521D\u521D\u59CB\u5316");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new chushihua().chu();
			}
		});
		lblNewLabel_9.setForeground(new Color(0, 0, 255));
		lblNewLabel_9.setBounds(186, 335, 83, 15);
		frame.getContentPane().add(lblNewLabel_9);
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new inputlu();
			}
		});
		lblNewLabel_10.setForeground(Color.BLUE);
		lblNewLabel_10.setBounds(183, 350, 113, 33);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("img/0.jpg"));
		lblNewLabel_11.setBounds(0, 0, 434, 393);
		frame.getContentPane().add(lblNewLabel_11);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
