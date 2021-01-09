package manager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lookk.lookallisnsell;
import modify.fafang;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tongissell {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public tongissell() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 3, 414, 249);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new lookallisnsell().look(),
			new String[] {
				"    \u5DE5\u53F7", "   \u59D3\u540D", "    \u5DE5\u8D44", "   \u53D1\u653E"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		table.getColumnModel().getColumn(1).setPreferredWidth(66);
		table.getColumnModel().getColumn(2).setPreferredWidth(79);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(451, 25, 66, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u53D1\u653E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText();
				new fafang().fa(number);
				table.setModel(new DefaultTableModel(
						new lookallisnsell().look(),
						new String[] {
							"    \u5DE5\u53F7", "   \u59D3\u540D", "    \u5DE5\u8D44", "   \u53D1\u653E"
						}
					));
					table.getColumnModel().getColumn(0).setPreferredWidth(89);
					table.getColumnModel().getColumn(1).setPreferredWidth(66);
					table.getColumnModel().getColumn(2).setPreferredWidth(79);
					scrollPane.setViewportView(table);
			}
		});
		btnNewButton.setBounds(451, 56, 66, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5DE5\u53F7");
		lblNewLabel.setBounds(451, 10, 54, 15);
		frame.getContentPane().add(lblNewLabel);
	}
}
