<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Make a Pet!</title>
</head>
<body>
	<div class='container row centered'>
	<div class='container border col-sm mr-1'>
		<h2>Make a dog!</h2>
		<form action="Animal/Dog" method="POST">
			<div class="form-group">
				<label for="name">Name</label>
				<input type="text" name="name" class="form-control">
			</div>
			<div class="form-group">
				<label for="breed">Breed</label>
				<input type="text" name="breed" class="form-control">
			</div>
			<div class="form-group">
				<label for="weight">Weight(lb)</label>
				<input type="text" name="weight" class="form-control">
			</div>
				<input type="submit" name="weight" class="btn btn-primary" value="Submit">
		</form>
	</div>
	<div class='container border col-sm ml-1'>
	<h2>Make a cat!</h2>
		<form action="Animal/Cat" method="POST">
			<div class="form-group">
				<label for="name">Name</label>
				<input type="text" name="name" class="form-control">
			</div>
			<div class="form-group">
				<label for="breed">Breed</label>
				<input type="text" name="breed" class="form-control">
			</div>
			<div class="form-group">
				<label for="weight">Weight(lb)</label>
				<input type="text" name="weight" class="form-control">
			</div>
				<input type="submit" name="weight" class="btn btn-primary" value="Submit">
		</form></div>	 
	</div>
</body>
</html>