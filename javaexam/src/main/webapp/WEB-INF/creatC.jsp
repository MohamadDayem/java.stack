
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celebrity</title>
</head>
<body>

<form:form action="/addCelebrity" mode="post" modelAttribute="Celebrity">
	<div>
		<form:label path="name">name:</form:label><br>
		<form:errors path="name" class="text-danger"/>
		<form:input path="name" style="width:250px;"/>
	</div>
	<div>
		<form:label path="userdescription">userdescription:</form:label><br>
		<form:errors path="userdescription" class="text-danger"/>
		<form:input path="userdescription" style="width:250px;"/>
	</div>
	
		<input type="submit" value="Submit"/>
	
</form:form>

</body>
</html>