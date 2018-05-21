<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<style type="text/css">
		      <%@include file="css/skeleton.css" %>
		      <%@include file="css/normalize.css" %>
		</style>
		<title>Product Page</title>
	</head>
	<body>
		<div class="container">
		<h1>${product.name}</h1>
		<div class="row">
		    <div class="one-half column">
		    	<h2>Categories:</h2>
		    	<ul>
		    	<c:forEach items="${product.categories}" var="cat" >
					<li>${cat.name}</li>		    	
		    	</c:forEach>
		    	</ul>
		    </div>
		    <div class="one-half column">
		    	<form  method="POST" action="/products/${product.id}/add_category">
					<p>
						<label for="cat_id">Add Category</label>
						<select name="cat_id" >
							<c:forEach items="${unrelatedCatList}" var="cat">
							<option value='${cat.id}'>${cat.name}</option>
							</c:forEach>
						</select>
					</p>
					<input type="submit" value="Add">
		    	</form>
		    </div>
		  </div>
		</div>
	</body>
</html>