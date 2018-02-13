<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="springForm"
	uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product page</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>supplier</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.4/css/mdb.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.4.4/js/mdb.min.js"></script>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
</head>
<body>
	<springForm:form action="${contextRoot}/saveproduct" method="POST"
		modelAttribute="pro" enctype="multipart/form-data"  class="form-horizontal" id="form1">    <!--  enctype="multipart/form-data" -->


		<div class="row">
			<div class="form-group col-md-12">
				<springForm:label class="control-label col-sm-4"
					style="text-align:right;color:maroon;" path="pname">Product Name:</springForm:label>
				<div class="col-md-7">
					<springForm:input path="pname" class="form-control"
						placeholder="Enter product name" />

				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<springForm:label class="control-label col-sm-4"
					style="text-align:right;color:maroon;" path="brandname">Brand Name:</springForm:label>
				<div class="col-md-7">
					<springForm:input path="brandname" class="form-control"
						placeholder="Enter brand name" />

				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<springForm:label class="control-label col-sm-4"
					style="text-align:right;color:maroon;" path="price">Price:</springForm:label>
				<div class="col-md-7">
					<springForm:input path="price" class="form-control"
						placeholder="Enter price" />

				</div>
			</div>
		</div>
		<div class="row">
			<div class="form-group col-md-12">
				<springForm:label class="control-label col-sm-4"
					style="text-align:right;color:maroon;" path="stock">Stock:</springForm:label>
				<div class="col-md-7">
					<springForm:input path="stock" class="form-control"
						placeholder="Enter stock" />

				</div>
			</div>
		</div>
		<div class="row">
		<div class="form-group">
				<springForm:label class="control-label col-sm-4"
					style="text-align:right; color:maroon;" path="">Select category:</springForm:label>
				<div class="control-label col-sm-4 col-sm-4">
					<springForm:select class="form-control" path="category.cid">
						<springForm:option value="0" label="----select category----" />
						<c:forEach var="c" items="${category}">
							<springForm:option value="${c.cid}" label="${c.cname}" />
						</c:forEach>
					</springForm:select>
              </div>
				</div>
			</div>
	  
			<div class="form-group">
				<springForm:label class="control-label col-sm-4"
					style="text-align:right; color:maroon;" path="image"> Upload Image:</springForm:label>
				<div class="control-label col-sm-4 col-sm-4">
					<springForm:input type="file" path="image" class="form-control"
						placeholder="upload image" />
				</div>
			</div>
		 
	</springForm:form>
</body>
</html>