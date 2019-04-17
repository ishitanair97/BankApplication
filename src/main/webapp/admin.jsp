<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<form action="/account/admin" method="post">
Enter Username:
<input type="text" name="user" required autofocus>
<br>
Enter password:
<input type="password" name="password" required>
<input type="submit" value="SUBMIT">
</form>
</body>
</html>