package create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class luruuworker {
	public void luruworker(String number,String name,String sex,String age,String phone,String dept,String work,JFrame j) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select * from worker where number=?";
			pst=conn.prepareStatement(sql2);
			pst.setString(1, number);
			rs=pst.executeQuery();
			if(rs.next()) {
				JOptionPane.showMessageDialog(null, "工号重复了！");
			}else {
				String sql="insert into worker values(?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, number);
			pst.setString(2, "123456");
			pst.setString(3, name);
			
			pst.setInt(4, Integer.parseInt(age));
			pst.setString(5, sex);
			pst.setString(6, phone);
			pst.setString(7, dept);
			pst.setString(8, work);
			pst.executeUpdate();	
			JOptionPane.showMessageDialog(null, "录入成功！");
			j.dispose();
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
