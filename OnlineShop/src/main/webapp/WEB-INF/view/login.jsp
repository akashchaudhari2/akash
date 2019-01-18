<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<h3 align="center">${headerMessage}</h3>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


</head>
<body id="LoginForm">


	<div class="container">


		<h1 class="form-heading">login Form</h1>

		<div class="login-form">

			<div class="main-div">




				<div class="panel">
			<!-- 		<h2>Admin Login</h2>
					<p>Please enter your email and password</p> -->
				</div>


				<form:form action="/OnlineShop/loginSuccess" method="post"
					modelAttribute="onlineCredentials" id="Login">







					<div class="form-group">
						<ul>

							<li>Enter Email</li>
							<li><form:input path="email"></form:input></li>
							<li><form:errors path="email" cssClass="error"></form:errors></li>

						</ul>

					</div>


					<div class="form-group">

						<ul>

							<li>Enter Password</li>
							<li><form:input path="password"></form:input></li>
							<li><form:errors path="password" cssClass="error"></form:errors></li>

						</ul>


					</div>


					<div class="forgot">
						<a href="/OnlineShop/registerItem">Forgot password?</a>
					</div>


					<ul>

						<li><input type="submit" value="Login"
							class="btn btn-primary"></li>


					</ul>


				</form:form>

<%-- <form action="uploadFile" method="get" enctype="multipart/form-data">
File Upload:<input type="file" value="Choose File" name="file">
<input type="submit" value="File-Upload">
</form> --%>


				<p class="botto-text">Designed by Akash Chaudhari</p>

			</div>
		</div>
	</div>

</body>
</html>