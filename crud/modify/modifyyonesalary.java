package modify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class modifyyonesalary {
	public void modifyonesalary(String choice,String message,String number,JFrame j) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select * from salary where number=?";
			pst=conn.prepareStatement(sql2);
			pst.setString(1, number);
			rs=pst.executeQuery();
			if(!(rs.next())) {
				JOptionPane.showMessageDialog(null, "工号不存在");
			}else {
				double d=rs.getDouble("basicwage");
				String sql=null;
				if("姓名".equals(choice)) {
					if(message.length()>15) {
						JOptionPane.showMessageDialog(null, "名字要符合规范！");
					}else {
						sql="update salary set name=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
					
				}else if("基础工资".equals(choice)) {
					if(Integer.parseInt(message)<0) {
						JOptionPane.showMessageDialog(null, "要符合规范！");
					}else {
						double salary=Integer.parseInt(message);
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
						sql="update salary set basicwage=?,total=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(message));
						pst.setDouble(2, salary);
						pst.setString(3, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
					
				}else if("加班".equals(choice)) {
					if(Integer.parseInt(message)<0||Integer.parseInt(message)>31) {
						JOptionPane.showMessageDialog(null, "填写要符合规范！");
					}else {
						double salary=d+Integer.parseInt(message)*100;
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
						sql="update salary set jiaban=?,total=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(message));
						pst.setDouble(2, salary);
						pst.setString(3, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}else if("夜班".equals(choice)) {
					if(Integer.parseInt(message)<0||Integer.parseInt(message)>31) {
						JOptionPane.showMessageDialog(null, "填写要符合规范！");
					}else {
						double salary=d+Integer.parseInt(message)*150;
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
						sql="update worker set night=?,total=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(message));
						pst.setDouble(2, salary);
						pst.setString(3, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}else if("迟到".equals(choice)) {
					if(Integer.parseInt(message)<0) {
						JOptionPane.showMessageDialog(null, "填写要符合规范！");
					}else {
						double salary=d-Integer.parseInt(message)*50;
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
						sql="update worker set late=?,total=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(message));
						pst.setDouble(2, salary);
						pst.setString(3, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}
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
