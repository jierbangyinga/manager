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
				JOptionPane.showMessageDialog(null, "���Ų�����");
			}else {
				
				String sql=null;
				if("����".equals(choice)) {
					if(message.length()>15) {
						JOptionPane.showMessageDialog(null, "����Ҫ���Ϲ淶��");
					}else {
						sql="update worker set name=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
						j.dispose();
					}
					
				}else if("����".equals(choice)) {
					if(Integer.parseInt(message)<0) {
						JOptionPane.showMessageDialog(null, "����Ҫ���Ϲ淶��");
					}else {
						sql="update worker set age=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setInt(1, Integer.parseInt(message));
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
						j.dispose();
					}
					
				}else if("�Ա�".equals(choice)) {
					if(!("��".equals(message)||"Ů".equals(message))) {
						JOptionPane.showMessageDialog(null, "�Ա�Ҫ���Ϲ淶��");
					}else {
						sql="update worker set sex=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
						j.dispose();
					}
				}else if("����".equals(choice)) {
					if(message.length()>10) {
						JOptionPane.showMessageDialog(null, "����Ҫ���Ϲ淶��");
					}else {
						sql="update worker set dept=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
						j.dispose();
					}
				}else if("����".equals(choice)) {
					if(message.length()<5||message.length()>20) {
						JOptionPane.showMessageDialog(null, "����Ҫ���Ϲ淶��");
					}else {
						sql="update worker set password=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
						j.dispose();
					}
				}else if("�绰".equals(choice)) {
					if(message.length()!=11) {
						JOptionPane.showMessageDialog(null, "�绰����Ҫ���Ϲ淶��");
					}else {
						sql="update worker set phone=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
						j.dispose();
					}
				}else {
					if(message.length()>15) {
						JOptionPane.showMessageDialog(null, "ְλ����Ҫ���Ϲ淶��");
					}else {
						sql="update worker set work=? where number=?";
						pst=conn.prepareStatement(sql);
						pst.setString(1, message);
						pst.setString(2, number);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
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
