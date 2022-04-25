import javax.sql.rowset.*;
public class JdbcRowSetUpdateDemo {
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
            if(esal<3500){
                float new_Esal=esal+777;
                rs.updateFloat(3, new_Esal);
                rs.updateRow();
            }
        }
		System.out.println("Records Updated Successfully");
		rs.close();
    }
}