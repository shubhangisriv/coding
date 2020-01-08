<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Show Balance Page</h1>
<h2>Submitted Account Information</h2>
    <table border=3>
    <tr>
    	<td>Account No</td>
    	<td>${account.no}</td>
    </tr>
        <tr>
            <td>Account Holder's Name :</td>
            <td>${account.name}</td>
        </tr>
        <tr>
            <td>Opening / Current Balance</td>
            <td>${account.amount}</td>
        </tr>
     </table>
     <br>
     Go Back To<a href="home">Home</a>Page
</body>
</html>