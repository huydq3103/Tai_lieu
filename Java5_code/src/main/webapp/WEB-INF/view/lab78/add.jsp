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
<form:form modelAttribute="sv" action="/huydqph27425/lab78/update" method="post">
Ma : <form:input path="ma"/>
Ten : <form:input path="ten"/>
<div class="form-group row">


    <div class="form-group row">
        <label for="congXuat" class="col-sm-3 col-form-label">tinChi :</label>
        <div class="col-sm-9">
            <form:input type="text" class="form-control" id="congXuat" name="tinChi" path="tinChi"/>
        </div>
    </div>
    <div class="form-group row">
        <label for="congXuat" class="col-sm-3 col-form-label">diem :</label>
        <div class="col-sm-9">
            <form:input type="text" class="form-control" id="luuluongGio" name="luuluongGio" path="diem"/>
        </div>
    </div>
    <div class="form-group row">
        <label for="congXuat" class="col-sm-3 col-form-label">chuyenNganh :</label>
        <div class="col-sm-9">
            <form:input type="text" class="form-control" id="luuluongGio" name="luuluongGio" path="chuyenNganh"/>
        </div>
    </div>
    <button type="submit">THEM</button>
    </form:form>

</body>
</html>
