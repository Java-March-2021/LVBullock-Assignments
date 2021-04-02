<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 2, 2021">

<title>Add a Ninja</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h1>New Ninja</h1><br>
		<h3>Enter Ninja's Information</h3><br>
		
		<form:form method="POST" action="/ninjas/new" modelAttribute="ninjas">

	    <div class="form-group">
  
	    	<p>Select a Dojo:  <form:select path="dojo">
				<c:forEach items="${allDojos}" var="dojo">
					<form:option value="${dojo.id}">${dojo.name}</form:option>
				</c:forEach>
			</form:select></p>
	    </div>

		<div class="form-group">
	        <form:label path="firstName">First Name:</form:label>
	        <form:input path="firstName"/>
	    </div>

	    <div class="form-group">
	        <form:label path="lastName">Last Name:</form:label>
	        <form:input path="lastName"/>
	    </div>

	    <div class="form-group">
	        <form:label path="email">Email:</form:label>
	        <form:input type="email" path="email"/>
	    </div>



		<input class="btn btn-success" type="submit" value="Submit"/> 		<a href="/"	class="btn btn-warning">Cancel</a>

	</form:form>
	</div>
</body>
</html>