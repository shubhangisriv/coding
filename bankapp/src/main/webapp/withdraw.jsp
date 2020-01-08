<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Withdraw Page</h1>

<form action="/accounts/withdraw" method="post">
		<table border=2>
			<tr>
				<th>Enter From Account<input style="align: left;" type="text" name="accountNo"
					required autofocus /></th>
			</tr>
			<br>
			<tr>
				<th>Transaction Type<input type="text" name="type" value="Withdraw" readonly/></th>
			</tr>
			<tr>
			<th>Enter Amount<input type="text" name="amount" /></th>
			</tr>
			<tr>
			<th><input type="submit" name="Withdraw" /></th>
			</tr>
        </table>
        </form>
        
</body>
</html>