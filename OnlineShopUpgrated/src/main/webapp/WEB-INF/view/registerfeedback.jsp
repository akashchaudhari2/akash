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
	<form:form action="/OnlineShopUpgrated/registerfeedback" method="post"
		modelAttribute="feedback">




		<h3>Enter FeedBack:</h3>


		<table>



			<tr>

				<td>FeedbackId:</td>
				<td><form:input path="feedbackId"></form:input></td>
				<td><form:errors path="feedbackId" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>UserName:</td>
				<td><form:input path="userName"></form:input></td>
				<td><form:errors path="userName" cssClass="error"></form:errors></td>
			</tr>



			<tr>

				<td>Message:</td>
				<td><form:input path="message"></form:input></td>
				<td><form:errors path="message" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>EntryDate:</td>
				<td><form:input path="entryDate"></form:input></td>
				<td><form:errors path="entryDate" cssClass="error"></form:errors></td>
			</tr>

<tr><td><input type="submit" value="Enter"></td></tr>



		</table>

	</form:form>
</body>
</html>