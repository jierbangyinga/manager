package modify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class fafang {
	public void fa(String number) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql="select * from salary where number= ? and isfa= ?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, number);
			pst.setInt(2, 0);
			rs=pst.executeQuery();
			if("".equals(number)) {
				JOptionPane.showMessageDialog(null, "不能为空！");
			}
			else if(rs.next()) {
				String sql2="update salary set isfa=? where number=?";
				pst=conn.prepareStatement(sql2);
				pst.setInt(1, 1);
				pst.setString(2, number);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "发放成功");
			}else {
					JOptionPane.showMessageDialog(null, "工号不正确或工资已发放！");
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
