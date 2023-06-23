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
<form:form modelAttribute="dh" action="/huydqph27425/lab56/update" method="post">
Ma : <form:input path="maDieuHoa"/>
Ten : <form:input path="tenDieuHoa"/>
<div class="form-group row">
    <label class="col-sm-3 col-form-label"> Loai dieu hoa :</label>
    <div class="col-sm-9">
        <div class="form-check form-check-inline">
            <form:radiobutton class="form-check-input" name="loaiDieuHoa" id="YES" value="YES"
                              path="loaiDieuHoa"/>
            <label class="form-check-label" for="YES">YES</label>
        </div>
        <div class="form-check form-check-inline">
            <form:radiobutton class="form-check-input" name="loaiDieuHoa" id="NO" value="NO"
                              path="loaiDieuHoa"/>
            <label class="form-check-label" for="NO">NO</label>
        </div>
    </div>
    <div class="form-group row">
        <label for="congXuat" class="col-sm-3 col-form-label">congXuat :</label>
        <div class="col-sm-9">
            <form:input type="text" class="form-control" id="congXuat" name="congXuat" path="congXuat"/>
        </div>
    </div>
    <div class="form-group row">
        <label for="congXuat" class="col-sm-3 col-form-label">luuluongGio :</label>
        <div class="col-sm-9">
            <form:input type="text" class="form-control" id="luuluongGio" name="luuluongGio" path="luuluongGio"/>
        </div>
    </div>

    <button type="submit">update</button>
    </form:form>

</body>
</html>
