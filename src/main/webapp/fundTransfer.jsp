<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Funds</title>
</head>
<body>
<form action="../customer/fundTransfer" method="post">
Enter the account id of the reciever:
<input type="number" name="RecieverId">
<br><br>
Enter amount:
<input type="number" name="amount">
<br><br>
<input type="submit" value="send">
</form>
</body>
</html>