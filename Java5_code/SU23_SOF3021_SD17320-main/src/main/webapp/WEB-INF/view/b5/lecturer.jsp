<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1>List of Lecturer</h1>
<table border="1">
    <tr>
        <th>Lecturer</th>
        <th>Age</th>
    </tr>
        <c:forEach items="${dsGiangVien}" var="giangVien">
            <tr>
                <td> ${giangVien.maGiangVien} </td>
                <td> ${2023 - giangVien.namSinh} </td>
            </tr>
        </c:forEach>
</table>