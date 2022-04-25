import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class EmployeeAddFrame extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3,tf4;
	Button b1;
	String status="";
	EmployeeAddFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Employee Registration Frame");
		//this.setBackground(Color.GREEN);			
		this.setLayout(null);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		l1 = new Label("Employee Number");
		l2= new Label("Employee Name");
		l3= new Label("Employee Salary");
		l4= new Label("Employee Address");

		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		tf4=new TextField(20);
		b1= new Button("Add");
		b1.addActionListener(this);
		Font f = new Font("arial",Font.BOLD,20);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		tf1.setFont(f);
		tf2.setFont(f);
		tf3.setFont(f);
		tf4.setFont(f);
		b1.setFont(f);
		l1.setBounds(50,100,200,25);
		tf1.setBounds(250,100,200,30);
		l2.setBounds(50,150,200,25);
		tf2.setBounds(250,150,200,30);
		l3.setBounds(50,200,200,25);
		tf3.setBounds(250,200,200,30);
		l4.setBounds(50,250,200,25);
		tf4.setBounds(250,250,200,30);
		
		this.add(l1);
		this.add(tf1);
		this.add(l2);
		this.add(tf2);
		this.add(l3);
		this.add(tf3);
		this.add(l4);
		this.add(tf4);
		this.add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		int eno=Integer.parseInt(tf1.getText());
		String ename=tf2.getText();
		double esal=Double.parseDouble(tf3.getText());
		String eaddr=tf4.getText();
		UserService us= new UserService();
		status=us.add(eno,ename,esal,eaddr);
		repaint();
	}
	public void paint(Graphics g)
	{
		Font f = new Font("arial",Font.BOLD,30);
		g.setFont(f);
		g.drawString("status: "+status,50,400);
	}
}
class UserService
{
	Connection con;
	Statement st;
	ResultSet rs;
	String status="";
	UserService()
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
			st = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String checkLogin(int eno,String ename,double esal,String eaddr)
	{
		try
		{ 

			String query=String.format("insert into employees values(%d,'%s',%f,'%s')",eno,ename,esal,eaddr);
			rs= st.executeQuery(query);
			boolean b = rs.next();
			if(b== true)
			{
				status="Login Success";
			}
			else
			{
				status="Login Failure";
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}

class  JDBCApp15
{
	public static void main(String[] args) 
	{
		LoginFrame lf= new LoginFrame();
	}
}
