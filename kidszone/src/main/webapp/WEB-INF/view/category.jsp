<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>
 <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>category</title>
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
</head>
<body>
<springForm:form action="${contextRoot}/savecategory" method="POST" modelAttribute="cat" class="form-horizontal" id="form3">
            
             
            <div class="row">
                <div class="form-group col-md-12">
                   <springForm:label class="control-label col-sm-4"
					style="text-align:right;color:maroon;" path="cname">Category Name:</springForm:label>
                    <div class="col-md-7">
                       <springForm:input path="cname" class="form-control"
						placeholder="Enter category name"/>
                       
                    </div>
                </div>
            </div>
     
          
           
        </springForm:form>

</body>
</html>