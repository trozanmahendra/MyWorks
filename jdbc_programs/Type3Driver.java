import java.sql.*;
public class Type3Driver {
public static void main(String[] args)throws Exception {	
  Class.forName("ids.sql.IDSDriver").newInstance();
    Connection conn = DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn='durgasoft'", "scott","tiger");
System.out.println("Connection Established"+conn);
Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery("select * from movies");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getString(4));
		}
		conn.close();
	}

}

//set CLASSPATH=D:\IDSServer\classes\jdk13drv.jar;.;
