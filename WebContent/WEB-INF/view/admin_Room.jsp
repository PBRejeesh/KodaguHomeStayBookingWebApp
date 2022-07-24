<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page --- Rooms Operations</title>
<link type="text/css" 
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css"
/>
</head>
<body>

</body>

<div id="wrapper">
  <div id="header">
    <h2>Administration Rooms Operations </h2>
  </div>
</div>

<div id="container">
  <div id="content">
  
  <input type="button" value="Add Room" 
         onclick="window.location.href='addAdminRoom'; return false" 
          class="add-button"/>
  <table>
  <tr>
    <th>Floor</th>
    <th>Block</th>
    <th>Key Number</th>
    <th>Room Number</th>
    <th>Type of Room</th>
    <th>Description</th>
    <th>Amount</th>
    <th>Action</th>
  </tr>
  
  <c:forEach var="adminRoom" items="${adminRooms}">
  
  
         <c:url var="updateLink" value="/adminRoom/adminRoomUpdate">
            <c:param name="roomId" value="${adminRoom.roomid}"/>
         </c:url>
         
         
         <c:url var="deleteLink" value="/adminRoom/adminRoomDelete">
            <c:param name="roomId" value="${adminRoom.roomid}"/>
         </c:url>
         
         
  <tr>
     <td>${adminRoom.floor} </td>
     <td>${adminRoom.block} </td>
     <td>${adminRoom.key} </td>
     <td>${adminRoom.roomNumber} </td>
     <td>${adminRoom.type} </td>
     <td>${adminRoom.description} </td>
     <td>${adminRoom.amount} </td>
     <td> 
                <a href="${updateLink}">Update</a>
                <a href="${deleteLink}" onclick="if(!(confirm('Are you sure want to delete this room?'))) return false">Delete</a>
     </td>
  </tr>
  
  </c:forEach>
  </table>
  </div>
</div>

</html>