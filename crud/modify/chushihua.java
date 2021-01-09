package modify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class chushihua {
	public void chu() {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
				String sql="select * from salary";
				pst=conn.prepareStatement(sql);
				rs=pst.executeQuery();
				while(rs.next()) {
					String number=rs.getString("number");
					double salary=rs.getInt("basicwage");
					double money  = 1000+3500;
					if (salary<money){
			            salary=salary-1000;
			        }else if(salary-money<1500){
			            double a =(salary-money)*0.03-0;
			           salary=salary-a-1000;
			        }else if(1500<salary-money&&salary-money<4500){
			            double a =(salary-money)*0.10-105;
			            salary=salary-a-1000;
			        }else if(4500<salary-money&&salary-money<9000){
			            double a =(salary-money)*0.20-555;
			            salary=salary-a-1000;
			        }else if(9000<salary-money&&salary-money<35000){
			            double a =(salary-money)*0.25-1005;
			            salary=salary-a-1000;
			        }else if(35000<salary-money&&salary-money<55000){
			            double a =(salary-money)*0.30-2755;
			            salary=salary-a-1000;
			        }else if(55000<salary-money&&salary-money<80000){
			            double a =(salary-money)*0.35-5505;
			            salary=salary-a-1000;
			        }else if(80000<salary-money){
			            double a =(salary-money)*0.45-13505;
			            salary=salary-a-1000;
			        }
					String sql2="update salary set jiaban=?,night=?,late=?,isfa=?,total=? where number=?";
					pst=conn.prepareStatement(sql2);
					pst.setInt(1, 0);
					pst.setInt(2, 0);
					pst.setInt(3, 0);
					pst.setInt(4, 0);
					pst.setDouble(5, salary);
					pst.setString(6, number);
					pst.executeUpdate();
				}
				JOptionPane.showMessageDialog(null, "初始化成功");
				
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
