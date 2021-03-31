<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" type="text/css" href= "css/styles.css">
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - March 30, 2021">

<title>Current visit count</title>
</head>
<body>
	<div class="container">
		<h1>http://localhost:8080 has been visited ${count} time(s)</h1>
		<h3>To increase the counter above, you must --> <a href="/">Go Home</a> and visit again.</h3>
		<div>
			<a href="/reset"><button>Reset the Counter</button></a>
		</div>
	</div>
	
	
</body>
</html>