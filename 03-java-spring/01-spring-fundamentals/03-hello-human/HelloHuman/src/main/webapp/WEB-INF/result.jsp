<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitor Name Result</title>
</head>
<body>
<h1>Hello <c:out value="${visitorName}!"/></h1>

<h3>Thank you for visiting.</h3>

<hr>

<h4>Feel free to  or enter your favorite color in the address bar preceded by / and hit the enter key OR <br><br>

<a href="/">Start Over</a></h4>

</body>
</html>