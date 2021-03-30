<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - March 30, 2021">
<link rel="stylesheet" type="text/css" href= "css/styles.css">

<title>Home</title>
</head>
<body>
	<h1>Welcome to the Date/Time Selector</h1>

	<h3>Select a button to display today's date or current time</h3>
	
	<hr>
	
	<div class="select">
		<h3><a href="/date"><button onclick="dateAlert()">Today's Date</button></a></h3>
	</div>
	
	<div class="select">
		<h3><a href="/time"><button onclick="timeAlert()">Current Time</button></a></h3>
	</div>

</body>
</html>