<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>Products in Cart</h1>
<a href="/b4/san-pham">Back to List</a>
<table border="1">
    <tr>
        <th>Product Id</th>
        <th>Quantity</th>
    </tr>
    <c:forEach items="${sanPhamTrongGio}" var="sanPham">
        <tr>
            <td> ${sanPham.key} </td>
            <td> ${sanPham.value} </td>
        </tr>
    </c:forEach>
</table>