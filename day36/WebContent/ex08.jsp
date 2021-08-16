<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>response 내장객체</h1>
	<%
	//java.io.OutputStream os=response.getOutputStream();
	response.addHeader("Content-Type", "text/plain;");
	//os.close();
	%>
</body>
</html>