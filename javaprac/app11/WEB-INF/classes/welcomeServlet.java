import java.io.*;

import jakarta.servlet.*;

public class welcomeServlet implements Servlet{

	public void init(ServletConfig config)throws ServletException{

	}
	public void service(ServletRequest request,ServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1 style='color:red;' align='center'>");
		out.println("WELCOME TO FIRST APP OF welcomeServlet");
		out.println("</h1></body></html>");

	}
	
	public String getServletInfo(){
		return "";

	}
	public void destroy(){

	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

}