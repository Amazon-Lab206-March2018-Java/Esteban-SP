<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Person</title>
	</head>
	<body>
	<h1>New Person</h1>
	<table>
		<form:form method="POST" action="/persons/new" modelAttribute="person">
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName"/></td>				
			</tr>
			<tr>
				<td colspan="2"><form:errors path="firstName" message="First Name must have at least 2 characters"/></td>	
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName"/></td>				
			</tr>
			<tr>
				<td colspan="2"><form:errors path="lastName" message="Last Name must have at least 2 characters"/></td>	
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Create"/></td>
			</tr>
		</form:form>
	</table>
	</body>
</html>