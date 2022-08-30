<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<style>
body {
  background-color: #E4E9F7;
}
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  border: 1px solid black;
  
}
input[type=submit]:hover {
  background-color: #45a049;
}
input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=button] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}



</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<c:forEach var="man" items="${Managerdetails}"> 
<div>
<h2> Login Details </h2> <br><br>
  <table id="customers"> 
	<tr>
	<td> userIDS </td>
	<td>
	${man.id} 
	</td>
	</tr> <tr> <td> user name </td>
	<td>
	${man.name}
	</td>
	</tr>
	<tr> <td> email </td> <td> 
	
	${man.email}</td>
	</tr>
	<tr> <td>phone </td>
	<td>
	${man.phone}
	</td> </tr>
	<tr> <td> user name </td>
	<td>
	${man.userName}
	</td> </tr>
	<tr> <td> password </td>
	<td>
	${man.password}
	</td></tr>
	</table>
	</div>
<br>
<br>
</c:forEach>


   <form action="show" method="post">
<input type="submit" name="submit2" value="Display Customer Entered Feedback details">
</form>
<br><br>
<table id="customers"> 

<tr> <th> Feedback Id </th><th> User ID </th> <th> Phone number </th>
<th>  Category </th> <th> Detail </th> <th> reference No </th> </tr>
<c:forEach var="fed" items="${feeddetails}"> 

<tr> <td>
  	${fed.id} 
  	</td><td>
    ${fed.username}
    </td><td>
    ${fed.number}
    </td><td>
	${fed.catogory}
	</td><td>
	${fed.detail}
	</td><td>
	${fed.reference}
	</td>
	</tr>
</c:forEach>
</table>
<br><br>
<form action="InqureydisplayServlet" method="post">
<input type="submit" name="submit" value="Display result for feedbacks">
</form>


<br><br>
<table id="customers">
<tr> <th> Inquiry Id  </th><th>Customer ID </th> <th> feedbackID  </th>
<th> Solution </th> </tr>
<c:forEach var="inq" items="${inquirydetails}"> 
    <tr> <td>
  	${inq.id} 
  	 </td><td>
	${inq.cusid}
	 </td><td>
	${inq.feedid}
	 </td><td>
	${inq.status}
     </td></tr>    	
	
</c:forEach>
</table>

<br><br>
<c:url value="updateInquiry.jsp" var="updateinquiry">
</c:url>
<a href="${updateinquiry}">
<input type="button" name="update" value="update my data">
</a>

<br>
<c:url value="deleteInquiry.jsp" var="deleteinquiry">
</c:url>
<a href="${deleteinquiry}">
<input type="button" name="delete" value="delete my data">
</a>

<br><br>
<div>
<h2> Enter Solutions </h2>
<br>
<form action="insert" method="post">
		customer id <input type="text" name="cid" placeholder=""><br>
		feedback id <input type="text" name="fid" placeholder=""><br>
		solution <input type="text" name="sta" placeholder=""><br>
		<input type="submit" name="submit" value="submit">
	</form>
	</div>
	<br>
	<br>
	

	

</body>
</html>