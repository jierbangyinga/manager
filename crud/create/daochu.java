package create;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class daochu {
	public void dao(String lu,JFrame j) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");
			String sql="select * from salary";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			WritableWorkbook wwb = null;
	            // ������д���Excel������
	            String fileName = lu;
	            File file=new File(fileName);
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            //��fileNameΪ�ļ���������һ��Workbook
	            wwb = Workbook.createWorkbook(file);
	            // ����������
	            WritableSheet ws = wwb.createSheet("�û���Ϣ", 0);
	            //��ѯ���ݿ������е�����
	           
	            //Ҫ���뵽��Excel�����кţ�Ĭ�ϴ�0��ʼ
	            Label labelNumber= new Label(0, 0, "����(number)");//��ʾ��
	            Label labelBasicwage= new Label(1, 0, "��������(basicwage)");
	            Label labelJiaban= new Label(2, 0, "�Ӱ�(jiaban)");
	            Label labelNight= new Label(3, 0, "ҹ��(night)");
	            Label labelLate= new Label(4, 0, "�ٵ�(late)");
	            Label labelName= new Label(5, 0, "����(name)");
	            Label labelTotal= new Label(6, 0, "���¹���(total)");
	            ws.addCell(labelNumber);
	            ws.addCell(labelBasicwage);
	            ws.addCell(labelJiaban);
	            ws.addCell(labelNight);
	            ws.addCell(labelLate);
	            ws.addCell(labelName);
	            ws.addCell(labelTotal);
	            int i=0;
	            while(rs.next()){
	                Label labelNumber_i= new Label(0, i+1, rs.getString("number"));
	                Label labelBasicwage_i= new Label(1, i+1, rs.getInt("basicwage")+"");
	                Label labelJiaban_i= new Label(2, i+1, rs.getInt("jiaban")+"");
	                Label labelNight_i= new Label(3, i+1, rs.getInt("night")+"");
	                Label labelLate_i= new Label(4, i+1, rs.getInt("late")+"");
	                Label labelName_i= new Label(5, i+1, rs.getString("name"));
	                Label labelTotal_i= new Label(6, i+1, rs.getDouble("total")+"");
	                ws.addCell(labelNumber_i);
	                ws.addCell(labelName_i);
	                ws.addCell(labelBasicwage_i);
	                ws.addCell(labelNight_i);
	                ws.addCell(labelLate_i);
	                ws.addCell(labelTotal_i);
	                ws.addCell(labelJiaban_i);
	                i++;
	            }
	            //д���ĵ�
	            wwb.write();
	            // �ر�Excel����������
	            wwb.close();
	            JOptionPane.showMessageDialog(null, "�����ɹ���");
	            j.dispose();
		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "·������ȷ��");
		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
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
