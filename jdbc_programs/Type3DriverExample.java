import java.sql.*;
public class Type3DriverExample {
public static void main(String[] args)throws Exception {	
Class.forName("ids.sql.IDSDriver");
System.out.println("*******DriverLoaded************");
Connection con=DriverManager.getConnection
	("jdbc:ids://localhost:12/conn?dsn='durgasoft99'","system","tiger");
System.out.println("Connection Established"+con);
Statement stmt=con.createStatement();
int count=stmt.executeUpdate("insert into student values(99,'rohit',92)");
System.out.println("The number of rows effected:"+ count);
}

}

