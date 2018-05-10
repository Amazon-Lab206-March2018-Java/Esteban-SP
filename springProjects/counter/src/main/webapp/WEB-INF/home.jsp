<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Counter - visit <c:out value="${count }"></c:out></title>
</head>
<body>
	<h1>Welcome User!</h1>
    <h3>visit #<c:out value="${count}"/></h3>
    <p><a href="/">Refresh</a></p>
	<p><a href="/plus">Counter +2!</a></p>
	<p><a href="/reset">Reset Counter!</a></p>
	
</body>
</html>