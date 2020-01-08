<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete An Existing Account</title>
</head>
<body>
<h1>Delete An Existing Account Page</h1>
<form:form method="DELETE"
          action="/accounts/deleteAccount" modelAttribute="account">
             <table>
                <tr>
                    <td><form:label path="no">Enter Account No</form:label></td>
                    <td><form:input path="no"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Delete Account"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>