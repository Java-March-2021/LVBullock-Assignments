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


<title>Welcome Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">

		<h1>Welcome to Products and Categories</h1>
		<h3>March 2021 Cohort v21144</h3>
		
		<a href="/new/product">Add new product</a> | <a href="/new/category">Add new category</a>
		<hr><hr>

		<div class="text">
			<h5>List of Products: </h5> 
			<ul type = "square">
				<c:forEach items="${ products }" var="product">
					<li><a href="/product/${ product.id }">${ product.name }</a></li>
				</c:forEach>
			</ul>
			
		</div>
		<div class="text">
			<h5>Product Categories:</h5> 
			<ul type = "square">
				<c:forEach items="${ categories }" var="category">
					<li><a href="/category/${ category.id }">${ category.name }</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>