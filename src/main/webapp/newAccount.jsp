<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer Account</title>
</head>
<body>
<form action="../account/newAccount" method="post">
Enter Account Details:
<br>
Enter customer name:
<input type="text" name="accountHolderName" required autofocus>
<br>
Enter customer email Id:
<input type="text" name="emailId" required>
<br>
Enter customer Account Balance:
<input type="number" name="accountBalance">
<br>
Enter customer username:
<input type="text" name="username">
<br>
Enter customer password:
<input type="text" name="password">
<input type="submit" value="create account">
</form>
	
<a href="../index.jsp"> LOGOUT </a>
</body>
</html>