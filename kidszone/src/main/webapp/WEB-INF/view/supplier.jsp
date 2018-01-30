<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="save" value="/savesupplier"/>
 <form:form action="${save}" method="POST" modelAttribute="supp" class="form-horizontal">
            
             
            <div class="row">
                <div class="form-group col-md-12">
                    <label class="col-md-3 control-lable" for="sname">supplier Name</label>
                    <div class="col-md-7">
                        <form:input type="text" path="sname" id="sname" class="form-control input-sm"/>
                        <%-- <div class="has-error">
                            <form:errors path="firstName" class="help-inline"/>
                        </div> --%>
                    </div>
                </div>
            </div>
     
           <div class="form-actions">
                  <input type="submit"
                       class="btn btn-block btn-primary" value="submit">
            </div>
           
        </form:form>

</body>
</html>