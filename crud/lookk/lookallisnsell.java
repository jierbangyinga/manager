package lookk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class lookallisnsell {
	public String[][] look(){
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select count(*) as sum from salary where isfa=?";
			pst=conn.prepareStatement(sql2);
			pst.setInt(1, 0);
			rs=pst.executeQuery();
			rs.next();
			int sum=rs.getInt("sum");
			String sql="select * from salary where isfa=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, 0);
			rs=pst.executeQuery();
			String[][] o=new String[sum][4];
			int i=0;
			while(rs.next()) {
				o[i][0]=rs.getString("number");
				o[i][1]=rs.getString("name");
				o[i][2]=rs.getInt("total")+"";
				o[i][3]="Î´·¢·Å";
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
