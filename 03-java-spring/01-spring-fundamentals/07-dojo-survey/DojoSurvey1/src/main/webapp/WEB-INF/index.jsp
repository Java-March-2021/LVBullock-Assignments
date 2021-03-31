<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="author" content="Laura V. Bullock - March 30, 2021">
<link rel="stylesheet" type="text/css" href= "css/styles.css">

<title>Dojo Survey Index</title>
</head>
<body>

	<div class="container">

    	<form action="/result" method="POST">
    	
    	<fieldset>
    	<legend>Dojo Survey</legend><br>
    	
	        Your Name: <input type="text" name='userName'><br><br>
	        
	       	Email: <input type="email" name='email'><br><br>
	        
	        Dojo Location:
	             <select name="dojoLocation">
	                <option value="Choose Location:">Choose Location:</option>
	                <option value="Arlington, VA">Arlington, VA</option>
	                <option value="Bellevue, WA">Bellevue, WA</option>
	                <option value="Boise, ID">Boise, ID</option>
	                <option value="Chicago, IL">Chicago, IL</option>
	                <option value="Dallas, TX">Dallas, TX</option>
	                <option value="Los Angeles, CA">Los Angeles, CA</option>
	                <option value="Oakland, CA">Oakland, CA</option>
	                <option value="San Jose, CA">San Jose, CA</option>
	                <option value="Tulsa, OK">Tulsa, OK</option>
	                <option value="Online">Online</option>
	            </select><br><br>

			Favorite Language:
	              <select name="selectLanguage">
	                <option value="Choose Language">Choose Language:</option>
	                <option value="Java">Java</option>
	                <option value="Python">Python</option>
	                <option value="HTML">HTML</option>
	                <option value="CSS">CSS</option>
	                <option value="Javascript">Javascript</option>
	                <option value="MEAN">MEAN</option>
	               	<option value="MERN">MERN</option>
	                
	            </select><br><br>
	
			Comment/Suggestions (optional):<br>
				<textarea rows="10" cols="70" name="comment" id="comment"></textarea><br><br>
						
			<a href="/result"><button>Submit</button></a><br>
			</fieldset>
		</form>
	</div> <!-- end of container -->

</body>
</html>