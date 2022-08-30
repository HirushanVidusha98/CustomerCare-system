<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-color: #E4E9F7;
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
input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Delete Inquiry </h2>
<div>
<br>
<form action="remove" method="post">
        Inquiry id <input type="text" name="iid" placeholder=""><br>
		
		<input type="submit" name="submit" value="delete">
	</form>
</div>
</body>
</html>