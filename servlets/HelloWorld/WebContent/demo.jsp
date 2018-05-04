<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo JSP</title>
</head>
<body>
	<h1>Hello World</h1>
	<%!
	public int add(int a, int b){
		return a+b;
	}
	%>
	<%
	int i = 2;
	int j = 4;
	%>
	
	<h3><%= add(i,j) %></h3>
	
	<% for(int index = 0; index<5;index++) {%>
		<h3><%= index %></h3>
	<% } %>
	
	<p>The time is: <%= new Date() %><p>
</body>
</html>