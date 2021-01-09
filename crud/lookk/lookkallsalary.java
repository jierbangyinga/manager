package lookk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class lookkallsalary {
	public String[][] looksalary() {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select count(*) as sum from salary";
			pst=conn.prepareStatement(sql2);
			rs=pst.executeQuery();
			rs.next();
			int sum=rs.getInt("sum");
			String sql="select * from salary order by total";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			String[][] o=new String[sum][7];
			int i=0;
			while(rs.next()) {
				o[i][0]=rs.getString("number");
				o[i][1]=rs.getString("name");
				o[i][2]=rs.getInt("basicwage")+"";
				o[i][3]=rs.getInt("jiaban")+"";
				o[i][4]=rs.getInt("night")+"";
				o[i][5]=rs.getInt("late")+"";
				o[i][6]=rs.getDouble("total")+"";
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
