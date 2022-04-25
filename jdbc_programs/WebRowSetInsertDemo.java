import java.io.*;
import javax.sql.rowset.*;
public class WebRowSetInsertDemo {
    public static void main(String[] args)throws Exception {
        RowSetFactory rsf=RowSetProvider.newFactory();
		WebRowSet rs=rsf.createWebRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/durgadb?relaxAutoCommit=true");
        rs.setUsername("root");
        rs.setPassword("root");
        rs.setCommand("select * from employees");
        rs.execute();
        FileReader fr=new FileReader("emp.xml");
        rs.readXml(fr);
		rs.moveToCurrentRow();
        rs.acceptChanges();
        System.out.println("emp data inserted successfully");
        fr.close();
		rs.close();
    }
}