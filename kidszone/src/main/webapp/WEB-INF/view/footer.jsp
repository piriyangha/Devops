<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Footer Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<c:set var="contextRoot" value="${pageContext.request.contextPath }"></c:set>
<style>
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: grey;
	color: black;
}

.fa-facebook {
	background: #3B5998;
	color: white;
	height: 30px;
	width: 25px;
}

.fa-twitter {
	background: #55ACEE;
	color: white;
	height: 30px;
	width: 25px;
}
</style>
</head>
<body>
	<div class=footer>
		<div class="pull-left">
				<h2>Get to know us</h2>
				<ul>
				<li><a href="${contextRoot}/contactus">Contact Us</a></li>
				<li><a href="${contextRoot}/aboutus"> About Us</a></li>

			</ul>
		</div>

		<div Style="text-align: center;">
			<h5>
				<u>connect us with</u>
			</h5>
			<a href="#" class="fa fa-facebook"></a> <a href="#"
				class="fa fa-twitter"></a>
		</div>
	</div>
</body>
</html>