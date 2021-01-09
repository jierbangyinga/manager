package modify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import worker.workerchoice;

public class modifyypassword {
	public void modifypassword(String number,String password1,String password2,JFrame j) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql="select * from worker where number= ? and password= ?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, number);
			pst.setString(2, password1);
			rs=pst.executeQuery();
			if("".equals(number)||"".equals(password1)||"".equals(password2)) {
				JOptionPane.showMessageDialog(null, "不能为空！");
			}
			else if(rs.next()) {
				String sql2="update worker set password=? where number=?";
				pst=conn.prepareStatement(sql2);
				pst.setString(1, password2);
				pst.setString(2, number);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "修改成功");
				j.dispose();
			}else {
					JOptionPane.showMessageDialog(null, "职工号或密码不正确！");
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
