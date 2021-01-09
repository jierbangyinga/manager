package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lookk.lookkallsalary;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class lookallsalary {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public lookallsalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u67E5\u770B\u6240\u6709\u5458\u5DE5\u5DE5\u8D44");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 414, 242);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new lookkallsalary().looksalary(),
			new String[] {
				"\u5DE5\u53F7", "\u59D3\u540D", "\u57FA\u7840\u5DE5\u8D44", "\u52A0\u73ED", "\u591C\u73ED", "\u8FDF\u5230", "\u672C\u6708\u5DE5\u8D44"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/10.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel);
	}

}
