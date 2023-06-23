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
<form:form method="post" action="/buoi5/db/add" modelAttribute="product">
     Id : <form:input path="productId"/>
      Ten : <form:input path="productName"/>
    Gia: <form:input path="price"/>
    So luong : <form:input path="quantity"/>
      <button type="submit">Them</button>
</form:form>

<form method="post" action="/buoi5/db/tim">

    Ten : <input name="name"/>

    <button type="submit">Tim kiem</button>
</form>

<p> Table Sinh Vien</p>
<table>
    <thead>
    <th>ID</th>
    <th>Ten</th>
    <th>Gia</th>
    <th>So luong</th>
    </thead>
    <tbody>

    <c:forEach items="${list}" var="gv">
        <tr>
            <td>${gv.OrderId}</td>
            <td>${gv.CreatedDate}</td>
            <td>${gv.CustomerNumber}</td>
        </tr>

    </c:forEach>

    </tbody>
</table>
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <li class="page-item disabled">
            <a class="page-link" href="/buoi5/db/hien-thi">Previous</a>
        </li>
<%--        <c:forEach items="${list}" var="l">--%>
<%--            <li class="page-item"><a class="page-link" href="/buoi5/db/page?pageNo=${l.number}">${l.number}</a></li>--%>
<%--        </c:forEach>--%>


        <li class="page-item">
            <a class="page-link" href="/buoi5/db/page?pageNo=${toTalPages}">Last</a>
        </li>
    </ul>
</nav>
<script>
    function changeAction(newAction) {
        document.getElementById("my-form").action = newAction;
    }
</script>
</body>
</html>
