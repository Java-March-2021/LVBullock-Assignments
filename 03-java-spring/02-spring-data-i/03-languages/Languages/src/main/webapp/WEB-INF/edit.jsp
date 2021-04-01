<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock">

<title><c:out value="${language.name}" /></title> <!-- places the name of the object on the tab -->

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<a href="/languages/delete/${language.id}">Delete</a>  |  
	<a href="/languages">Back to Dashboard</a><br><br>

	<h1>Edit Language:  <c:out value="${language.name}" /></h1><br>
	
	<!-- Show errors if updating does not pass validation -->
	<c:forEach items="${errors}" var="err">
		<h4>${err}</h4>
	</c:forEach>
	
	<form:form method="POST" action="/languages/edit/${language.id}" modelAttribute="language">
		<div class="form-group">
			<form:label path="name">Name:
			<form:errors path="name"/>
			<form:input type="text" path="name" value="${language.name}"/></form:label>
		</div>
		<div class="form-group">
			<form:label path="creator">Creator:
			<form:errors path="creator"/>
			<form:input type="text" path="creator" value="${language.creator}"/></form:label>
		</div>
		<div class="form-group">
			<form:label path="currentVersion">Version:
			<form:errors path="currentVersion"/>
			<form:input type="text" path="currentVersion" value="${language.currentVersion}"/></form:label>
		</div><br>
		
		<!-- Update goes back to display page -->
		<button class="btn btn-success">Update</button>
		<a href="/languages"class="btn btn-danger">Cancel Updates</a><br><br>
		
	</form:form>
	
	
</body>
</html>