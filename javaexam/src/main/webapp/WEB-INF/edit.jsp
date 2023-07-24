<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>edit new your celebrity</h2>
<form:form action="/editee/${Celebrity.id}" mode="post" modelAttribute="Celebrity">
 <input type="hidden" name="_method" value="put">
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
		
	<td><a href="/delet/${Celebrity.id}">delete</a></td>
</form:form>




</body>
</html>