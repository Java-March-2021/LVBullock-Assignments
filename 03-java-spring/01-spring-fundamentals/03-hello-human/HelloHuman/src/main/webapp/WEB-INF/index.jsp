<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta author = "Laura V. Bullock - March 29, 2021">
<title>Hello Human Index Page</title>
</head>
<body>
	<h1>Welcome to the 3rd edition of Laura Bullock's Java Journey!</h1>
	<h3>It's a wild ride!!</h3>
	<hr>
	
	<form method="POST" action="/visitor">
	<h2>Who is visiting with us today:  <input type="text" name="visitorName" placeholder="Enter name or leave blank"></h2>

	<button>Submit</button>
	</form>
</body>
</html>

<!--Assignment: Hello "Human" - http://learn.codingdojo.com/m/145/6906/49945
You are tasked to build a page that will greet whoever visits your page. If they don't tell you their name, then greet them as "human".


Topics:
- Query Parameters

Tasks:
--Create an app that will render a page with either a default value of "human" or with the name provided in the URL query string.-->
