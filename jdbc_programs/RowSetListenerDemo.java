import javax.sql.*;
import javax.sql.rowset.*;
class RowSetListenerImpl implements RowSetListener{

    public void rowSetChanged(RowSetEvent event) {
        System.out.println("RowSetChanged");
    }

    public void rowChanged(RowSetEvent event) {
        System.out.println("RowChanged");
    }

    public void cursorMoved(RowSetEvent event) {
        System.out.println("CursorMoved"); 
    }
}
public class RowSetListenerDemo {

    public static void main(String[] args)throws Exception {
        RowSetFactory rsf=RowSetProvider.newFactory();
        JdbcRowSet rs=rsf.createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/durgadb");
        rs.setUsername("root");
        rs.setPassword("root");
        rs.setCommand("select * from employees");
        rs.addRowSetListener(new RowSetListenerImpl());
        rs.execute();
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
        }
        rs.moveToInsertRow();
        rs.updateInt(1, 777);
        rs.updateString(2, "malli");
        rs.updateFloat(3,9000);
        rs.updateString(4, "Hyd");
        rs.insertRow();
		rs.close();
        
    }
    
}