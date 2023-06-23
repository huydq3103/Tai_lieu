<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Orders</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Created Date</th>
    </tr>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td> ${order.orderId} </td>
            <td> ${order.createdDate} </td>
        </tr>
    </c:forEach>
</table>