<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1 style="text-align:center"> Category List</h1>
<table  class="table table-responsive">
		<tr>
			
			<th>Category Name</th>
			
			<th>Actions</th>
		</tr>

		<c:forEach items="${category}" var="cat">
			<tr>
				
				<td><c:out value="${cat.cname}" /></td>
				

				<td align="center">
				<a href=<c:url value="/all/category/viewcategory/${cat.cid}"/>><span class="glyphicon glyphicon-info-sign">| |</span></a>
				<a href=<c:url value="/all/category/editform/${cat.cid}"/>><span class="glyphicon glyphicon-pencil">| |</span></a> 
				<a href=<c:url value="/all/deletecategory/${cat.cid}"/>><span class="glyphicon glyphicon-trash"></span></a>
					
			</tr>
		</c:forEach>
	</table>
</body>
</html>