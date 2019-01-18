<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" isELIgnored="false"%>
<html>
<head>
<title>Item Page</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #fff;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	background-color: #f0f0f0;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}
</style>
</head>
<body>

<h3 align="center">${headerMessage}</h3>
	<form:form action="/OnlineShopUpgrated/registerSuccess" method="post"
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






	<%-- <h1>Add a Person</h1>

	<c:url var="addAction" value="/item/add"></c:url>

	<form:form action="${addAction}" commandName="item">
		<table>
			<c:if test="${!empty item.itemName}">
				<tr>
					<td><form:label path="itemId">
							<spring:message text="ID" />
						</form:label></td>
					<td><form:input path="itemId" readonly="true" size="8"
							disabled="true" /> <form:hidden path="itemId" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="itemName">
						<spring:message text="Name" />
					</form:label></td>
				<td><form:input path="itemName" /></td>
			</tr>
			<tr>
				<td><form:label path="details">
						<spring:message text="details" />
					</form:label></td>
				<td><form:input path="details" /></td>
			</tr>


			<tr>
				<td><form:label path="price">
						<spring:message text="price" />
					</form:label></td>
				<td><form:input path="price" /></td>
			</tr>





			<tr>
				<td><form:label path="quantity">
						<spring:message text="quantity" />
					</form:label></td>
				<td><form:input path="quantity" /></td>
			</tr>




			<tr>
				<td><form:label path="entryDate">
						<spring:message text="entryDate" />
					</form:label></td>
				<td><form:input path="entryDate" /></td>
			</tr>



			<tr>
				<td colspan="2"><c:if test="${!empty item.itemName}">
						<input type="submit" value="<spring:message text="Edit Item"/>" />
					</c:if> <c:if test="${empty item.itemName}">
						<input type="submit" value="<spring:message text="Add Item"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Items List</h3>
	<c:if test="${!empty listItems}">
		<table class="tg">
			<tr>
				<th width="80">Item ID</th>
				<th width="120">Item Name</th>
				<th width="120">Item Details</th>
				<th width="80">Item Price</th>
				<th width="120">Item Quantity</th>
				<th width="120">Item EntryDate</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listItems}" var="item">
				<tr>
					<td>${item.itemId}</td>
					<td>${item.itemName}</td>
					<td>${item.details}</td>
					<td>${item.price}</td>
					<td>${item.quantity}</td>
					<td>${item.entryDate}</td>
					<td><a href="<c:url value='/edit/${item.itemId}' />">Edit</a></td>
					<td><a href="<c:url value='/remove/${item.itemId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if> --%>
</body>
</html>
