<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your Transasction Commited...See The Details as Below.</h1>
<table border=3>
    <tr>
    	<td>Transaction Id</td>
    	<td>${transaction.id}</td>
    </tr>
        <tr>
            <td>Transaction Type</td>
            <td>${transaction.type}</td>
        </tr>
        <tr>
            <td>Transaction Amount</td>
            <td>${transaction.amount}</td>
        </tr>
        <tr>
        	<td>Updated Balance</td>
        	<td>${transaction.getAccount().getAmount()} </td>
        </tr>
     </table>
     <br>
     Go Back To<a href="home">Home</a>Page
</body>
</html>