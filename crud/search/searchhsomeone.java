package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class searchhsomeone {
	public String[][] searchsomeone(String choice,String message){
		String sql=null;
		String sql2=null;
		if("姓名".equals(choice)) {
			sql2="select count(*) as sum from worker where name=?";
			sql="select * from worker where name=?";
		}else if("工号".equals(choice)) {
			sql2="select count(*) as sum from worker where number=?";
			sql="select * from worker where number=?";
		}else if("年龄".equals(choice)) {
			sql2="select count(*) as sum from worker where age=?";
			sql="select * from worker where age=?";
			
		}else if("性别".equals(choice)) {
			sql2="select count(*) as sum from worker where sex=?";
			sql="select * from worker where sex=?";
		}else if("部门".equals(choice)) {
			sql2="select count(*) as sum from worker where dept=?";
			sql="select * from worker where dept=?";
		}else {
			sql2="select count(*) as sum from worker where work=?";
			sql="select * from worker where work=?";
		}
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			pst=conn.prepareStatement(sql2);
			pst.setString(1, message);
			rs=pst.executeQuery();
			rs.next();
			int sum=rs.getInt("sum");
			pst=conn.prepareStatement(sql);
			pst.setString(1, message);
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
