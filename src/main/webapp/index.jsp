<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="login.css" />
</head>

<body >
  <form class="box" action="Login" method="post">
  <h1>LOGIN REGISTER </h1>
 <input  type="text" class="user" placeholder="Username" name="uname">
  <input type="password" class="pass" placeholder="Password" name="pass">
  <input type="submit" value="login" class="log">
 
  <a href="Rejester.jsp" class="reg"> Register</a>
  </form>
 
 

</body>
</html>