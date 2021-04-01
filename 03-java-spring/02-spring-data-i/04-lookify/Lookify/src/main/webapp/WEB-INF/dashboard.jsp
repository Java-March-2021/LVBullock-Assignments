<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title>Lookify!</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<div class="container">
	
		<h1>Lookify Playlist</h1><br>

		<a href="/songs/new">Add New Song</a>  | 
		
		<a href="/songs/topTen">Top 10 Songs</a>  |  
		
		<a href="/">Exit Lookify</a><br><br> 
		
		<form method = "POST" action="/search">
		<input type="text" placeholder="Enter Artist to Search" name="artist"><button>Search Artist</button>
		</form>	<br>	
		
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Title</th>
					<th>Artist</th>
					<th>Rating</th>
					<th>Actions</th>
				</tr>
			</thead>
				<tbody>
				<!-- Loop through all of the songs -->
					<c:forEach items="${allSongs}" var="song">
					<tr>
						<td><a href="/songs/${song.id}"><c:out value="${song.title}"/></a></td>
						<td>${song.artist}</td>
						<td>${song.rating}</td>
						<td><a href="/songs/edit/${song.id}">Edit</a>  |  <a href="/songs/delete/${song.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>								
			</table>
			
	</div>

</body>
</html>