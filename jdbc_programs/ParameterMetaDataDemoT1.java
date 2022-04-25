import java.sql.*;
class ParameterMetaDataDemoT1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb","root","root");
		System.out.println("connection established..");
		PreparedStatement pst = con.prepareStatement("insert into employees values(?,?,?,?)");
		System.out.println("pst created...");
		ParameterMetaData pmd=pst.getParameterMetaData();
		int count=pmd.getParameterCount();
		for(int i=1;i<= count;i++)
		{
			System.out.println("Parameter Number:"+i);
			System.out.println("Parameter Mode:"+pmd.getParameterMode(i));
			System.out.println("Parameter Type:"+pmd.getParameterType(i));
			System.out.println("Parameter Precision:"+pmd.getPrecision(i));
			System.out.println("Parameter Scale:"+pmd.getScale(i));
			System.out.println("Parameter isSigned:"+pmd.isSigned(i));
			System.out.println("Parameter isNullable:"+pmd.isNullable(i));
			System.out.println("---------------");
		}
		con.close();
	}
}