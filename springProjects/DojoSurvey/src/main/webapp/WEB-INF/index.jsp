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
	    <form class="form" action="/result" method="post">
            <table class="table">
                <tr>
                    <td>
                        <label for="name">Your Name: </label>
                    </td>
                    <td>
                        <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="location">Dojo Location:</label>
                    </td>
                    <td>
                        <select id="dojo_location" name="location">
                            <option value="San Jose">San Jose</option>
                            <option value="Seattle">Seattle</option>
                            <option value="Arizona">Arizona</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Favorite Language:</label>
                    </td>
                    <td>
                        <select id="favorite_language" name="language">
                            <option value="JavaScript">JavaScript</option>
                            <option value="Python">Python</option>
                            <option value="HTML">HTML</option>
                            <option value="Java">Java</option>
                            <option value="SQL">SQL</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <label for="comments">Comments: (optional)</label>
	            		<textarea name="comments" id="comments" cols="40" rows="5"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
            			<input type='submit'>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>