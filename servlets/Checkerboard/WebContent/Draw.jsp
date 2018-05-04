<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="static/css/style.css">
	<title>A Web Page</title>
</head>
<body>
	<%
	int width = 0;
	int height = 0;
	if (request.getParameter("width")!=null){
		width = Integer.valueOf(request.getParameter("width")); 
	}
	if (request.getParameter("height")!=null){
		height = Integer.valueOf(request.getParameter("height"));
	} 
	%>
	
	<div id="Wrapper">
		<h1>Checkerboard: <%=width %>w X <%=height %>h</h1>
		<div>
			<% for(int w=0;w<width;w++){ %>
				<div class="row">
					<% for(int h=0;h<height;h++){ %>
						<div class="col">
							<% if(h%2==0){ 
								if(w%2==0){%>
								<div class="red"></div>
								<% } else { %>
								<div class="blue"></div>
								<% } %>
							<% } else {
								if(w%2==0){%>
								<div class="blue"></div>
								<% } else { %>
								<div class="red"></div>
								<% } %>
							<% } %>
						</div>
					<% } %>
				</div>			
			<% } %>
		</div>		
	</div>		
	
</body>
</html>