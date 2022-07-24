<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Room</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Room Book</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveRoomBook" modelAttribute="bookcustomer"
			method="POST">

			<!-- Need to associate this data with customer id for update -->
			<form:hidden path="cust_stay_id" />

			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="cust_fname" /></td>
						<td></td>
						<td><label>Last Name:</label></td>
						<td><form:input path="cust_lname" /></td>
					</tr>

					<tr>
						<td><label>Address:</label></td>
						<td><form:textarea path="cust_address" rows="5" cols="34" /></td>
					</tr>
					<tr>
						<td><label>Verification ID:</label></td>
						<td><form:select path="cust_id">
								<form:options items="${veriIdList}" />
							</form:select></td>
					</tr>
					<tr>
						<td><label>Id Number:</label></td>
						<td><form:input path="cust_id_number" /></td>
					</tr>
					<tr>
						<td><label>Ph No:</label></td>
						<td><form:input path="cust_phno" /></td>
					</tr>
					<tr>
						<td><label>Mob No:</label></td>
						<td><form:input path="cust_mobno" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="cust_email" /></td>
					</tr>
					<tr>
						<td><label>Room Number:</label></td>
						<td><form:select path="room_id">
								<form:options items="${allActiveRoomList}" />
							</form:select>
					</tr>
					<tr>
						<td><label>Customer other Details:</label></td>
						<td><form:input path="cust_description" /></td>
					</tr>
					<tr>
						<td><label>Nationality:</label></td>
						<td><form:input path="cust_nationality" /></td>
					</tr>
					<tr>
						<td><label>Passport:</label></td>
						<td><form:input path="cust_passport" /></td>
					</tr>
					<tr>
						<td><label>Visa:</label></td>
						<td><form:input path="cust_visa" /></td>
					</tr>
					<tr>
						<td><label>Visa Validity:</label></td>
						<td><form:input path="cust_visa_stay_duartion" /></td>
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
			<a href="${pageContext.request.contextPath}/roomBooking/booklist">Back
				To RoomBook</a>
		</p>

	</div>

</body>
</html>