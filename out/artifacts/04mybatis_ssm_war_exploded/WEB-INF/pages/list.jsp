<%--
  Created by IntelliJ IDEA.
  User: luzhyu
  Date: 2021/2/23
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>lastName</td>
        <td>gender</td>
        <td>email</td>
    </tr>
    <c:forEach items="${allEmps}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.gender}</td>
            <td>${emp.email}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
