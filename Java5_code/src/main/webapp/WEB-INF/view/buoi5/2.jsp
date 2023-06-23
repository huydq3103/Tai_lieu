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
<%--<form:form method="post" action="/buoi5/db/add" modelAttribute="product">--%>
<%--     Id : <form:input path="productId"/>--%>
<%--      Ten : <form:input path="productName"/>--%>
<%--    Gia: <form:input path="price"/>--%>
<%--    So luong : <form:input path="quantity"/>--%>
<%--      <button type="submit">Them</button>--%>
<%--</form:form>--%>


<p> Table Sinh Vien</p>
<table>
    <thead>

    <th>Ten</th>
    <th>Gia</th>

    </thead>
    <tbody>
    <c:forEach items="${productNameAndPriceList}" var="gv">
        <tr>
            <td>${gv.getProductName()}</td>
            <td>${gv.getPrice()}</td>
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
