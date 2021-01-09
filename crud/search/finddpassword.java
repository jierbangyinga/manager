package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Bean.salary;
import manager.searchonesalaryResult;

public class finddpassword {
	public void findpassword(String number,String message) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select * from passwordprotect where number=?";
			pst=conn.prepareStatement(sql2);
			pst.setString(1, number);
			rs=pst.executeQuery();
			if(!rs.next()) {
				JOptionPane.showMessageDialog(null, "�˹���δ�����ܱ���");
			}else {
				if(message.equals(rs.getString("protect"))) {
					String sql="select * from worker where number=?";
					pst=conn.prepareStatement(sql);
					pst.setString(1,number);
					rs=pst.executeQuery();
					rs.next();
					JOptionPane.showMessageDialog(null, "��������ǣ�"+rs.getString("password"));
				}else {
					JOptionPane.showMessageDialog(null, "�ܱ��򹤺Ų���ȷ��");
				}
			}
			
			
		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
