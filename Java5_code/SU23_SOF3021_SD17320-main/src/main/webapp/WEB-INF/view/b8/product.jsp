<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Products</h1>
<form>
    Enter something: <input name="tenSanPham" value="${param.tenSanPham}"/>
    <input type="submit" value="Search"/>
</form>
<c:if test="${page.isEmpty()}">
    <h2>Not found any record!!</h2>
</c:if>
<c:if test="${not page.isEmpty()}">
    <p>Found ${page.getTotalElements()} records</p>
    <table border="1">
        <tr>
            <th>Product Id</th>
            <th>Product Name</th>
        </tr>
        <c:forEach items="${page.getContent()}" var="sanPham">
            <tr>
                <td> ${sanPham.maSanPham} </td>
                <td> ${sanPham.tenSanPham} </td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <c:if test="${page.getNumber() + 1 > 1}">
            <a href="?page=${page.getNumber()}&tenSanPham=${param.tenSanPham}">
                Previous
            </a>
        </c:if>
        <span> ${page.getNumber() + 1} / ${page.getTotalPages()} </span>
        <c:if test="${page.getNumber() + 1 lt page.getTotalPages()}">
            <a href="?page=${page.getNumber() + 2}&tenSanPham=${param.tenSanPham}">
                Next
            </a>
        </c:if>
    </div>
</c:if>