<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Counter visit count</title>
</head>
<body>
	<p>You have visited <a href="/">http://localhost:8080/</a> <c:out value="${count}"/> times.</p>
	<p><a href="/">Test another visit?</a></p>
	<p><a href="/plus">Test another visit? 2 at a time is faster!</a></p>
</body>
</html>