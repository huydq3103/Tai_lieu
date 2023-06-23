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
    <style>
        .error-message{
            color: red;
        }
    </style>
</head>
<body>
<form:form method="post" action="/buoi5/db/add" modelAttribute="mu">
    Ma : <form:input path="ma"/>
    <form:errors path="ma" cssClass="error-message" />
    Ten : <form:input path="ten"/>
    <form:errors path="ten" cssClass="error-message" />
    So luong : <form:input path="soLuong"/>
    <form:errors path="soLuong" cssClass="error-message" />
    Gia: <form:input path="donGia"/>
    <form:errors path="donGia" cssClass="error-message" />
    Xuat su  <form:select path="Xuatsu.noiXuatSu">
    <form:errors path="Xuatsu" cssClass="error-message" />
    <form:options items="Xuatsu"></form:options>
</form:select>
 chat lieu : <form:radiobuttons path="chatLieu"/>

    <button type="submit">Them</button>
</form:form>



<p> Table Sinh Vien</p>
<table>
    <thead>
    <th>Ma</th>
    <th>Ten</th>
    <th>So luong</th>
    <th>Gia</th>
    <th>Xuat su</th>
    <th>Chat lieu</th>
    </thead>
    <tbody>

    <c:forEach items="${muList}" var="gv">
        <tr>
            <td>${gv.ma}</td>
            <td>${gv.ten}</td>
            <td>${gv.soLuong}</td>
            <td>${gv.donGia}</td>
            <td>${gv.xuatSu}</td>
            <td>${gv.chatLieu}</td>

            <td><a href="/huydqph27425/Ass/xoa/${gv.productId}">Xoa</a></td>
<%--            <td><a href="/buoi5/db/xem/${gv.productId}">Xem</a></td>--%>

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
