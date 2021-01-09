package test;


import delete.deleteeonesalary;
import delete.deleteesomeone;
import loginn.lookkperson;
import loginn.managerloginn;
import loginn.workerloginn;
import modify.*;


import search.finddpassword;
import search.searchhonesalary;
import search.summallsalary;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class testMethod {
    /*@Test
    public void testDaochu(){
       JFrame j=new JFrame();
       new daochu().dao("D:/aaa.xls",j);
    }
    @Test
    public void testluruusalary(){
        JFrame j=new JFrame();
        new luruusalary().lurusalary("111","lc","2000",j);
    }
    @Test
    public void luruuworker(){
        JFrame j=new JFrame();
        new luruuworker().luruworker("111","lc","��","19","11111111111","ww","aa",j);
    }
    @Test
    public void testpassworddprotyect(){
        new passworddprotect().protectpassword("111");
    }
    @Test
    public void testrecoddone(){
        JFrame j=new JFrame();
        new recoddone().recodeone("1","�Ӱ�",j);
    }
    @Test
    public void settmanager(){
        JFrame j=new JFrame();
        new settmanager().setmanager("2",j);
    }
    @Test
    public void testSettprotect(){
        JFrame j=new JFrame();
        new settprotect().setprotect("1","111",j);
    }
    @Test
    public void testdeleteeonesalary(){
        JFrame j=new JFrame();
        new deleteeonesalary().deleteonesalary("2",j);
    }
    @Test
    public void testdeleteesomeone(){
        JFrame j=new JFrame();
        new deleteesomeone().deletesomeone("111",j);
    }
    @Test
    public void lookkperson(){
        new lookkperson().lookperson("1");
    }
    @Test
    public void testmanagerloginn(){
        new managerloginn().login("1","1234567");
    }
    @Test
    public void testworkerloginn(){
        new workerloginn().login("1","1234567");
    }
    @Test
    public void testchushihua(){
        new chushihua().chu();
    }
    @Test
    public void testfafang(){
        new fafang().fa("1");
    }
    @Test
    public void testmodifyyonesalary(){
        JFrame j=new JFrame();
        new modifyyonesalary().modifyonesalary("��������","3000","1",j);
    }
    @Test
    public void testmodifyypassword(){
        JFrame j=new JFrame();
        new modifyypassword().modifypassword("1","1234567","123456",j);
    }
    @Test
    public void modifyyperson(){
        JFrame j=new JFrame();
        new modifyyperson().modifyperson("1","sex","Ů",j);
    }
    @Test
    public void testmodifyysomeone(){
        JFrame j=new JFrame();
        new modifyysomeone().modifysomeone("1","����","aaa",j);
    }
    @Test
    public void testfinddpassword(){
        new finddpassword().findpassword("2","1312");
    }
    @Test
    public void testsearchhonesalary(){
        new searchhonesalary().searchonesalary("1");
    }
    @Test
    public void summallsalary(){
        new summallsalary().sumallsalary();
    }
    @Test
    public void test1() throws Exception{
        String sql = "select * from worker where number=?";
        Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/salary?serverTimezone=GMT","root","wq5201314.");;
        for(int i=1;i<=10000;i++){
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,i+"");
            ResultSet rs=ps.executeQuery();
            rs.next();
            String name=rs.getString("name");
            int salary=2000+i*10;
            new luruusalary().lurusalary(i+"",name,salary+"",new JFrame());
        }
    }

*/
}
