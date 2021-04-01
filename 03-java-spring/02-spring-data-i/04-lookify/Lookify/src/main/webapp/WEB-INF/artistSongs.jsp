<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title>Search</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>


		
	<div class="container">
	
		<h1>Songs by:  <c:out value="${artist}" /></h1><br>
		<form method = "POST" action="/search">
		<input type="text" placeholder="Enter Artist to Search" name="artist"><button>New Search</button>
		</form>	<br>	
				
		
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Title</th>
					<th>Rating</th>
					<th>Actions</th>
				</tr>
			</thead>
				<tbody>
				<!-- Loop through all of the songs -->
					<c:forEach items="${artistSongs}" var="song">
					<tr>
						<td><a href="/songs/${song.id}">${song.title} </a></td>
						<td>${song.rating}</td>
						<td><a href="/songs/delete/${song.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>				
			</table>
			
			<a href="/dashboard">Back to Dashboard</a>  |  
			
			<a href="/">Exit Lookify</a><br><br>
			
	</div>
	
</body>
</html>