<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Dojo</title>
		<style type="text/css">
		      <%@include file="css/skeleton.css" %>
		      <%@include file="css/normalize.css" %>
		</style>
	</head>
	<body>
	<div class="container">
		<table>
			<form:form method="POST" action="/dojos/new" modelAttribute="dojo">
				
				<tr>
					<td colspan="2"><h1>New Dojo</h1></td>	
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name"/></td>				
				</tr>
				<tr>
					<td colspan="2"><form:errors path="name" message="Name must have at least 5 characters"/></td>	
				</tr>
				<tr>
				<td></td>
					<td><input type="submit" value="Create"/></td>
				</tr>
			</form:form>
		</table>
	</div>
	</body>
</html>