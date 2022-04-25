package serv_1;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    static {
    	System.out.println("Servlet Loading11111111111...................");
    }
    public Test1() {
    	System.out.println("Servlet Instatiation..11111111111111..................");
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initialization.............11111111111111111..............");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy(){
		System.out.println("servlet Deinstatiation");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Processing.......1111111111111....................");
	}


}
