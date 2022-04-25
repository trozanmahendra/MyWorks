<%-- <%!String ename;
	String epwd;
	String email;%>

<%
try {
	ename = request.getParameter("ename");
	epwd = request.getParameter("epwd");
	email = request.getParameter("email");
} catch (Exception e) {
	e.printStackTrace();
}
%> --%>

<jsp:useBean id="emp" class="com.mgBusiness.servlet.JavaBean"
	scope="request">
	<jsp:setProperty name="emp" property="*" />
	<%-- <jsp:setProperty name="emp" property="epwd" value='<%=epwd%>' />
	<jsp:setProperty name="emp" property="email" value='<%=email%>' />
 --%>
	<html>
<body>
	<h1 style="color: red;" align="center">MG-BUSINESS</h1>
	<h2 style="color: blue;" align="center">REGISTRATION FORM</h2>
	<table align="center" border="1" bgcolor="cyan">
		<tr>
			<td>NAMEEE</td>
			<td><jsp:getProperty name="emp" property="ename" /></td>
		</tr>
		<tr>
			<td>PASSWORD</td>
			<td><jsp:getProperty name="emp" property="epwd" /></td>
		</tr>
		<tr>
			<td>MAIL-ID</td>
			<td><jsp:getProperty name="emp" property="email" /></td>
		</tr>
	</table>
</body>
	</html>
</jsp:useBean>
