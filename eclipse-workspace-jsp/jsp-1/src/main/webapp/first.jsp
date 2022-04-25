
<%@page buffer="10kb" autoFlush="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<%-- <h1>
<%
int i = 10,j=0,k=i/j;
out.println(k);
%></h1> --%>
<%int[] a ={1,2,3};
out.println(a[5]);%>
</body>
</html>