<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${listSinhVien}" var="sinhVien">
    <p> ${sinhVien} </p>
</c:forEach>