<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock, March 30, 2021">
<link rel="stylesheet" href="css/styles.css"/>

<title>Index</title>
</head>
<body>
		<h5><c:out value="${errors}" /></h5>
		
		<h1>To gain entry, you must know The Code?</h1>
		
		<form action="/code" method="POST">
		
			<input type="text" name="guess" placeholder="Enter the code."/>
			
			<button>Try Code</button>
		</form>
		
</body>
</html>