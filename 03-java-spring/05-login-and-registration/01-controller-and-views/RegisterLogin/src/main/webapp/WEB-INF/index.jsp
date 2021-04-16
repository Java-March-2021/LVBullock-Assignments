<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - 4/16/2021">

<title>Registration and Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
<link rel="stylesheet" type="text/css" href="css/styles.css"/>


</head>
<body>
	<div class="container">
				<!-- Use JSTL to create something in its entirety using the ModelAttribute -->

		<div class="register">
			<h1>Register</h1><br>
			
			<form:form action="/register" method="POST" modelAttribute="user"> <!-- Must match @ModelAttribute in Controller -->
				<div class="form-group">
					<form:label path="firstName">First Name:</form:label><br>
					<form:errors path="firstName" cssClass="error"/>
					<form:input class="form-control" type="text" path="firstName"/>
				</div>
				<div class="form-group">
					<form:label path="lastName">Last Name:</form:label><br>
					<form:errors path="lastName" cssClass="error"/>
					<form:input class="form-control" type="text" path="lastName"/>
				</div>
				<div class="form-group">
					<form:label path="email">Email:</form:label><br>
					<form:errors path="email" cssClass="error"/>
					<form:input class="form-control" type="email" path="email"/>
				</div>
				<div class="form-group">
					<form:label path="password">Password:</form:label><br>
					<form:errors path="password" cssClass="error"/>
					<form:input class="form-control" type="password" path="password"/>
				</div>
				<div class="form-group">
					<form:label path="confirmPassword">Confirm Password:</form:label><br>
					<form:errors path="confirmPassword"/>
					<form:input class="form-control" type="password" path="confirmPassword"/><br>
				</div>	
				<!-- Update goes back to display page -->
				<button class="btn btn-success">Register</button>
			</form:form>
		</div>
		
		<!-- Use regular HTML instead of JSTL here to check against the object that was already created-->
		<div class="login">
			<h1>Login</h1>
			<p class="error">${loginError}</p><br>
			<form method="POST" action="/login">
				Email:<br>
				<input class="form-control" type="email" name="loginEmail"><br>
				Password:<br>
				<input class="form-control" type="password" name="loginPassword"><br>
				<button class="btn btn-success">Login</button>
			</form>				
		</div>
	</div> 

</body>
</html>