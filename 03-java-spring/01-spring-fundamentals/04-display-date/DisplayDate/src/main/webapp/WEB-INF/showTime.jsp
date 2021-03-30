<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<!-- Link a external css file to the /time template that says colors the time in green.*/ -->
<link rel="stylesheet" type="text/css" href= "css/styles.css">
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - March 30, 2021">
<title>Current Time</title>
</head>
<body>

	<div class="container">
		<fieldset>
		<legend>Current Time</legend>
		<c:set var = "now" value = "${time}" />
		<h3 id="time"><fmt:formatDate pattern = "hh:mm a" value = "${now}" /></h3>  <!-- format time as 11:30 PM -->
		<a href="/">Home Page</a>
		</fieldset>
	</div>
<!-- Link a external javascript file to the /time template that alerts "This is the time template".  NOTE:  Javascript has to be place before the body ends -->
<script type="text/javascript" src="/js/timeAlert.js"></script>
</body>
</html>