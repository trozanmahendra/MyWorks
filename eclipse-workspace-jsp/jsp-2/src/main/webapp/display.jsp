
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>details</title>
</head>
<body>
	<h1 style="color: red;" align="center">MG-BUSINESS</h1>
	<h2 style="color: blue;" align="center">REISTRATION FORM</h2>
	<form method="get" action="reg.jsp">
		<table align="center" bgcolor="pink">
			<tr>
				<td>NAME</td><td><%= session.getAttribute("uname") %></td>
				
			</tr>
			<tr>
				<td>PASSWORD</td><td>******</td>
				
			</tr>
			<tr>
				<td>RE-PASSWORD</td><td>******</td>
				
			</tr>
			<tr>
				<td>MAIL-ID</td><td><%= session.getAttribute("umobile") %></td>
				
			</tr>
			<tr>
				<td>MOBILE-NO</td><td><%= session.getAttribute("umobile") %></td>
				
			</tr>
			
		</table>
	</form>
	<h3 align="center"><a href="registrationform.html">|registrationform|</a></h3>
</body>
</html>