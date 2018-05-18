<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Dojo Page</title>
		<style type="text/css">
		      <%@include file="css/skeleton.css" %>
		      <%@include file="css/normalize.css" %>
		</style>
	</head>
	<body>
	<div class="container">
		<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
		<table>	
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>	
			<c:forEach items="${ninjas}" var="n">
			<tr>
				<td><c:out value="${n.firstName}"/></td>
				<td><c:out value="${n.lastName}"/></td>
				<td><c:out value="${n.age}"/></td>			
			</tr>
			</c:forEach>	
		</table>
	</div>
	</body>
</html>