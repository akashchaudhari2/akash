<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h3 align="center">${headerMessage}</h3>
	<form:form action="/OnlineShop/registeruser" method="post"
		modelAttribute="user">


		<h3>User</h3>





		<table>



			<tr>

				<td>UserId:</td>
				<td><form:input path="userId"></form:input></td>
				<td><form:errors path="userId" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>UserName:</td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>Email:</td>
				<td><form:input path="email"></form:input></td>
				<td><form:errors path="email" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>Password:</td>
				<td><form:input path="password"></form:input></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>




			<tr>

				<td>PhoneNo:</td>
				<td><form:input path="phoneNo"></form:input></td>
				<td><form:errors path="phoneNo" cssClass="error"></form:errors></td>
			</tr>




			<tr>

				<td><input type="submit" value="Enter"></td>

			</tr>



		</table>




	</form:form>





</body>
</html>