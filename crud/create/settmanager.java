package create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class settmanager {
	public void setmanager(String number,JFrame j) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select * from worker where number=?";
			pst=conn.prepareStatement(sql2);
			pst.setString(1, number);
			rs=pst.executeQuery();
			if(!rs.next()) {
				JOptionPane.showMessageDialog(null, "���Ų����ڣ�");
			}else {
				String password=rs.getString("password");
				String sql3="select * from manager where username=?";
				pst=conn.prepareStatement(sql3);
				pst.setString(1, number);
				rs=pst.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(null, "��Ҫ�ظ����ù���Ա��");
				}else {
					String sql="insert into manager values(?,?)";
				pst=conn.prepareStatement(sql);
				pst.setString(1, number);
				pst.setString(2, password);
				pst.executeUpdate();	
				JOptionPane.showMessageDialog(null, "���óɹ���");
				j.dispose();
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
