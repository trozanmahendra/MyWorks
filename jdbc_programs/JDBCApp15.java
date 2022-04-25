import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
class LoginFrame extends Frame implements ActionListener
{
	Label l1,l2;
	TextField tf1,tf2;
	Button b1;
	String status="";
	LoginFrame()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("Login Frame");
		this.setBackground(Color.green);			
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		l1 = new Label("User Name:");
		l2= new Label("Password");
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf2.setEchoChar('*');
		b1= new Button("Login");
		b1.addActionListener(this);
		Font f = new Font("arial",Font.BOLD,20);
		l1.setFont(f);
		l2.setFont(f);
		tf1.setFont(f);
		tf2.setFont(f);
		b1.setFont(f);
		
		this.add(l1);
		this.add(tf1);
		this.add(l2);
		this.add(tf2);
		this.add(b1);
	}
	public void actionPerformed(ActionEvent e)
	{
		String uname=tf1.getText();
		String upwd=tf2.getText();
		UserService us= new UserService();
		status=us.checkLogin(uname,upwd);
		repaint();
	}
	public void paint(Graphics g)
	{
		Font f = new Font("arial",Font.BOLD,30);
		g.setFont(f);
		g.drawString("status: "+status,50,250);
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
	public String checkLogin(String uname,String upwd)
	{
		try
		{

			String query=String.format("select * from registered_users where uname='%s' and upwd='%s'",uname,upwd);
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
