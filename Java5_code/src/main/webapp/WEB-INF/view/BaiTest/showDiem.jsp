<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<p>Diem tong ket :${diemTongket}</p>
<c:if test="${diemTongket < 5 || diemfinal < 5}">
    <p>Chua qua mon </p>
</c:if>
<c:if test="${diemTongket >= 5 && diemfinal >= 5}">
    <p> qua mon </p>
</c:if>

</body>
</html>
