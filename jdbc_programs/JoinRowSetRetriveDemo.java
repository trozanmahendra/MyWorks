import java.sql.*;
import javax.sql.rowset.*;
public class JoinRowSetRetriveDemo {
    public static void main(String[] args)throws Exception {
        //Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root", "root");
        RowSetFactory rsf=RowSetProvider.newFactory();

        CachedRowSet rs1=rsf.createCachedRowSet();
        rs1.setCommand("select * from students");
        rs1.execute(con);
        
        CachedRowSet rs2=rsf.createCachedRowSet();
        rs2.setCommand("select * from courses");
        rs2.execute(con);
        
        JoinRowSet rs=rsf.createJoinRowSet();
        rs.addRowSet(rs1, 4);
        rs.addRowSet(rs2, 1);
        System.out.println("SID\tSNAME\tSADDR\tCID\tCNAME\tCCOST");
        System.out.println("---------------------------------------------");
        while(rs.next()){
            System.out.print(rs.getString(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.print(rs.getString(4)+"\t");
            System.out.print(rs.getString(5)+"\t");
            System.out.print(rs.getString(6)+"\n");
        }
        con.close();
    }
    
}
/*
create table students(sid int primary key,sname varchar(20),saddr varchar(20),cid int);

insert into students values(100,"durga","Hyd",1001);
insert into students values(200,"ravi","Hyd",1002);

create table courses(cid int primary key,cname varchar(20),ccost int);
insert into courses values(1001,"Core Java",1000);
insert into courses values(1002,"Adv Java",2000);
*/