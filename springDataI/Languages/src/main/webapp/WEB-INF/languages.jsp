<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Languages</title>
</head>
<body>
	<table class="table">
	<thead>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${languages}" var="language" varStatus="loop">
		<tr>    
		    <td><a href="/languages/${loop.index}"><c:out value="${language.name}"/></a></td>
		    <td><c:out value="${language.creator}"/></td>
		    <td><c:out value="${language.currentVersion}"/></td>
		    <td><a href="/languages/delete/${loop.index}">Delete</a> <a href="/languages/edit/${loop.index}">Edit</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<div>
<form:form method="POST" action="/languages" modelAttribute="language">
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label>
    
    <form:label path="currentVersion">Current Version
    <form:errors path="currentVersion"/>
    <form:input path="currentVersion"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>
</div>


</body>
</html>