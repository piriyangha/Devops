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
<title>Header page</title>
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
</head>
<body>
	<nav class="navbar navbar info-color-dark">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="glyphicon glyphicon-menu-hamburger"></span>
			</button>
			<a class="navbar-brand" href="#">KiddyPalace</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#"><span
						class="glyphicon glyphicon-home aria-hidden=true"></span> Home</a></li>
				<li><a href="#add"><span
						class="glyphicon glyphicon-home aria-hidden=true"></span> Admin</a></li>

				<li>
					<button type="button" class="btn btn-info btn-lg"
						data-toggle="modal" data-target="#regis">
						<span class="glyphicon glyphicon-user"></span> Add
					</button>



					<div class="modal fade" id="regis" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog cascading-modal" role="document">
							<!--Content-->
							<div class="modal-content">

								<!--Modal cascading tabs-->
								<div class="modal-c-tabs">

									<!-- Nav tabs -->
									<ul class="nav nav-tabs tabs-3 light-blue darken-3"
										role="tablist">
										<li class="nav-item"><a class="nav-link active"
											data-toggle="tab" href="#panel7" role="tab"><i
												class="fa fa-user mr-1"></i> supplier</a></li>
										<li class="nav-item"><a class="nav-link"
											data-toggle="tab" href="#panel8" role="tab"><i
												class="fa fa-user-plus mr-1"></i> category</a></li>
										<li class="nav-item"><a class="nav-link"
											data-toggle="tab" href="#panel9" role="tab"><i
												class="fa fa-user-plus mr-1"></i> product</a></li>
									</ul>

									<!-- Tab panels -->
									<div class="tab-content">
										<!--Panel 7-->
										<div class="tab-pane fade in show active" id="panel7"
											role="tabpanel">

											<!--   Body -->
											<div class="modal-body mb-1">

												<%@ include file="supplier.jsp"%>
												<div class="text-center mt-2">
													<button class="btn btn-info" type="submit" form="form2" value="saveproduct">Submit</button>
													<button type="button"
														class="btn btn-primary waves-effect ml-auto"
														data-dismiss="modal">Close</button>
												</div>
											</div>


										</div>
										<!--/.Panel 7-->
										<!--Panel 8-->
										<div class="tab-pane fade" id="panel8" role="tabpanel">

											<!--Body-->
											<div class="modal-body mb-1">
												
                                                 <%@include file="category.jsp" %>
												<div class="text-center mt-2">
													<button class="btn btn-info" type="submit" form="form3" value="saveproduct">Submit</button>
												
													<button type="button"
														class="btn btn-primary waves-effect ml-auto"
														data-dismiss="modal">Close</button>
												</div>
											</div>

										</div>
										<!--/.Panel 8-->
										<!--Panel 9-->
										<div class="tab-pane fade" id="panel9" role="tabpanel">

											<!--Body-->
											<div class="modal-body mb-1">
												
                                                <%@include file="product.jsp" %>
												
													<div class="text-center mt-2">
													<button class="btn btn-info" type="submit" form="form1" value="saveproduct">Submit</button>
													<button type="button"
														class="btn btn-primary waves-effect ml-auto"
														data-dismiss="modal">Close</button>
												</div>
											
											</div>

										</div>
									</div>

								</div>
							</div>
							<!--/.Content-->
						</div>
					</div>
				<li><a href="supplier"><span
						class="glyphicon glyphicon-home aria-hidden=true"></span>Add
						Supplier</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">category <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Boys</a></li>
						<li><a href="#">Girls</a></li>
						<li><a href="#">Toys</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>
