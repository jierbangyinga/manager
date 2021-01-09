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
	            // 创建可写入的Excel工作簿
	            String fileName = lu;
	            File file=new File(fileName);
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            //以fileName为文件名来创建一个Workbook
	            wwb = Workbook.createWorkbook(file);
	            // 创建工作表
	            WritableSheet ws = wwb.createSheet("用户信息", 0);
	            //查询数据库中所有的数据
	           
	            //要插入到的Excel表格的行号，默认从0开始
	            Label labelNumber= new Label(0, 0, "工号(number)");//表示第
	            Label labelBasicwage= new Label(1, 0, "基础工资(basicwage)");
	            Label labelJiaban= new Label(2, 0, "加班(jiaban)");
	            Label labelNight= new Label(3, 0, "夜班(night)");
	            Label labelLate= new Label(4, 0, "迟到(late)");
	            Label labelName= new Label(5, 0, "姓名(name)");
	            Label labelTotal= new Label(6, 0, "本月工资(total)");
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
	            //写进文档
	            wwb.write();
	            // 关闭Excel工作簿对象
	            wwb.close();
	            JOptionPane.showMessageDialog(null, "导出成功！");
	            j.dispose();
		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "路径不正确！");
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
