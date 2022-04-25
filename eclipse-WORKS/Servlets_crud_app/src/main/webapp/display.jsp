<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="service.DisplayStudentService,java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
DisplayStudentService display = new DisplayStudentService();
ResultSet rs = display.displayStudent();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>display</title>
</head>
<body>
	<center>
		<table border="2" bgcolor="pink">
			<tr>
				<td>SID</td>
				<td>SNAME</td>
				<td>SADDR</td>
			</tr>
		</table>
		<%
		while(rs.next()) {
		%>
		<table>
			<tr>
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
			</tr>


		</table>
		<%
		}
		%>
	</center>
</body>
</html>