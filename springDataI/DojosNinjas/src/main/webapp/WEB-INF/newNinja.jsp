<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Ninja</title>
		<style type="text/css">
		      <%@include file="css/skeleton.css" %>
		      <%@include file="css/normalize.css" %>
		</style>
	</head>
	<body>
	<div class="container">
		<table>
			<form:form method="POST" action="/ninjas/new" modelAttribute="ninja">
				<tr>
					<td colspan="2"><h1>New Ninja</h1></td>	
				</tr>
				<tr>
					<td><form:label path="dojo">Dojo: </form:label></td>
					<td>
					<form:select path="dojo">
		            <form:option value="0" label="Select a Dojo" />
		            <form:options items="${dojos}" itemValue="id" itemLabel="name" />
		            </form:select>
		            </td>
	            </tr>
				<tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName"/></td>				
				</tr>
				<tr>
					<td colspan="2"><form:errors path="firstName"/></td>	
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name</form:label></td>
					<td><form:input path="lastName"/></td>				
				</tr>
				<tr>
					<td colspan="2"><form:errors path="lastName"/></td>	
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input type="number" path="age"/></td>				
				</tr>
				<tr>
					<td colspan="2"><form:errors path="age"/></td>	
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