package lookk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.worker;
import worker.lookperson;

public class lookkallworker {
	public String[][] lookallperson() {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select count(*) as sum from worker";
			pst=conn.prepareStatement(sql2);
			rs=pst.executeQuery();
			rs.next();
			int sum=rs.getInt("sum");
			String sql="select * from worker";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			String[][] o=new String[sum][8];
			int i=0;
			while(rs.next()) {
				o[i][0]=rs.getString("number");
				o[i][1]=rs.getString("password");
				o[i][2]=rs.getString("name");
				o[i][3]=rs.getInt("age")+"";
				o[i][4]=rs.getString("sex");
				o[i][5]=rs.getString("phone");
				o[i][6]=rs.getString("dept");
				o[i][7]=rs.getString("work");
				i++;
			}	
			return o;
			
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
		
		return null;
	}
}
