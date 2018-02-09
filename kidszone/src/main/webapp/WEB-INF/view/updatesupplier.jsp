<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>
 <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>supplier update</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
	h2{
	text-align:center;
	color:maroon;
	}
	
	</style>
</head>
<body>

	<c:set var="contextRoot" value="${pagecontext.request.contextPath}"> </c:set>
	<c:url value="/all/supplier/updatesupplier" var="url"></c:url>
</head>

<body>

		<h2> Update Supplier Details</h2>
		<br>	<br>	<br>
		
<springForm:form action="${url}" method="POST" modelAttribute="supp" class="form-horizontal">
            
             
            <div class="row">
                <div class="form-group col-md-12">
                   <springForm:label class="control-label col-sm-4"
					style="text-align:right;color:maroon;" path="sname">Supplier Name:</springForm:label>
                    <div class="col-md-7">
                       <springForm:input path="sname" class="form-control" value="${supp.sname}"/>
                       
                    </div>
                </div>
            </div>
            <springForm:input type="hidden"  path="sid" class="form-control"/>
            <br>
            <div class="form-group">
			<div class="col-sm-12">
			<div class= "text-center">
			<input type="submit" class="btn btn-info" value="submit"/>
			</div>
			</div>
			</div>
        </springForm:form>




	
	
	

	
</body>
</html>