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
<title>Insert title here</title>
</head>
<body>
<form:form action="/ninjasadd" mode="post" modelAttribute="ninjas">
	<div>
		<form:label path="firstName">firstName:</form:label><br>
		<form:errors path="firstName" class="text-danger"/>
		<form:input path="firstName" style="width:250px;"/>
		
		<form:label path="lastName">  lastName:</form:label><br>
		<form:errors path="lastName" class="text-danger"/>
		<form:input path="lastName" style="width:250px;"/>
		
		
		<form:label path="age"> age:</form:label><br>
		<form:errors path="age" class="text-danger"/>
		<form:input path="age" style="width:250px;"/>
		
		  <form:label path="dojo">Dojo</form:label> 
         <form:select path="dojo"> 
                 <form:option value="0" label="Select a Dojo"/> 
                 <form:options items="${dojos}" itemValue="id" itemLabel="name"/> 
         </form:select>
		
	</div>
	
		<input type="submit" value="Creat"/>
	
</form:form>

</body>
</html>