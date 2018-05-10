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
    <title>Dojo Survey Index</title>
</head>
<body>
    <div class="container border mt-5">
        <table class="table">
            <tr>
            	<td colspan="2"><h1>Congratulations!!! you like the best and more formidable language! JAVA!</h1></td>
            </tr>
        	<tr>
            	<td colspan="2"><h2>Submitted Information</h2></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><c:out value="${name}"></c:out></td>
            </tr>
            <tr>
                <td>Dojo Location:</td>
                <td><c:out value="${location}"></c:out></td>
            </tr>
            <tr>
                <td>Favorite Language</td>
                <td><c:out value="${language}"></c:out></td>
            </tr>
            <tr>
                <td>Comment:</td>
                <td><c:out value="${comments}"></c:out></td>
            </tr>
        </table>
        <a href="/">
            <button>Go Back</button>
        </a>
    </div>
</body>
</html>