<%--
  Created by IntelliJ IDEA.
  User: КОМП
  Date: 18.10.2021
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Employee</h1>
<form action="SaveServlet" method="post">
    <table>
        <tr><td>Id:</td><td><input type="text" name="id"/></td></tr>
        <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
        <tr><td>Price:</td><td><input type="text" name="price"/></td></tr>
        <tr><td>Publisher id:</td><td><input type="text" name="publisher id"/></td></tr>
        <tr><td>Country:</td><td>

        <tr><td colspan="2"><input type="submit" value="Save Employee"/></td></tr>
    </table>
</form>

<br/>
<a href="ViewServlet">view employees</a>

</body>
</html>