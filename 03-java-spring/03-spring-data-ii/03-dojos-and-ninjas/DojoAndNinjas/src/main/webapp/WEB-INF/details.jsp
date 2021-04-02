<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/26/2021">

<title>Dojo Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<div class="container">
		<a href="/">Create New Dojo</a> | <a href="/ninjas/new">Add Ninja to Dojo</a><br>
		<hr>
		
			<h1>Ninjas in the <c:out value="${dojo.name}"/> Dojo</h1> <br>
				<table class="table table-dark">
				
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${ninjas}" var="ninjas">
					<tr>
						<td><c:out value="${ninjas.firstName}"/></td>
						<td><c:out value="${ninjas.lastName}"/></td>
						<td><c:out value="${ninjas.email}"/></td>
					</tr>
					</c:forEach>
				</tbody>
			</table><br>
			
			<a href="/"	class="btn btn-danger">Exit</a>
	
	</div>
	
	
</body>
</html>