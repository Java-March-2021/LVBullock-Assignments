<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title>${person.firstName} ${person.lastName}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	
		<h1>Customer Name:  ${person.firstName} ${person.lastName}</h1>
		<hr>
		<hr>
		<hr>

		<c:choose>
			<c:when test="${person.license !=null }">			
			<h3>License Number:  0000000<c:out value="${person.license.id}"/></h3><br>
			<h3>Expiration Date:  <fmt:formatDate pattern = "MM/dd/yyyy" type="date" value="${person.license.expirationDate}"/></h3><br>
			<h3>State:  <c:out value="${person.license.state}"/></h3><br>
			</c:when>
		</c:choose>
		<a href="/person/new" class="btn btn-primary">Add New Customer</a>
		<a href="/" class="btn btn-danger">Exit</a>
		
		</div>

</body>
</html>