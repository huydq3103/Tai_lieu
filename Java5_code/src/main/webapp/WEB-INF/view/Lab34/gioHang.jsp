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
<form:form modelAttribute="Monhoc" action="/lab34/k/add" method="post">
    Ma Mon : <form:input path="maMon"/>
    Ten Mon : <form:input path="tenMon"/>
    So Tin Chi: <form:input path="soTinChi"/>
    Chuyen nganh :<form:select path="cn.id">
    <form:options items="${ChuyenNghanh}" itemLabel="tenCN" itemValue="tenCN"/>
</form:select>
    Giang Vien : <form:checkboxes path="giangVien" items="${giangVien}"/>
    Bat Buoc : <form:radiobuttons path="batBuoc" items="${batBuoc}"/>
         <button type="submit">THEM</button>
</form:form>


<p> Table Sinh Vien</p>
<table>
    <thead>
    <th>Ma</th>
    <th>Ten</th>
    <th>Tin chi</th>
    <th>Chuyen nganh</th>
    <th>Giang Vien</th>
    <th>Bat buoc</th>

    </thead>
    <tbody>
    <c:forEach items="${list}" var="sp">
        <tr>
            <td>${sp.maMon}</td>
            <td>${sp.tenMon}</td>
            <td>${sp.soTinChi}</td>
            <td>
                    ${sp.cn.tenCN}
            <td>
            <td>
                <c:forEach var="cn" items="${sp.giangVien}" varStatus="loopStatus">
                    <c:out value="${cn}"/>
                <c:if test="${!loopStatus.last}">, </c:if>
                </c:forEach>
            <td>
            <td>${sp.batBuoc}</td>
            <td><a href="/lab34/k/xoa/${sp.maMon}">Xoa</a></td>
            <td><a href="/lab34/k/details/${sp.maMon}">Edit</a></td>
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
