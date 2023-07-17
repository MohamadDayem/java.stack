<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Dojo Locations</h1>
    <c:forEach var="fruit" items="${fruits}">
        <p><c:out value="${fruit.name}"></c:out></p>
        <p><c:out value="${fruit.name}"></c:out></p>
    </c:forEach>

</body>
</html>