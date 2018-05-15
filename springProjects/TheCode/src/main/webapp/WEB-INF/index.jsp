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
    <title>Document</title>
</head>
<body>
    <div class="container text-center mt-5">
    	<p class="error"><c:out value="${errors}"></c:out></p>
    	<form action="/check_code" method="post">
    		<label for="codeGuess">What is the code?</label>
    		<br>
    		<input type="text" name="codeGuess">
    		<br>
    		<input type="submit" value="Try Code">
    	</form>
    </div>
</body>
</html>