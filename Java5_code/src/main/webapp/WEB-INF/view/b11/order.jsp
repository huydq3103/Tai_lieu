<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Orders</h1>
<form action="/b11/order/gia" method="get">
    Min : <input type="text" name="min">
    Max : <input type="text" name="max">
 <button type="submit">Ok</button>
</form>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Created Date</th>
        <th>Customer Number</th>
    </tr>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td> ${order.orderId} </td>
            <td> ${order.createdDate} </td>
            <td> ${order.customerNumber} </td>
        </tr>
    </c:forEach>
</table>