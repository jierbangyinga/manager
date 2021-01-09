package loginn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import worker.lookperson;
import javax.swing.JOptionPane;

import Bean.worker;
import worker.workerchoice;


public class lookkperson {
	public void lookperson(String number) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql="select * from worker where number= ?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, number);
			rs=pst.executeQuery();
			worker w=null;
			if(rs.next()) {
				w=new worker();
				w.setNumber(rs.getString("number"));
				w.setName(rs.getString("name"));
				w.setAge(rs.getInt("age"));
				w.setSex(rs.getString("sex"));
				w.setPhone(rs.getString("phone"));
				w.setDept(rs.getString("dept"));
				w.setWork(rs.getString("work"));
			}	
			new lookperson(w);
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
