<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock">

<title><c:out value="${language.name}" /></title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<a href="/languages">Back to Dashboard</a><br><br>
	<h1><c:out value="${language.name}" /></h1>
	
	<p>Creator: <c:out value="${language.creator}" /></p>
	<p>Version: <c:out value="${language.currentVersion}" /></p>	

	<a href="/languages/edit/${language.id}">Edit</a>  |  
	
	<a href="/languages/delete/${language.id}">Delete</a><br><br>


</body>
</html>

<!-- 
Bootstrap Buttons:
https://www.w3schools.com/bootstrap/bootstrap_buttons.asp -->