<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 3/17/2023
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<form action="/khach-hang/add" method="post">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Id</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="id"><br>
        </div>
    </div>

    <div class="form-group row">
        <label class="col-sm-2 col-form-label">name</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="name"><br>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">address</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="address"><br>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">status</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="status"><br>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Gender</label>
        <div class="col-sm-10">
            <input class="form-control" type="text" name="gioitinh"><br>
        </div>
    </div>
    <button type="submit">Them khach hang</button>
</form>
<h2 style="margin-top: 20px">Danh sach san pham</h2>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">price</th>
        <th scope="col">url</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listProducts}" var="l">
        <tr>
            <th scope="row">${l.id}</th>
            <td>${l.productName}</td>
            <td>${l.price}</td>
            <td>${l.url}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>

</html>
