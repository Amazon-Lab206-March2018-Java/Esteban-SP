<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
    <title>Fortran Dashboard</title>
</head>
<body>
    <div class="container mt-5">
		<div class="navbar bg-light">
			<h1>Fortan!</h1>
			<ul class="list-inline mr-0 mb-0">
				<li class="list-inline-item active"><a class="nav-link" href="/m/38/0553/0733">Set up</a></li>
				<li class="list-inline-item active"><a class="nav-link" href="/m/38/0483/0345">Forms</a></li>
				<li class="list-inline-item active"><a class="nav-link" href="/m/38/0666/0666">Forms Quiz</a></li>
				<li class="list-inline-item active"><a class="nav-link" href="/m/38/0553/0342">Cards</a></li>
				<li class="list-inline-item active"><a class="nav-link" href="/m/38/0666/0069">Cards Quiz</a></li>
				<li class="list-inline-item active"><a class="nav-link" href="/m/26/0553/0348">Advanced</a></li>
				<li class="list-inline-item active"><a class="nav-link" href="/m/26/0483/2342">Binary</a></li>
			</ul>
		</div>
		<div class="container border">
			  <div class="container border mt-2">
				<p><c:out value="${lessonText}"/></p>
			  </div>
		</div>
    </div>
</body>
</html>