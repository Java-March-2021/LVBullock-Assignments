<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 2, 2021">

<title>Add a Dojo - Index</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<div class="container">

	<h1>Welcome to Dojo and Ninjas</h1>
	<h4>March 2021 Edition v2021.42</h4><br>
	<hr><hr><hr>
	
	<h3>Create a Dojo</h3>
	
			<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>

			<form:form method="POST" action="/" modelAttribute="dojo">
			
				<div class="form-group">
					<form:label path="name">Dojo Name: </form:label>
				    <form:input type="text" path="name"/>
				    <form:errors path="name"></form:errors>   
				</div>
			
				<input class="btn btn-success" type="submit" value="Create"/><br><br>

				<hr><hr><br>
				
				<h3>Add Ninja to Dojo*</h3>
						
				<h5>*If Dojo has NOT been created, perform the above task first.  You may Add a Ninja to a Dojo only if the Dojo already exists.</h5><br>
					
				<a href="/ninjas/new" class="btn btn-primary">Add Ninja</a>
			</form:form>
</div>

</body>
</html>