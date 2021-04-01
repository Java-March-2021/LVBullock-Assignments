<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title>Top Ten Search</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>



	<div class="container">

		<a href="/dashboard">Back to Dashboard</a>  |  
		
		<a href="/">Exit Lookify</a><br><br>
		
		<h2>Top Ten Songs</h2><br>
			<table class="table table-dark">
				<thead>
					<tr>
						<td>Rating</td>
						<td>Title</td>
						<td>Artist</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${topTenSongs}" var="song">
						<tr>
							<td>${song.rating}</td>
							<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
							<td>${song.artist}</td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
	</div>
</body>
</html>