<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New License</title>
	</head>
	<body>
	<h1>New License</h1>
	<table>
		<form:form method="POST" action="/licenses/new" modelAttribute="license">
		<form:hidden path="number" value="${expiration}"/>
			<tr>
				<td><form:label path="person">Person</form:label></td>
				<td>
				<form:select path="person">
	            <form:option value="0" label="Select" />
	            <form:options items="${persons}" itemValue="id" itemLabel="firstName" />
	            </form:select>
	            </td>				
			</tr>
			<tr>
				<td colspan="2"><form:errors path="person"/></td>	
			</tr>
			<tr>
				<td><form:label path="state">State</form:label></td>
				<td><form:input path="state"/></td>				
			</tr>
			<tr>
				<td colspan="2"><form:errors path="state"/></td>	
			</tr>
			<tr>
			<tr>
				<td><form:label path="expirationDate">State</form:label></td>
				<td><form:input type="date" path="expirationDate"/></td>				
			</tr>
			<tr>
				<td colspan="2"><form:errors path="expirationDate"/></td>	
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Create"/></td>
			</tr>
		
		</form:form>
	</table>
	</body>
</html>