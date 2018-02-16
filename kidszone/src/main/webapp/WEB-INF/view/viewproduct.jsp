<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="springForm"
	uri="http://www.springframework.org/tags/form"%>
	<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Product</title>
<style>
body {
	font-family: times new roman;
	color: maroon;
}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
 <%-- <%@include file="header.jsp"%>  --%>
	<div>
		<div class="container">
			<h3 style="text-align:center; color:orange;">Details about the Product</h3>
			<table class="table table-bordered">
			<tr>
					<td>Product Name:</td>
					<td>${product.pname}</td>
				</tr>
				<c:url value="/resource/images/${product.pid}.jpg" var="imageUrl"></c:url>
			
				<tr>
					<td>Product Image</td>
					<td><img src="${imageUrl}" height="300" width="300"></td>
				</tr>
				<tr>
					<td>Brand Name</td>
					<td>${product.brandname}</td>
				</tr>	
				
				<tr>
					<td>Price</td>
					<td>${product.price}</td>
				</tr>
				<tr>
					<td>Stock</td>
					<td>${product.stock}</td>
				</tr>

			</table>
						
			</div>
			</div>

</body>
</html>