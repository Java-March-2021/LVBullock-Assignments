<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - 3/31/2021">

<title>Add a Book</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<div class="container">
<h1>Add New Book</h1>

<c:forEach items="${errors}" var="err">
<h4>${err}</h4>
</c:forEach>


	<!-- <h1>JSTL Way -- USE WHEN CREATING A NEW OBJECT </h1> -->

	<!-- ALWAYS USE WHEN WE ARE CREATING A NEW OBJECT-->
	<form:form method="POST" action="/books/add" modelAttribute="Book">
		<div class="form-group">
			<form:label path="title">Title:
			<form:errors path="title"/>
			<form:input path="title"/>
			</form:label>
		</div>
		
		<div class="form-group">
			<form:label path="description">Description:
			<form:errors path="description"/>
			<form:textarea rows="1" cols="100" path="description"/>
			</form:label>
		</div>
		
		<div class="form-group">
			<form:label path="language">Language:
			<form:errors path="language"/>
			<form:input path="language"/>
			</form:label>
		</div>
		
		<div class="form-group">
			<form:label path="numberOfPages">Number of Pages:
			<form:errors path="numberOfPages"/>
			<form:input type="number" path="numberOfPages"/>
			</form:label>
		</div>
		
		<button class="btn btn-primary">Add New Book</button><br><br>
		
		<a href="/books">Back to Catalog</a>
		
	</form:form>

</div>

</body>
</html>