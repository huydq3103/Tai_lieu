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
    <th>So luong</th>
    <th>Tổng tiền</th>
    <th>Action</th>
    </thead>
    <tbody>
    <c:forEach items="${spTrongGio}" var="sp">
        <tr>
            <td>${sp.key}</td>
            <td>${sp.value}</td>

            <td><a href="/b4/cart/xoa/${sp.key}">Xoa</a></td>
        </tr>
    </c:forEach>

<tr>
<td>${total}</td>
</tr>

    </tbody>

</table>
<script>
    function changeAction(newAction) {
        document.getElementById("my-form").action = newAction;
    }
</script>
</body>
</html>
