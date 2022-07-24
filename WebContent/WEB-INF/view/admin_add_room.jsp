<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Room Details</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Administration Rooms Operations</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Room</h3>
		<form:form action="saveRoom" modelAttribute="adminAddRoom"
			method="POST">

			<!-- Need to associate this data with customer id for update -->
			<form:hidden path="roomid" />

			<table>
				<tbody>
					<tr>
						<td><label>Floor:</label></td>
						<td><form:input path="floor" /></td>
					</tr>
					<tr>
						<td><label>Block:</label></td>
						<td><form:input path="block" /></td>
					</tr>
					<tr>
						<td><label>Key Number:</label></td>
						<td><form:input path="key" /></td>
					</tr>
					<tr>
						<td><label>Room Number:</label></td>
						<td><form:input path="roomNumber" /></td>
					</tr>
					<tr>
						<td><label>Type of Room:</label></td>
						<td><form:select path="type">
								<form:option value="AC" label="AC" />
								<form:option value="Non AC" label="Non AC" />
							</form:select></td>
					</tr>
					<tr>
						<td><label>Description:</label></td>
						<td><form:input path="description" /></td>
					</tr>
					<tr>
						<td><label>Amount:</label></td>
						<td><form:input path="amount" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>

		</form:form>

		<dir style=""></dir>

		<p>
			<a href="${pageContext.request.contextPath}/adminRoom/roomList">Back
				To AdminRoom</a>
		</p>

	</div>


</body>
</html>