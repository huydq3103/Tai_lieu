<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Products</h1>
<table border="1">
    <tr>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Quantity</th>
        <th>Current Price</th>
    </tr>
    <c:forEach items="${danhSachSanPham}" var="sanPham">
        <tr>
            <td> ${sanPham.productId} </td>
            <td> ${sanPham.productName} </td>
            <td> ${sanPham.quantity} </td>
            <td> ${sanPham.price} </td>
        </tr>
    </c:forEach>
</table>