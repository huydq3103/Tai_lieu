<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 05/10/2023
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>




<p> Table Sinh Vien</p>
<table>
    <thead>
    <th>ID</th>
    <th>Ten</th>
    <th>Gia</th>
    <th>So luong</th>
    </thead>
    <tbody>

    <c:forEach items="${listFound}" var="gv">
        <tr>
            <td>${gv.productId}</td>
            <td>${gv.productName}</td>
            <td>${gv.price}</td>
            <td>${gv.quantity}</td>


        </tr>
    </c:forEach>

    </tbody>
</table>
<script>
    function changeAction(newAction) {
        document.getElementById("my-form").action = newAction;
    }
</script>
</body>
</html>
