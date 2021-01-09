package manager;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Bean.salary;

import javax.swing.ImageIcon;

public class searchonesalaryResult {

	private JFrame frame;
	private salary s;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public searchonesalaryResult(salary s) {
		this.s=s;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 286, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font f=new Font("楷体",Font.BOLD,25);
		
		JLabel lblNewLabel = new JLabel("工号："+s.getNumber());
		lblNewLabel.setBounds(29, 23, 231, 30);
		lblNewLabel.setFont(f);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("名字："+s.getName());
		lblNewLabel_1.setBounds(29, 65, 231, 36);
		lblNewLabel_1.setFont(f);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("基础工资："+s.getBasicwage());
		lblNewLabel_2.setBounds(29, 122, 231, 25);
		lblNewLabel_2.setFont(f);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("加班："+s.getJiaban());
		lblNewLabel_3.setBounds(29, 157, 126, 28);
		lblNewLabel_3.setFont(f);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("夜班："+s.getNight());
		lblNewLabel_4.setBounds(29, 206, 126, 28);
		lblNewLabel_4.setFont(f);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("迟到："+s.getLate());
		lblNewLabel_5.setBounds(29, 252, 126, 28);
		lblNewLabel_5.setFont(f);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("本月工资："+s.getTotal());
		lblNewLabel_6.setBounds(29, 290, 270, 28);
		lblNewLabel_6.setFont(f);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("img/4.jpg"));
		lblNewLabel_7.setBounds(0, 0, 270, 351);
		frame.getContentPane().add(lblNewLabel_7);
	}

}
