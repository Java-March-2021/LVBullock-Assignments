<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title>Song Details</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<a href="/dashboard">Back to Dashboard</a>  |  
		<a href="/">Exit Lookify</a><br><br>
		
		<h1>Song Details</h1><br>
	
		<h3>Title: <c:out value="${song.title}" /> </h3><br>
		<h3>Artist: <c:out value="${song.artist}" /> </h3><br>
		<h3>Rating: <c:out value="${song.rating}" /> </h3><br>
	
		<a href="/songs/edit/${song.id}">Edit</a>  |  <a href="/songs/delete/${song.id}">Delete</a>
	</div>

</body>
</html>