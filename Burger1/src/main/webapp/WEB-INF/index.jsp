
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
<title>Burger Tracker</title>
</head>
<body style="margin:10vw;">
<h1>Burger Tracker</h1>
<table class="table table-striped table-bordered">
	<thead>
		<tr>
			<th>Burger Name</th>
			<th>Restaurant Name</th>
			<th>Rating (out of 5)</th>
			<th>edit</th>
		</tr>
	</thead>
	<tbody>
	  	<c:forEach var="burger" items="${burgers}">
			<tr>
			
				<td><c:out value="${burger.name}"/></td>
				<td><c:out value="${burger.restaurant}"/></td>
				<td><c:out value="${burger.rating}"/></td>
				<td><a href="/edit/${burger.id}">edit</a></td>
				<td><a href="/burger/${burger.id}">detail</a></td>
				<td><a href="/burgerr/${burger.id}">delete</a></td>
				  <input type="hidden" name="_method" value="delete">
   
			</tr>
		</c:forEach>
		
	</tbody>
</table>
<br>
<h2>Add new burger</h2>
<form:form action="/addBurger" mode="post" modelAttribute="burger">
	<div>
		<form:label path="name">Burger Name:</form:label><br>
		<form:errors path="name" class="text-danger"/>
		<form:input path="name" style="width:250px;"/>
	</div>
	<div>
		<form:label path="restaurant">Restaurant Name:</form:label><br>
		<form:errors path="restaurant" class="text-danger"/>
		<form:input path="restaurant" style="width:250px;"/>
	</div>
	<div>
		<form:label path="rating">Rating:</form:label><br>
		<form:errors path="rating" class="text-danger"/>
		<form:input path="rating" style="width:250px;"/>
	</div>
	<div>
		<form:label path="notes">Notes:</form:label><br>
		<form:errors path="notes" class="text-danger"/>
		<form:textarea path="notes" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</body>
</html>