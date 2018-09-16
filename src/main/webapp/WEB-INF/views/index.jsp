<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- <script src="https://www.google.com/recaptcha/api.js" async defer></script> -->
<script src='https://www.google.com/recaptcha/api.js'></script>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>



<title>Hello, world!</title>
</head>
<body>
	<form id='demoform'
		action="http://localhost:8080/GoogleCapcha/user/postform"
		method="POST" novalidate="novalidate">
		<div class="form-group">
			<label class="sr-only" for="register-firstname">First name</label> <input
				type="text" name="firstName" placeholder="First name"
				class="form-control" id="register-firstname" required="required">
		</div>
		<div class="form-group">
			<label class="sr-only" for="register-lastname">Last name</label> <input
				type="text" name="lastName" placeholder="Last name"
				class="form-control" id="register-lastname" required="required">
		</div>
		<div class="form-group">
			<label class="sr-only" for="register-email">Email</label> <input
				type="email" name="email" placeholder="Email" class="form-control"
				id="register-email" required="required">
		</div>
		<div class="form-group">
			<label class="sr-only" for="register-phone">Phone</label> <input
				type="text" name="phone" placeholder="Phone" class="form-control"
				id="register-phone" required="required">
		</div>
		<div class="g-recaptcha"
			data-sitekey="6LcZcGIUAAAAAGMDQNCGt-AvCogKURsLHjqtvCH7"></div>
		<button type="submit" class="btn">Sign me up!</button>
	</form>
	<script type="text/javascript">
	var form = document.getElementById('demoform');
	form.addEventListener("submit", function(event) {
		if (grecaptcha.getResponse().length === 0) {
			event.preventDefault();
			alert('Please check the recaptcha');
		}else {
			alert(' recaptcha is checked');
		}
	}, false);
</script>
</body>
</html>
