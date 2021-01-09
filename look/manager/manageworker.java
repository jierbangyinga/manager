package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class manageworker {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public manageworker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 439, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("¿¬Ìå",Font.BOLD,30);
		JLabel lblNewLabel = new JLabel("\u7BA1\u7406\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel.setBounds(124, 0, 320, 48);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u67E5\u8BE2\u6240\u6709\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new lookallworker();
			}
		});
		lblNewLabel_1.setForeground(new Color(51, 0, 204));
		lblNewLabel_1.setBounds(161, 79, 107, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5F55\u5165\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new luruworker();
			}
		});
		lblNewLabel_2.setForeground(new Color(0, 0, 204));
		lblNewLabel_2.setBounds(172, 123, 85, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u67E5\u8BE2\u67D0\u4E2A\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new searchsomeone();
			}
		});
		lblNewLabel_3.setForeground(new Color(0, 0, 153));
		lblNewLabel_3.setBounds(161, 163, 107, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5220\u9664\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new deletesomeone();
			}
		});
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setBounds(172, 203, 96, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u4FEE\u6539\u5458\u5DE5\u4FE1\u606F");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new modifysomeone();
			}
		});
		lblNewLabel_5.setForeground(new Color(0, 102, 255));
		lblNewLabel_5.setBounds(172, 242, 96, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u8BBE\u7F6E\u7BA1\u7406\u5458");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new setmanager();
			}
		});
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setBounds(183, 272, 85, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("img/0.jpg"));
		lblNewLabel_7.setBounds(0, 0, 423, 297);
		frame.getContentPane().add(lblNewLabel_7);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
