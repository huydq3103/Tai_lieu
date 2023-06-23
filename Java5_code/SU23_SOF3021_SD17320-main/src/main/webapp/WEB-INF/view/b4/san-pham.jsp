<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Products</h1>
<table border="1">
    <tr>
        <th>Product Name</th>
        <th>Quantity</th>
        <th>Current Price</th>
        <th>Actions</th>
    </tr>
        <c:forEach items="${danhSachSanPham}" var="sanPham">
            <tr>
                <td> ${sanPham.tenSanPham} </td>
                <td> ${sanPham.soLuongTon} </td>
                <td> ${sanPham.giaHienTai} </td>
                <td>
                    <a href="/b4/cart/add/${sanPham.sanPhamId}">Add to cart</a>
                </td>
            </tr>
        </c:forEach>
</table>