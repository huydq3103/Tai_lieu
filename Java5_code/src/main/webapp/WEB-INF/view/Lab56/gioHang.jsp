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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<form:form modelAttribute="DieuHoa" action="/huydqph27425/lab56/add" method="post">
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
                <td>${sp.maDieuHoa}</td>
                <td>${sp.tenDieuHoa}</td>
                <td>${sp.loaiDieuHoa}</td>
                <td>${sp.congXuat}
                <td>

                <td>${sp.luuluongGio}</td>
                <td><a href="/huydqph27425/lab56/xoa/${sp.maDieuHoa}">Xoa</a></td>
                <td><a href="/huydqph27425/lab56/edit/${sp.maDieuHoa}">Edit</a></td>
            </tr>
        </c:forEach>


        </tbody>

    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination justify-content-center">
            <c:if test="${toTal > 0}">
                <li class="page-item active">
                    <a class="page-link" href="/huydqph27425/lab56?pageNo=0">First</a>
                </li>
                <c:forEach begin="1" end="${toTal}" var="l">
                    <li class="page-item">
                        <a class="page-link" href="/huydqph27425/lab56?pageNo=${l}">${l}</a>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
    </nav>

</body>
</html>
