package worker;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Bean.salary;

import javax.swing.ImageIcon;
import java.awt.Color;

public class looksalary {

	private JFrame frame;
	private salary s;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public looksalary(salary s) {
		this.s=s;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u67E5\u770B\u4E2A\u4EBA\u5DE5\u8D44\u4FE1\u606F");
		frame.setBounds(100, 100, 450, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("楷体",Font.BOLD,20);
		JLabel lblNewLabel = new JLabel("\u5DE5\u53F7\uFF1A");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(140, 10, 72, 27);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(s.getNumber());
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(234, 10, 99, 27);
		lblNewLabel_1.setFont(f);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setBounds(140, 61, 72, 15);
		lblNewLabel_2.setFont(f);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(s.getName());
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setBounds(234, 61, 99, 15);
		lblNewLabel_3.setFont(f);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u52A0\u73ED\u5929\u6570\uFF1A");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setBounds(97, 136, 115, 15);
		lblNewLabel_4.setFont(f);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(s.getJiaban()+"");
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setBounds(234, 136, 99, 15);
		lblNewLabel_5.setFont(f);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u591C\u73ED\u65F6\u957F\uFF1A");
		lblNewLabel_6.setForeground(new Color(0, 0, 255));
		lblNewLabel_6.setBounds(97, 177, 115, 15);
		lblNewLabel_6.setFont(f);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(s.getNight()+"");
		lblNewLabel_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_7.setBounds(234, 177, 99, 15);
		lblNewLabel_7.setFont(f);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u8FDF\u5230\u5929\u6570\uFF1A");
		lblNewLabel_8.setForeground(new Color(0, 0, 255));
		lblNewLabel_8.setBounds(97, 215, 115, 15);
		lblNewLabel_8.setFont(f);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(s.getLate()+"");
		lblNewLabel_9.setForeground(new Color(0, 0, 255));
		lblNewLabel_9.setBounds(234, 215, 99, 15);
		lblNewLabel_9.setFont(f);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u4E94\u9669\u4E00\u91D1\uFF1A");
		lblNewLabel_10.setForeground(new Color(0, 0, 255));
		lblNewLabel_10.setBounds(97, 253, 115, 15);
		lblNewLabel_10.setFont(f);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("1000");
		lblNewLabel_11.setForeground(new Color(0, 0, 255));
		lblNewLabel_11.setBounds(234, 253, 99, 15);
		lblNewLabel_11.setFont(f);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u57FA\u7840\u5DE5\u8D44\uFF1A");
		lblNewLabel_12.setForeground(new Color(0, 0, 255));
		lblNewLabel_12.setBounds(97, 100, 115, 15);
		lblNewLabel_12.setFont(f);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel(s.getBasicwage()+"");
		lblNewLabel_13.setForeground(new Color(0, 0, 255));
		lblNewLabel_13.setBounds(234, 100, 99, 15);
		lblNewLabel_13.setFont(f);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u662F\u5426\u53D1\u653E\uFF1A");
		lblNewLabel_14.setForeground(new Color(0, 0, 255));
		lblNewLabel_14.setBounds(97, 284, 115, 15);
		lblNewLabel_14.setFont(f);
		frame.getContentPane().add(lblNewLabel_14);
		String a=null;
		if(s.getIsfa()==0) {
			a="未发放";
		}else {
			a="已发放";
		}
		JLabel lblNewLabel_15 = new JLabel(a);
		lblNewLabel_15.setForeground(new Color(0, 0, 255));
		lblNewLabel_15.setBounds(233, 284, 100, 15);
		lblNewLabel_15.setFont(f);
		frame.getContentPane().add(lblNewLabel_15);
		
		
		JLabel lblNewLabel_17 = new JLabel("\u672C\u6708\u5DE5\u8D44\uFF1A");
		lblNewLabel_17.setForeground(new Color(0, 0, 255));
		lblNewLabel_17.setBounds(97, 315, 115, 15);
		lblNewLabel_17.setFont(f);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel(s.getTotal()+"");
		lblNewLabel_18.setForeground(new Color(0, 0, 255));
		lblNewLabel_18.setBounds(234, 315, 99, 15);
		lblNewLabel_18.setFont(f);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("D:\\eclipse-workspace\\salarymanager\\img\\1.jpg"));
		lblNewLabel_16.setBounds(0, 0, 434, 352);
		frame.getContentPane().add(lblNewLabel_16);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
