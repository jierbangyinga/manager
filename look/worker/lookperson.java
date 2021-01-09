package worker;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Bean.worker;

import javax.swing.ImageIcon;

public class lookperson {

	private JFrame frame;
	private worker w;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public lookperson(worker w) {
		this.w=w;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("¿¬Ìå",Font.BOLD,20);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setBounds(125, 18, 70, 42);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(w.getName());
		lblNewLabel_1.setBounds(205, 32, 97, 15);
		lblNewLabel_1.setFont(f);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u804C\u5DE5\u53F7\uFF1A");
		lblNewLabel_2.setBounds(105, 78, 84, 27);
		lblNewLabel_2.setFont(f);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(w.getNumber());
		lblNewLabel_3.setBounds(205, 84, 93, 15);
		lblNewLabel_3.setFont(f);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel_4.setBounds(125, 128, 71, 27);
		lblNewLabel_4.setFont(f);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(w.getAge()+"");
		lblNewLabel_5.setBounds(205, 134, 97, 15);
		lblNewLabel_5.setFont(f);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_6.setBounds(125, 182, 70, 15);
		lblNewLabel_6.setFont(f);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(w.getSex());
		lblNewLabel_7.setBounds(205, 182, 93, 15);
		lblNewLabel_7.setFont(f);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u90E8\u95E8\uFF1A");
		lblNewLabel_8.setBounds(125, 225, 64, 15);
		lblNewLabel_8.setFont(f);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(w.getDept());
		lblNewLabel_9.setBounds(205, 225, 97, 15);
		lblNewLabel_9.setFont(f);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u5DE5\u4F5C\uFF1A");
		lblNewLabel_10.setBounds(125, 271, 70, 15);
		lblNewLabel_10.setFont(f);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(w.getWork());
		lblNewLabel_11.setBounds(205, 271, 81, 15);
		lblNewLabel_11.setFont(f);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel_13.setBounds(125, 296, 70, 35);
		lblNewLabel_13.setFont(f);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel(w.getPhone());
		lblNewLabel_14.setBounds(205, 306, 139, 15);
		lblNewLabel_14.setFont(f);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_12.setBounds(0, 0, 434, 341);
		frame.getContentPane().add(lblNewLabel_12);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
