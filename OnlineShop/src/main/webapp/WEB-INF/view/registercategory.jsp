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
	
	
	<form:form action="/OnlineShop/registerCategory" method="post"
	
		modelAttribute="category">


		<h3>Register Category</h3>


		<table>



			<tr>

				<td>CategoryId:</td>
				<td><form:input path="categoryId"></form:input></td>
				<td><form:errors path="categoryId" cssClass="error"></form:errors></td>
			</tr>

			<tr>

				<td>CategoryName:</td>
				<td><form:input path="categoryName"></form:input></td>
				<td><form:errors path="categoryName" cssClass="error"></form:errors></td>
			</tr>


	<tr>
			
			<td><input type="submit" value="Enter"></td>
			
			</tr>



		</table>




	</form:form>





</body>
</html>