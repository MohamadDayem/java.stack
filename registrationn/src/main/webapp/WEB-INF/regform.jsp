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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  style="display: flex; justify-content: space-around "  >
    <div style="width:500px; height:500px; padding: 15px  "  >
        <h1>Rgistration!</h1>
     <form:form action="/register" method="post" modelAttribute="newUser">
       
        <div class="form-group">
            <form:label path="userName" >Name</form:label>
            <form:errors path="userName" class="text-danger" />
            <form:input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" path="userName"></form:input>
        </div>

        <div class="form-group">
          <form:label path="email" >Email address</form:label>
          <form:errors path="email" class="text-danger" />
          <form:input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" path="email"></form:input>
        </div>
        <div class="form-group">
          <form:label path="password">Password</form:label>
           <form:errors path="password" class="text-danger" />
          <form:input type="password" class="form-control" id="exampleInputPassword1" path="password"></form:input>
        </div>

        <div class="form-group">
            <form:label path="confirm">Confirm PW</form:label>
             <form:errors path="confirm" class="text-danger" />
            <form:input type="password" class="form-control" id="exampleInputPassword1" path="confirm"></form:input>
          </div>

        
        <button type="submit" class="btn btn-primary">Register</button>
      </form:form>
    </div>


<div style="width:500px; height:500px; padding: 15px; margin-top: 10px "   >
  <h1>Login!</h1>
  <form:form action="/login" method="post" modelAttribute="newLogin">
   
    <div class="form-group">
      <form:label  path="email">Email address</form:label>
       <form:errors  path="email" class="text-danger" />
      <form:input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" path="email" ></form:input>
    </div>
    <div class="form-group">
      <form:label path="password">Password</form:label>
       <form:errors path="password" class="text-danger" />
      <form:input type="password" class="form-control" id="exampleInputPassword1" path="password"></form:input>
    </div>

    <button type="submit" class="btn btn-primary">Login!</button>


  </form:form>
</div>

</div>







</body>
</html>