<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<h1>WELCOME TO NINJA GOLD!!!</h1>
	<p>MARCH 2021 edition</p>
	
	<h2>Gold Earned:  <c:out value="${totalGold}" /> </h2>

	<h3>Let's earn some gold!</h3>
	
	<div class="location">
		<form method="POST" action="/findgold">
			<input type="hidden" value="FARM" name="location">
			<h3>Farm</h3>
			<p>(earns 10-20 gold)</p>
			<button>Find Gold</button>
		</form>
	</div>

	<div class="location">
		<form method="POST" action="/findgold">
			<input type="hidden" value="CAVE" name="location">
			<h3>Cave</h3>
			<p>(earns 5-10 gold)</p>
			<button>Find Gold</button>
		</form>
	</div>

	<div class="location">
		<form method="POST" action="/findgold">
			<input type="hidden" value="HOUSE" name="location">
			<h3>House</h3>
			<p>(earns 2-5 gold)</p>
			<button>Find Gold</button>
		</form>
	</div>

	<div class="location">
		<form method="POST" action="/findgold">
			<input type="hidden" value="CASINO" name="location">
			<h3>Casino</h3>
			<p>(earns/loses 0-50 gold)</p>
			<button>Find Gold</button>
		</form>
	</div>

	<h3>Activities</h3>
	<div class="activities">
		<c:forEach items="${activity}" var="act">
			<p class="${act.contains("LOST")? "red" : "green" }">
				<c:out value="${act}" />
			</p>
		</c:forEach>
	</div>
</body>
</html>