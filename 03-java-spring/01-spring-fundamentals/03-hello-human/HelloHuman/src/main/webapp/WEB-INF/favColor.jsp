<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorite Color</title>
</head>
<body>
<h1>Your favorite color is: <c:out value="${color}"/></h1>

<a href="/">Start Over</a>

</body>
</html>