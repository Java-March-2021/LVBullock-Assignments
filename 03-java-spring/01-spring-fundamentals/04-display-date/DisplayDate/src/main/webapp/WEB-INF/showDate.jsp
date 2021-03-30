<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - March 30, 2021">
<link rel="stylesheet" type="text/css" href= "css/styles.css"> <!--Link an external css file -->


<title>Today's Date</title>
</head>
<body>
	
	<div class="container">
		<fieldset>
		<legend>Today's Date</legend>
		<c:set var = "now" value = "${date}" />
		<h3 id="date"><fmt:formatDate pattern = "EEEEEE, MMMM dd, yyyy"  value = "${now}"/></h3> <!-- format date as Saturday, the 22 of January, 2028 -->
		
		<a href="/">Home Page</a>
		</fieldset>
	</div>

<!-- Link a external javascript file to the /date template that alerts "This is the date template".  NOTE:  Javascript has to be place before the body ends -->	
<script type="text/javascript" src="/js/dateAlert.js"></script>	<!-- Javascript has to be place before the body ends -->
</body>
</html>