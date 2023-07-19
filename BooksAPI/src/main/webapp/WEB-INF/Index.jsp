<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tacos</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<!-- Table -->
	<table>
		<tr>
			<th>title</th>
			<th>description</th>
			<th>language</th>
			
		</tr>
		<c:forEach var="book" items="${allBooks}">
			<tr>
				<th><c:out value="${book.title}"></c:out></th>
				<th><c:out value="${book.description}"></c:out></th>
				<th><c:out value="${book.language}"></c:out></th>
				
			</tr>
		</c:forEach>
	</table>

	<!-- END Table -->
	<!-- Form -->
	<form action="/create" method="post">
		<div class="form-group">
			<label>description</label> <input name="description" type="text"
				class="form-control" /> <br>
		</div>
		<div class="form-group">
			<label>title</label> <input name="title" type="text"
				class="form-control" /> <br>
		</div>
		<div class="form-group">
			<label>language</label> <input name="language" type="text"
				class="form-control" /> <br>
		</div>
		<div class="form-group">
			<label>pages</label> <input name="pages" type="text"
				class="form-control" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	<!-- END Form -->
</body>
</html>

