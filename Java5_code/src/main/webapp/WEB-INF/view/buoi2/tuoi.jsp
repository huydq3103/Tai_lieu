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
<p>Tinh tuoi</p>
<form action="/sinh-vien/tinh-tuoi" method="post">
    Nhap nam sinh : <input name="namsinh"/>
    <button type="submit" value="submit">Tinh tuoi</button>
</form>
</body>
</html>
