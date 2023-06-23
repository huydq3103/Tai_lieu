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
<form:form modelAttribute="Loa" action="" method="post" id="my-form">
    Ma Loa : <form:input path="maLoa"/>
    Ten Loa : <form:input path="tenLoa"/>
    Cong Xuat: <form:input path="congXuat"/>
    Kenh Am Thanh: <form:input path="kenhAmThanh"/>
    Mau sac : <form:radiobuttons path="mauSac" items="${mausac}"/>

    <button type="submit" onclick="changeAction('/huydqph27425/lab34/add')">Them</button>
    <button type="submit" onclick="changeAction('/huydqph27425/lab34/update')">update</button>
</form:form>


<p> Table Sinh Vien</p>
<table>
    <thead>
    <th>Ma</th>
    <th>Ten</th>
    <th>Cong xuat</th>
    <th>Mau sac</th>
    <th>Kenh am thanh</th>
    <th>Chuc nang</th>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="sp">
        <tr>
            <td>${sp.maLoa}</td>
            <td>${sp.tenLoa}</td>
            <td>${sp.congXuat}</td>
            <td>${sp.mauSac}</td>
            <td>${sp.kenhAmThanh}</td>
            <td><a href="/huydqph27425/lab34/xoa/${sp.maLoa}">Xoa</a></td>
            <td><a href="/huydqph27425/lab34/details/${sp.maLoa}">Edit</a></td>
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
