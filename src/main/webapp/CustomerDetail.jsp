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
<h3>Account Details</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>email</th>
				<th>Balance</th>
				<th>Username</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="customers" items="${CUSTOMERLIST}">
				<tr>
					<td>${customers.accountId}</td>
					<td>${customers.accountHolderName}</td>
					<td>${customers.emailId}</td>
					<td>${customers.accountBalance}</td>
					<td>${customers.username}</td>
					<td>${customers.password}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="../index"> LOGOUT </a>
</body>
</html>