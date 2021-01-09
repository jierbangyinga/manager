package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import search.searchhsomeone;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class searchsomeoneResult {

	private JFrame frame;
	private JTable table;
	private String choice;
	private String message;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public searchsomeoneResult(String choice,String message) {
		this.message=message;
		this.choice=choice;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 455, 242);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new searchhsomeone().searchsomeone(choice, message),
			new String[] {
				"\u5DE5\u53F7", "\u5BC6\u7801", "\u59D3\u540D", "\u5E74\u9F84", "\u6027\u522B", "\u7535\u8BDD", "\u90E8\u95E8", "\u804C\u4F4D"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img/2.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(lblNewLabel);

	}
}
