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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/custom.css">
    <title>Ninja Gold Game</title>
</head>
<body>
    <div id="wrapper">
        <h1>Welcome to the Ninja Money Generator</h1>
        <label for="output">Your Gold: <input type="textbox" value="<c:out value="${your_gold}"/>" disabled></label>
        <div id="moneys" class="row">
            <form class="moneymakers col-sm" action="/process_money" method="post">
                <input type="hidden" name="building" value="1">
                <h1>Farm</h1>
                <h3>(earns 10-20 golds)</h3>
                <input type="submit" value="Find Gold!">
            </form>
            <form class="moneymakers col-sm" action="/process_money" method="post">
                <input type="hidden" name="building" value="2">
                <h1>Cave</h1>
                <h3>(earns 5-10 golds)</h3>
                <input type="submit" value="Find Gold!">
            </form>
            <form class="moneymakers col-sm" action="/process_money" method="post">
                <input type="hidden" name="building" value="3">
                <h1>House</h1>
                <h3>(earns 2-5 golds)</h3>
                <input type="submit" value="Find Gold!">
            </form>
            <form class="moneymakers col-sm" action="/process_money" method="post">
                <input type="hidden" name="building" value="4">
                <h1>Casino</h1>
                <h3>(earns/takes 0-50 golds)</h3>
                <input type="submit" value="Find Gold!">
            </form>
            <form class="moneymakers col-sm" action="/process_money" method="post">
                <input type="hidden" name="building" value="5">
                <h1>Spa</h1>
                <h3>(uses 5-20 golds)</h3>
                <input type="submit" value="Relax at the Spa!">
            </form>
        </div>
        <div id="results">
            <p>Activities:</p>
            <div id="output">
            	<c:forEach var="result" items="${results}">
                    <p class="${result.getValue0()}">${result.getValue1()} -- (<fmt:formatDate value="${result.getValue2()}" pattern="MMMM d Y hh:mm a"/>)</p>
                </c:forEach>
            </div>
        </div>
        <a href="/reset">Reset!</a>
	</div>
</body>
</html>