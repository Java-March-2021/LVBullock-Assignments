<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - 2/16/2021">
<title>Languages Dashboard</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<h1>List of Languages</h1><br>

	<div class="container">
	
  		<table class="table table-dark">
			<thead>
				<tr>
					<th>id</th>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
				<tbody>
				<!-- Loop through all of the languages -->
 					<c:forEach items="${allLanguages}" var="language">
					<tr>
						<td>${language.id}</td>
						<td><a href="/languages/${language.id}"><c:out value="${language.name}"/> </a></td>
						<td><c:out value="${language.creator}"/> </td>
						<td><c:out value="${language.currentVersion}"/> </td>
						<td><a href="/languages/delete/${language.id}">Delete</a> | <a href="/languages/edit/${language.id}">Edit</a></td>
						<td></td>
					</tr>
					</c:forEach>
				</tbody>			
			</table>
	</div><br>
	
	<hr style="border: 5px solid #0084ad"><br>
	
 	<div class="addLanguage">
		<h1>Add A Language</h1><br>

		<c:forEach items="${errors}" var="err">
			<h4>${err}</h4>
		</c:forEach>
	
		<!-- <h1>JSTL Way -- USE WHEN CREATING A NEW OBJECT </h1> -->
	
		<!-- ALWAYS USE WHEN WE ARE CREATING A NEW OBJECT-->
 		<form:form method="POST" action="/languages" modelAttribute="language"> <!-- when ever you have a form, must have @ModelAttribute in the controller method (see line 27 of controller -- index function root route (localhost:8080)-->
			<div class="form-group">
				<form:label path="name">Name:
				<form:errors path="name"/>
				<form:input path="name"/>
				</form:label>
			</div>
			
			<div class="form-group">
				<form:label path="creator">Creator:
				<form:errors path="creator"/>
				<form:input path="creator"/>
				</form:label>
			</div>
			
			<div class="form-group">
				<form:label path="currentVersion">Version:
				<form:errors path="currentVersion"/>
				<form:input path="currentVersion"/>
				</form:label>
			</div>
	
			
			<button class="btn btn-success">Submit</button><br><br>
			
		</form:form>

	</div>

</body>
</html>