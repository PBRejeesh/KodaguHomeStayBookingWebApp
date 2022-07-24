<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Booking</title>
<link type="text/css" 
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css"
/>
</head>
<body>

   <div id="wrapper">
      <div id="header">
        <h2>Room Booking Page</h2>
      </div>
   </div>
   
   <div id="container">
     <div id="content">
     
        <!-- Put new button to Add customer -->
        <input type="button" value="Book" 
         onclick="window.location.href='showRoomBookAdd'; return false" 
          class="add-button"/>
       <table>
         <tr>
              <th>FirstName</th>
			  <th>LastName</th>
              <th>Address</th>
              <th>Ph No</th>
              <th>Mob No</th>
              <th>Email</th>
              <th>room_id</th>
              <th>Customer Description</th>
              <th>International Traveler</th>
              
         </tr>
         <c:forEach var="tempCustomer" items="${roombook}">
         
         <!-- Construct and update link with customer id -->
         <c:url var="updateLink" value="/roomBooking/showRoomBookUpdate">
            <c:param name="bookingId" value="${tempCustomer.stay_id}"/>
         </c:url>
         
          <!-- Construct and Delete link with customer id -->
         <c:url var="deleteLink" value="/roomBooking/delete">
            <c:param name="bookingId" value="${tempCustomer.stay_id}"/>
         </c:url>
         
           <tr>
             <td>${tempCustomer.fname} </td>
             <td>${tempCustomer.lname} </td>
             <td>${tempCustomer.address} </td>
             <td>${tempCustomer.phno} </td>
             <td>${tempCustomer.mobno} </td>
             <td>${tempCustomer.email} </td>
             <td>${tempCustomer.room_id} </td>
             <td>${tempCustomer.description} </td>
             <td>${tempCustomer.interNationlTravler} </td>
             
             <td> 
                <a href="${updateLink}">Update</a>
                <a href="${deleteLink}" onclick="if(!(confirm('Are you sure want to delete this customer?'))) return false">Delete</a>
              </td>
           </tr>
         
         </c:forEach>
       </table>
     </div>
   </div>

</body>
</html>