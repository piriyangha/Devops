<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank You</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>check out</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cart page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href=https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
</head>
<body>


	<div class="container">
		<br />
		<center>
			<div class="col-sm-offset-3 col-sm-6"
				style="box-shadow: 0 0 10px grey; padding: 16px; margin-bottom: 25px;">
				<img src="<c:url value="/resources/images/ordersuccess.png"/>"
					height=200 width=200 />
				<h1>
					<b>Order Placed Successfully</b>
				</h1>
				<br /> <i><h2>Thank You For Choosing us</h2></i> <br />
				<div class="col-sm-5">
					<a href="${contextRoot}" class="btn btn-success btn-block">Continue
						Shopping....</a>
				</div>
				<div class="col-sm-offset-2 col-sm-5">
					<a href="${e}user/myOrders" class="btn btn-success btn-block">View
						Orders</a>
				</div>
			</div>
		</center>
	</div>
</body>
</html>