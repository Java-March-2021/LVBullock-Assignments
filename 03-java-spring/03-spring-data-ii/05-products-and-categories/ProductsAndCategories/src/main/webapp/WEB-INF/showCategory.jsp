<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - 4/14/2021">

<title>Show Category:  ${category.name}</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href= "/css/style.css">

</head>
<body>
	<div class="container">
		<h3>Category:  </h3>
		<p>-- ${ category.name }</p>
		
		<hr><hr>
		<h3>Products in this category:</h3>
			<ul type = "square">
				<c:forEach items="${ category.products }" var="prod">
					<li>${ prod.name }</li>			
				</c:forEach>
			</ul>
		
		<form action="/category/${ category.id }" method="POST">
			<label>Select ${ category.name } products: </label> 
			
			<select name="product">
				<c:forEach items="${ prodNotInCategory }" var="prod">
			        	<option value=${ prod.id }>${ prod.name }</option>
			    </c:forEach>
			</select> 
			<button>Add</button>
		</form><br>
		
		<a href="/">Home</a> | <a href="/new/product">Add new product</a> | <a href="/new/category">Add new category</a>
		
	</div>

</body>
</html>