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
	<form:form action="/OnlineShopUpgrated/registerpayment" method="post"
		modelAttribute="payment">


	
		
			<h3>Payment</h3>


		<table>



			<tr>

				<td>PaymentId:</td>
				<td><form:input path="paymentId"></form:input></td>
				<td><form:errors path="paymentId" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>UserName:</td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>Amount:</td>
				<td><form:input path="amount"></form:input></td>
				<td><form:errors path="amount" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>Amount type:</td>
				<td><form:input path="type"></form:input></td>
				<td><form:errors path="type" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>BankName:</td>
				<td><form:input path="bankName"></form:input></td>
				<td><form:errors path="bankName" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>Branch:</td>
				<td><form:input path="branch"></form:input></td>
				<td><form:errors path="branch" cssClass="error"></form:errors></td>
			</tr>

			<tr>
				<td>cardNumber:</td>
				<td><form:input path="cardNumber"></form:input></td>
				<td><form:errors path="cardNumber" cssClass="error"></form:errors></td>
			</tr>


			<tr>

				<td>Cvv:</td>
				<td><form:input path="cvv"></form:input></td>
				<td><form:errors path="cvv" cssClass="error"></form:errors></td>
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