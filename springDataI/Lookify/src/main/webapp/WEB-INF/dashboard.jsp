<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<title>Lookify!</title>
	</head>
	<body>
		<div class="container">
			<div class="container-fluid">
				<a href="/songs/new">Add New</a> <a href="/search/topTen">Top Songs</a>
				<form method="POST" action="/search/" class="form-inline">
				  <div class="form-group mx-sm-3 mb-2">
				    <input type="text" class="form-control" name="artistSearch">
				  </div>
				  <button type="submit" class="btn btn-primary mb-2">Search Artist</button>
				</form>
			</div>
			<table class="table">
				<thead>
					<tr>
						<th>Name</th>
						<th>Rating</th>
						<th>actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="/songs/${song.id}">${song.title}</a></td>
						<td>${song.rating}</td>
						<td><a href="/songs/delete/${song.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
		</div>
	</body>
</html>