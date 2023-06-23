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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>


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
                <td>${sp.ma}</td>
                <td>${sp.ten}</td>
                <td>${sp.tinChi}</td>
                <td>${sp.diem}
                <td>

                <td>${sp.chuyenNganh}</td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

    <nav aria-label="...">
        <ul class="pagination">
            <c:forEach begin="1" end="${toTal}" var="l">
                <li class="page-item">
                    <a class="page-link" href="/huydqph27425/lab78?pageNo=${l}">${l}</a>
                </li>
            </c:forEach>
            
        </ul>
    </nav>
</body>
</html>
