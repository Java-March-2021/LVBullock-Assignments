<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - 4/14/2021">

<title>Show Product:  ${product.name}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h3>Product:  </h3>
		<h4>-- ${ product.name }</h4><br>
		
		<h5>Description:  ${ product.description }</h5>
		
		<h5>Price:  
		<c:set var = "price" value = "${ product.price }" />
			<fmt:setLocale value="en_US"/>
			<fmt:formatNumber value="${price}" type="currency"/>
		</h5>
		<hr><hr>
		<h3>Category:</h3>
			<ul type = "square">
				<c:forEach items="${ product.categories }" var="cat">
					<li>${ cat.name }</li>			
				</c:forEach>
			</ul>
		
		<form action="/product/${ product.id }" method="POST">
			<label>Select category for the ${ product.name }: </label> 
			
			<select name="category">
				<c:forEach items="${ catNotInProduct }" var="cat">
			        	<option value=${ cat.id }>${ cat.name }</option>
			    </c:forEach> 
			</select> 
			<button>Add</button>
		</form><br>
		<a href="/">Home</a> | <a href="/new/product">Add new product</a> | <a href="/new/category">Add new category</a>
	</div>
</body>
</html>



<!--Number Formatter for US currency:
https://www.tutorialspoint.com/jsp/jstl_format_formatnumber_tag.htm-->