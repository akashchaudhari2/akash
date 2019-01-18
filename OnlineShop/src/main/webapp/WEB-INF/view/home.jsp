<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>




</head>
<body>

	<jsp:include page="../view/fragment/header.jsp"></jsp:include>


	<h3>Welcome Page</h3>


	<div class="container">

	
		<ul class="list-group">


			<li class="list-group-item"><a href="/OnlineShop/login">Login</a>
			</li>

			<li class="list-group-item"><a href="/OnlineShop/Alldata">Register</a>
			</li>

	



		</ul>



	</div>

</body>
</html>