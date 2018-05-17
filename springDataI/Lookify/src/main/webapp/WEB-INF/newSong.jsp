<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<title>Add Song</title>
	</head>
	<body>
		<div class="container">
			<a class="text-rigth" href="/dashboard">Dashboard</a>
			<table class="table">
				<form:form method="POST" action="/songs/new" modelAttribute="song">
					<tr>
						<td><form:label path="title">Title</form:label></td>
						<td><form:input path="title"/></td>				
					</tr>
					<tr>
						<td colspan="2"><form:errors path="title" message="Song Title must have at least 5 characters"/></td>	
					</tr>
					<tr>
						<td><form:label path="artist">Artist</form:label></td>
						<td><form:input path="artist"/></td>				
					</tr>
					<tr>
						<td colspan="2"><form:errors path="artist" message="Song Artist must have at least 5 characters"/></td>	
					</tr>
					<tr>
						<td><form:label path="rating">Rating (1-10)</form:label></td>
						<td><form:input type="number" min="1" max="10" path="rating"/></td>				
					</tr>
					<tr>
						<td colspan="2"><form:errors path="rating" message="Rating can only be within 1 - 10"/></td>	
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Add Song"/></td>
					</tr>
				</form:form>
			</table>
		</div>
	</body>
</html>