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
<c:set var="contextRoot" value="${pageContext.request.contextPath}">
</c:set>
</head>
<body>

	<div class="container" style="background: #fff">
		<table class="table">
			<tr>
				<th colspan="2">
					<div class="list-group-item list-group-item-info"
						style="margin: -25px">
						<center>
							<h2>
								<b>Shipping Details</b>
							</h2>
						</center>
					</div>
				</th>
			</tr>
			<form action="${contextRoot}/user/placeOrder" method="post">
				<tr>
					<th class="text-center" colspan="2"><h3>
							<b>Shipping Address</b>
						</h3></th>
				</tr>
				<tr>
					<th>House Locality</th>
					<td><input name="locality" class="form-control"
						required="required" /></td>
				</tr>
				<tr>
					<th>City</th>
					<td><input name="city" class="form-control"
						required="required" pattern="[A-Za-z]+[ ]*[A-Za-z]*"
						title="Enter a valid name" /></td>
				</tr>
				<tr>
					<th>State</th>
					<td><input name="state" class="form-control"
						required="required" pattern="[A-Za-z]+[ ]*[A-Za-z]*"
						title="Enter a valid name" /></td>
				</tr>
				<tr>
					<th>Pincode</th>
					<td><input name="pincode" class="form-control"
						pattern="[0-9]{6}" title="Pincode must be six digit long"
						maxlength="6" required="" /></td>
				</tr>
				<tr>
					<th class="text-center" colspan="2"><h3>
							<b>Payment</b>
						</h3></th>
				</tr>
				<tr>
					<th>Payment Mode</th>
					<td>&nbsp; <label class="radio-inline"><input
							name="payMode" type="radio" value="Credit Card" required="true" />Credit
							Card</label> <label class="radio-inline"><input name="payMode"
							type="radio" value="Internet Banking" />Internet Banking</label> <label
						class="radio-inline"><input name="payMode" type="radio"
							value="Cash On Delivery" />Cash On Delivery</label></td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="row">
							<div class="col-sm-offset-2 col-sm-3">
								<a href="${e}user/cart"
									class="btn btn-danger btn-block myBoldFont" id="goBack">Go
									Back</a>
							</div>
							<div class="col-sm-2">
								<span>&nbsp;</span>
							</div>
							<div class="col-sm-3">
								<input type="submit" value="Place Order"
									class="btn btn-danger btn-block myBoldFont" />
							</div>
						</div>
					</td>
				</tr>
			</form>
		</table>
	</div>
	<br />
	<br />
</body>
</html>