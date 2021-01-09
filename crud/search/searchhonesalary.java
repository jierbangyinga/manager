package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Bean.salary;
import manager.searchonesalaryResult;

public class searchhonesalary {
	public void searchonesalary(String number) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select * from salary where number=?";
			pst=conn.prepareStatement(sql2);
			pst.setString(1, number);
			rs=pst.executeQuery();
			if(!rs.next()) {
				JOptionPane.showMessageDialog(null, "查询的工号不存在！");
			}else {
				salary s=new salary();
				s.setNumber(number);
				s.setBasicwage(rs.getInt("basicwage"));
				s.setJiaban(rs.getInt("jiaban"));
				s.setLate(rs.getInt("late"));
				s.setName(rs.getString("name"));
				s.setNight(rs.getInt("night"));
				s.setTotal(rs.getDouble("total"));
				new searchonesalaryResult(s);
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
