<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3 align="center">${headerMessage}</h3>
	<form:form action="/OnlineShop/registerSuccess" method="post"
		modelAttribute="item">


		<h3>Register Item</h3>


		<table>



			<tr>

				<td>ItemId:</td>
				<td><form:input path="itemId"></form:input></td>
				<td><form:errors path="itemId" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>Password:</td>
				<td><form:password path="password"></form:password></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>Email:</td>
				<td><form:input path="email"></form:input></td>
				<td><form:errors path="email" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>EntryDate:</td>
				<td><form:input path="entryDate"></form:input></td>
				<td><form:errors path="entryDate" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>Quantity:</td>
				<td><form:input path="quantity"></form:input></td>
				<td><form:errors path="quantity" cssClass="error"></form:errors></td>
			</tr>




			<tr>

				<td>price:</td>
				<td><form:input path="price"></form:input></td>
				<td><form:errors path="price" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>Details:</td>
				<td><form:input path="details"></form:input></td>
				<td><form:errors path="details" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>ItemName:</td>
				<td><form:input path="itemName"></form:input></td>
				<td><form:errors path="itemName" cssClass="error"></form:errors></td>
			</tr>
			
			
			
			<tr>
			
			<td><input type="submit" value="Register"></td>
			
			</tr>
		
		
			
		
		
			

		</table>




	</form:form>



</body>
</html>