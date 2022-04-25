 <%!
public String name;
public String mail;
public String mobile;
%> 
<%
name=request.getParameter("uname");
mail=request.getParameter("umail");
mobile=request.getParameter("umobile");

session.setAttribute("uname", name);
session.setAttribute("umail", mail);
session.setAttribute("umobile", mobile);

RequestDispatcher rd = application.getRequestDispatcher("/display.jsp");
rd.forward(request, response);
%>
