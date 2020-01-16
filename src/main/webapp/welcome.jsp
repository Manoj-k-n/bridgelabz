<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="welcome.css" />
</head>
<body>
<%

response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);

if(session.getAttribute("name")==null)
{
	response.sendRedirect("index.jsp");
}

%>


<form class="box" action="Logout">
<h1> Welcome </h1>
<input type="submit" value="logout" class="logout"><br>
<br>
<a href="alter.jsp" class="alter">Alter</a><br>
<br>
<a href="deletacc.jsp" class="delet">DeletAccount</a><br>

</form>
</body>
</html>