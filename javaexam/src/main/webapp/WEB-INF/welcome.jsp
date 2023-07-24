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
<h1>Welcome ${thisuser.userName}</h1>
<p>Best thing ever :)</p>
<a href="/logout">Logout</a>
<br>

<a href="/new">Add Celebrity Page</a>

<p><c:out value="${Count}" /></p>

<table>

<c:forEach var="Celebrityy" items="${Celebrity}">
			<tr>
			
				<td><c:out value="${Celebrityy.name}"/></td>
				<td><c:out value="${Celebrityy.userdescription}"/></td>
				<td><a href="/edit/${Celebrityy.id}">edit</a></td>
				
				 <input type="hidden" name="_method" value="delete">
				 
			<br>
			<td><a href="/show/${Celebrityy.id}">detail</a></td>
   	</tr>
   	</c:forEach>

</table>
</body>
</html>