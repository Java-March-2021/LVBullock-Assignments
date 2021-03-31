<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura Bullock - March 30, 2021">
<link rel="stylesheet" type="text/css" href= "css/styles.css">

<title>Dojo Survey Result</title>
</head>
<body>

	<div class="container">
	
    	<fieldset>
    	<legend>Submitted Info</legend>
    	
		    <p>Name: <c:out value="${userName}" /></p>
		    <p>Email: <c:out value="${email}" /></p>
		    <p>Dojo Location: <c:out value="${dojoLocation}" /></p>
		    <p>Favorite Language: <c:out value="${selectLanguage}" /></p>
		    <p>Comment: <c:out value="${comment}" /></p>
		    
			<a href="/"><button>Go Back</button></a>
		</fieldset>
	</div>

</body>
</html>