<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - April 1, 2021">

<title>Get New License</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container"><br>
	
		<h1>Create License</h1>
		
		<h4>To generate a license number, select the last customer entry and enter the expiration date and licensing state or cancel to exit the system.</h4>
		<hr><hr><hr>
				<!-- Show errors if updating does not pass validation -->
		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
		
			<form:form method="POST" action="/license/add" modelAttribute="license">
				<div class="form-group">
					<form:label path="person">Customer:</form:label>
					<form:select type="select" path="person">
						<c:forEach items="${everyPerson}" var="person">
							<form:option value="${person.id}">${person.firstName} ${person.lastName}</form:option>
						</c:forEach>
					</form:select>
					<form:errors path="person"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="expirationDate">Expiration Date:</form:label>
					<form:input type="date" path="expirationDate"/>
					<form:errors path="expirationDate"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="state">State:</form:label>
					<form:input type="text" path="state"/>
					<form:errors path="state"></form:errors>
				</div>
					<input type="submit" class="btn btn-success" value="View License Details"/>
					<a href="/" class="btn btn-danger">Cancel</a>
					
			</form:form>
	</div>
</body>
</html>