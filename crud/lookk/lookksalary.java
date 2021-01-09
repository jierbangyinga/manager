package lookk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.salary;
import Bean.worker;
import worker.lookperson;
import worker.looksalary;

public class lookksalary {
	public void looksalary(String number) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql="select * from salary where number= ?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, number);
			rs=pst.executeQuery();
			salary s=null;
			if(rs.next()) {
				s=new salary();
				s.setNumber(number);
				s.setName(rs.getString("name"));
				s.setBasicwage(rs.getInt("basicwage"));
				s.setJiaban(rs.getInt("jiaban"));
				s.setNight(rs.getInt("night"));
				s.setLate(rs.getInt("late"));
				s.setIsfa(rs.getInt("isfa"));
				s.setTotal(rs.getDouble("total"));
			}	
			new looksalary(s);
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
