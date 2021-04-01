<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title><c:out value="${song.title}" /></title> <!-- places the name of the object on the tab -->

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<a href="/songs/delete/${song.id}">Delete</a>  |  
		<a href="/dashboard">Back to Dashboard</a>  |  
		<a href="/">Exit Lookify</a><br><br>
	
		<h1>Edit Song:  <c:out value="${song.title}" /></h1><br>
		
		<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
			<form:form method="POST" action="/songs/edit/${song.id}" modelAttribute="Song">
				<div class="form-group">
					<form:label path="title">Title:  
					<form:errors path="title"/>
					<form:input type="text" path="title" value="${song.title}"/></form:label>
				</div>
				<div class="form-group">
					<form:label path="artist">Artist:  
					<form:errors path="artist"/>
					<form:input type="text" path="artist" value="${song.artist}"/></form:label>
				</div>
				<div class="form-group">
					<form:label path="rating">Rating:  
					<form:errors path="rating"/>
					<form:input type="number" path="rating" value="${song.rating}"/></form:label>
				</div><br>
				
				<!-- Update goes back to display page -->
				<button class="btn btn-success">Update</button>
				<a href="/dashboard" class="btn btn-danger">Cancel Updates</a><br><br>
				
			</form:form>
	</div>
	
</body>
</html>