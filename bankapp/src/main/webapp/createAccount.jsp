<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account Form</title>
</head>
<body>
<h1>Welcome to Create Account Page</h1>

<form:form method="POST"
          action="/accounts/createAccount" modelAttribute="account">
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="amount">Amount</form:label></td>
                    <td><form:input path="amount"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Create New Account"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>