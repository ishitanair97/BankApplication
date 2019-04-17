<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/customer/cust" method="post">
Enter account Id:
<input type="number" name="id" required autofocus>
<br>
Enter password:
<input type="password" name="password" required>
<input type="submit" value="SUBMIT">
</form>
</body>
</html>