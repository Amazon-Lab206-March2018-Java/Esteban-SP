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

<p><a href="/languages/delete/${langID}">Delete</a> <a href="/languages">Dashboard</a></p>
<br>
<table>
<form:form method="POST" action="/languages" modelAttribute="language">
    <tr>
	    <td>
		    <form:label path="name">Name</form:label>
	    </td>
	    <td>
		    <form:input path="name"/>
	    </td>
    </tr>
    <tr>
	    <td colspan="2">
		    <form:errors path="name"/>
	    </td>
    </tr>
    
    <tr>
		<td>
		    <form:label path="creator">Creator</form:label>
		</td>
	    <td>
		    <form:input path="creator"/>
		</td>
    </tr>
    <tr>
	    <td colspan="2">
		    <form:errors path="creator"/>
	    </td>
    </tr>
    
    <tr>
		<td>
		    <form:label path="currentVersion">Current Version</form:label>
		</td>
	    <td>
		    
		    <form:input path="currentVersion"/>
	    </td>
    </tr>
    <tr>
	    <td colspan="2">
    		<form:errors path="currentVersion"/>
    	</td>
    </tr>
    <tr>
	    <td>
		    <input type="submit" value="Submit"/>
	    </td>
    </tr>
</form:form>
</table>
</body>
</html>