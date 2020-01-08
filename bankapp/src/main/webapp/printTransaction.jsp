<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Print Transaction Details</title>
</head>
<body>
<h1>Print Transaction Details</h1>

<h3>Transaction Details for Account No : ${tList.get(0).getAccount().getNo()}</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Transaction Id</th>
				<th>Transaction Type</th>
				<th>Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="transaction" items="${tList}">
				<tr>
					<td>${transaction.id}</td>
					<td>${transaction.type}</td>
					<td>${transaction.amount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>