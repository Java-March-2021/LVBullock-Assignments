<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - 4/14/2021">
<link rel="stylesheet" type="text/css" href= "/css/style.css">

<title>Add New Product</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">
	<h2>Add A Product</h2><br>
	<form:form action="/create/product" method="POST" modelAttribute="product">
		<form:label path="name">Name: </form:label>
		<form:errors path="name"/>
		<form:input path="name"/><br><br>
		
		<form:label path="description">Description: </form:label>
		<form:errors path="description"/>
		<form:textarea rows="1" cols="50" path="description"/><br><br>
		
		<form:label path="price">Price: </form:label>
		<form:errors path="price"/>
		<form:input path="price"/><br><br>
		<button>Add</button>
	</form:form> <br>
	<a href="/">Home</a> | <a href="/new/category">Add new category</a>
	
	</div>
</body>
</html>