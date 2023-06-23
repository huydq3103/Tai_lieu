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
<p>Tinh tuoi</p>
<form:form modelAttribute="sinhVien" id="my-form" action="" method="post">
    ID :<input type="text" name="id" value="${sv.id}">
    Ten :<input type="text" name="tenSinhVien" value="${sv.tenSinhVien}">
    Tuoi : <input type="text" name="tuoi" value="${sv.tuoi}">
    GioiTinh : Nam <input type="radio" name="gioiTinh" value="1" ${sv.gioiTinh ==1 ? 'Checked':''} >
    <input type="radio" name="gioiTinh" value="0"   ${sv.gioiTinh ==0 ? 'Checked':''}>NU
    <form:checkboxes path="hobby" items="${bobby}" delimiter=""/>


    <button type="submit" onclick="changeAction('/test/sinh-vien/them')">Them</button>
    <button type="submit" onclick="changeAction('/test/sinh-vien/update')">update</button>
</form:form>

<p> Table Sinh Vien</p>
<table>
    <thead>
    <th>ID</th>
    <th>Ten</th>
    <th>Tuoi</th>
    <th>GioiTinh</th>
    <th>si thich</th>
    <th>Hanh Dong</th>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sv">
        <tr>
            <td>${sv.id}</td>
            <td>${sv.tenSinhVien}</td>
            <td>${sv.tuoi}</td>
            <td>${sv.gioiTinh}</td>
            <td>
                <c:forEach var="hobby" items="${sv.hobby}" varStatus="loopStatus">
                    <c:out value="${hobby}"/>
                <c:if test="${!loopStatus.last}">, </c:if>
                </c:forEach>


            <td>
                <a href="/test/sinh-vien/xoa/${sv.id}">Xoa</a>
            </td>
            <td>
                <a href="/test/sinh-vien/details/${sv.id}">Details</a>
            </td>


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
