<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Registration.css" />

</head>
<body>
<form action="Reg" method="post" >
<div class="box some">
<h1> Registration</h1>
<input type="text" name="uname" placeholder="Name" id="username">
<input type="text" name="lname" placeholder="LastName" class="lname">
<input type="password" name="password" placeholder="Password" class="pass">
<input type="text" name="email" placeholder="Email" class="enamil">
<input type="text" name="mobile" placeholder="Mobile No" class="mobile">

<input type="submit" value="submit" class="reg">
</div>
</form>
</body>
</html>