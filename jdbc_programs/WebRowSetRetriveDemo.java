import java.io.*;
import javax.sql.rowset.*;

public class WebRowSetRetriveDemo {
    public static void main(String[] args)throws Exception {
        RowSetFactory rsf=RowSetProvider.newFactory();
		WebRowSet rs=rsf.createWebRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/durgadb");
        rs.setUsername("root");
        rs.setPassword("root");
        rs.setCommand("select * from employees");
        rs.execute();
        FileWriter fw=new FileWriter("emp.xml");
        rs.writeXml(fw);
        System.out.println("Employee Data transfered to emp.xml file");
        fw.close();
    }
}