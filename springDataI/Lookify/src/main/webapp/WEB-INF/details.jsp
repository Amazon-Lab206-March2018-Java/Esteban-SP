<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<title>Details</title>
	</head>
	<body>
		<div class="container">
			<a class="mr-0" href="/dashboard">Dashboard</a>
			<table class="table">
				<tr>
					<td>Title</td>
					<td>${song.title}</td>				
				</tr>
				<tr>
					<td>Artist</td>
					<td>${song.artist}</td>				
				</tr>
				<tr>
					<td>Rating (1-10)</td>
					<td>${song.rating}</td>				
				</tr>
			</table>
			<br>
			<a href="/songs/delete/${song.id}">Delete</a>
		</div>
	</body>
</html>