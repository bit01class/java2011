<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>config 내장객체</h1>
	<%
	String name=config.getServletName();
	ServletContext context=config.getServletContext();
	System.out.println(context.getContextPath());
	System.out.println(name);
	%>
	<a href="ex10.jsp">me</a><br>
	<a href="./ex10.jsp">me2</a><br>
	<a href="/day36/ex10.jsp">me3-1</a><br>
	<a href="http://localhost:8080/day36/ex10.jsp">me3-2</a>
</body>
</html>











