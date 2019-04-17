<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
</head>
<body>
<form action="../customer/deposit" method="post">
Enter Deposit Amount:
<input type="number" name="balance" required>
<br><br>
<input type="submit" value="Deposit">
</form>
</body>
</html>