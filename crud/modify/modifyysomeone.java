package modify;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class modifyysomeone {
	public void modifysomeone(String number,String choice,String message,JFrame j) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql2="select * from worker where number=?";
			pst=conn.prepareStatement(sql2);
			pst.setString(1, number);
			rs=pst.executeQuery();
			if(!(rs.next())) {
				JOptionPane.showMessageDialog(null, "工号不存在");
			}else {
				
				String sql=null;
				if("姓名".equals(choice)) {
					if(message.length()>15) {
						JOptionPane.showMessageDialog(null, "名字要符合规范！");
					}else {
						sql="update worker set name=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
					
				}else if("年龄".equals(choice)) {
					if(Integer.parseInt(message)<0) {
						JOptionPane.showMessageDialog(null, "年龄要符合规范！");
					}else {
						sql="update worker set age=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(message));
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
					
				}else if("性别".equals(choice)) {
					if(!("男".equals(message)||"女".equals(message))) {
						JOptionPane.showMessageDialog(null, "性别要符合规范！");
					}else {
						sql="update worker set sex=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}else if("部门".equals(choice)) {
					if(message.length()>10) {
						JOptionPane.showMessageDialog(null, "部门要符合规范！");
					}else {
						sql="update worker set dept=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}else if("密码".equals(choice)) {
					if(message.length()<5||message.length()>20) {
						JOptionPane.showMessageDialog(null, "密码要符合规范！");
					}else {
						sql="update worker set password=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}else if("电话".equals(choice)) {
					if(message.length()!=11) {
						JOptionPane.showMessageDialog(null, "电话号码要符合规范！");
					}else {
						sql="update worker set phone=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "修改成功！");
						j.dispose();
					}
				}else {
					if(message.length()>15) {
						JOptionPane.showMessageDialog(null, "职位名称要符合规范！");
					}else {
						sql="update worker set work=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
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
