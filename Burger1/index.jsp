<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Create Student Form</title>
</head>
<body>
    
    <form:form action="/createStudent" method="POST" modelAttribute="student">
    	<label> Firstname</label>
    	<form:input type="text" path="firstName" />
    	<form:errors  path="firstName"  />
    	<label> Lastname </label>
    	<form:input type="text" path="lastName" />
    	<form:errors  path="LastName"  />
    	<label> Address</label>
    	<form:input type = "text" path="address" />
    	<form:errors  path="address"  />
    	<label>PhoneNumber</label>
    	<form:input type="text" path="phoneNumber" />
    	<form:errors  path="phoneNumber"  />
    	<input type="submit" value="Submit" />
    </form:form>
    
    <a href="/updatestudent/3"> Update Enzo Profile</a>
    
    
       <a href="/deletestudent/3"> Delete Enzo Profile</a>
    
</body>
</html>