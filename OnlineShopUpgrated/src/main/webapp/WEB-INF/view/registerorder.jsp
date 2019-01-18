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
	<form:form action="/OnlineShopUpgrated/registerorder" method="post"
		modelAttribute="order">


		<h3>Order</h3>





		<table>



			<tr>

				<td>OrderId:</td>
				<td><form:input path="orderId"></form:input></td>
				<td><form:errors path="orderId" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>UserName:</td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>ItemName:</td>
				<td><form:input path="itemName"></form:input></td>
				<td><form:errors path="itemName" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>Quantity:</td>
				<td><form:input path="quantity"></form:input></td>
				<td><form:errors path="quantity" cssClass="error"></form:errors></td>
			</tr>




			<tr>

				<td>Price:</td>
				<td><form:input path="price"></form:input></td>
				<td><form:errors path="price" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>Status:</td>
				<td><form:input path="status"></form:input></td>
				<td><form:errors path="status" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>EntryDate:</td>
				<td><form:input path="entryDate"></form:input></td>
				<td><form:errors path="entryDate" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td><input type="submit" value="Enter"></td>

			</tr>



		</table>




	</form:form>



</body>
</html>