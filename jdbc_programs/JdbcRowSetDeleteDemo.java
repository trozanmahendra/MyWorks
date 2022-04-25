import javax.sql.rowset.*;
public class JdbcRowSetDeleteDemo {
    public static void main(String[] args)throws Exception {
        
		RowSetFactory rsf=RowSetProvider.newFactory();
		JdbcRowSet rs=rsf.createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/durgadb");
        rs.setUsername("root");
        rs.setPassword("root");
        rs.setCommand("select * from employees");
        rs.execute();
        while(rs.next()){
            float esal=rs.getFloat(3);
            if(esal>=5000){
                rs.deleteRow();
            }
        }
		System.out.println("Records Deleted Successfully");
		rs.close();
    }
}