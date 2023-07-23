<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New dojo</title>
</head>
<body>
<h2>Add new dojo</h2>
<form:form action="/adddojos" mode="post" modelAttribute="dojos">
	<div>
		<form:label path="name"> Name:</form:label><br>
		<form:errors path="name" class="text-danger"/>
		<form:input path="name" style="width:250px;"/>
	</div>
	
		<input type="submit" value="Creat"/>
	
</form:form>

</body>
</html>