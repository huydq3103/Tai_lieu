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
<p>${BMI}</p>
<c:if test="${BMI<16}">Gay cap do 3</c:if>
<c:if test="${BMI<17}">Gay cap do 2</c:if>
<c:if test="${BMI<18.5}">Gay cap do 1</c:if>
<c:if test="${BMI<25}">Binh thuong</c:if>
<c:if test="${BMI<30}">Thừa cân</c:if>
<c:if test="${BMI<35}">Béo phì độ 1</c:if>
<c:if test="${BMI<40}">Béo phì độ 2</c:if>
<c:if test="${BMI>40}">Béo phì độ 3</c:if>
</body>
</html>
