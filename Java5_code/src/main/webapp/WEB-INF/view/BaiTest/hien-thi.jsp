<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <style>
        .error-message{
              color: red;
        }
    </style>
</head>
<body>
<%--neu dung dau * thì nó sẽ show full lỗi như dùng foreach --%>
<%--+ dùng thể form:errors để show lỗi , cssClass ơr đây để chỉ định lớp đuọc csss--%>
<%--+ muốn dùng đuọc modelAttribute thì phải tạo 1 modelAtriibute rồi add 1 đới tượng cần validate vào (bắt buộc)--%>
<%--+Lưu ý : đối tượng không đuọc truyền tham số --%>
<%--+ sử dụng @ModelAddtribute ở phần muốn show lỗi--%>

<form:form action="/huydqph27425/lab12/them" method="post" modelAttribute="chuyenNghanh">
    <label>MA</label> : <form:input path="ma" type="text"/>
    <form:errors path="ma" cssClass="error-message" />
    <label>Ten</label> : <form:input path="ten" type="text"/>
    <form:errors path="ten" cssClass="error-message" />
    <label>He dao tao</label> : <form:input path="heDaoTao" type="text"/>
    <form:errors path="heDaoTao" cssClass="error-message" />
    <label>So ki</label> : <form:input path="soKi" type="text"/>
    <form:errors path="soKi" cssClass="error-message" />
    <label>Danh sach mon</label>
    <form:select path="danhSachMon">
        <form:option value="c++">C++</form:option>
        <form:option value="Java">Java</form:option>
    </form:select>
    <button type="submit">Them</button>
</form:form>




<table>
    <thead>
    <td>Ma</td>
    <td>Ten</td>
    <td>He dao tao</td>
    <td>so ki</td>
    <td>danh sach mon</td>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="cn">
        <tr>
            <td>${cn.ma}</td>
            <td>${cn.ten}</td>
            <td>${cn.heDaoTao}</td>
            <td>${cn.soKi}</td>
            <td>${cn.danhSachMon}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
