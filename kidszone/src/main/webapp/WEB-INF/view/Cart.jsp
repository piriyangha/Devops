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
<title>cart page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href=https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css>
	<c:set var="contextRoot" value="${pageContext.request.contextPath}"> </c:set>
	<style>
	#nav p{
	text-align: center;
	}
	</style>
</head>
<body>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<p class="navbar-text"> Welcome:${pageContext.request.userPrincipal.name}</p>
<c:url value="/j_spring_security_logout" var="logout"/>		
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${logout}"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
				</ul>
				</div>	
  </nav>
  <img src="<c:url value="/resource/images/cart.jpg"/>" alt="cart" height="120" width="120">
  <h2 style="color:maroon;text-align:center;"> <b>Your Cart</b></h2>
  <br> <br>
    
<div>
		<table class="table table-hover table-condensed">
		<c:if test="${cartlist.size()==0}">
				<center>
					<h3>
						<b>Cart is Empty</b>
					</h3>
				</center>
			</c:if>
			<thead>
				<tr>
					<th>Images</th>
					<th>Product Name</th>
					<th>QTY</th>
					<th>Total Price</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cart.cartItems}" var="c">
					
					<c:url value="/resource/images/${c.product.pid}.jpg" var="imageUrl"></c:url>
					   <tr>
						<td><img src="${imageUrl}" height="80" width="80"></td>
						<td>${c.product.pname}</td>
						<td>${c.subquantity}</td>
						<td>${c.subtotal}</td>
						<c:url value="/cart/removecartitem/${c.cartitemid}" var="delurl"/>	
						<td><a href="${delurl}" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span></a></td>
					</tr>
				</c:forEach>
				<tr><td><span class="col-lg-8"><p><b>Total Cost : Rs. ${cart.grandTotal}</b></p></span></td> </tr>
			</tbody>
			
			<tfoot>
			<tr>
			<%-- <c:url value="ProductList" var="url"></c:url> --%>
			<td> <a href="${contextRoot}/productlist" class="btn btn-danger"><span class="col-lg-8"><i class="fa fa-angle-left"></i>Continue shopping</span></a></td>
			<td> <a href="${contextRoot}/checkout" class="btn btn-success"><span class="col-lg-8"><i class="fa fa-angle-right"></i>Check out</span></a></td>
			</tr>
			</tfoot>
		</table>
		
		
	</div>

</body>
</html>