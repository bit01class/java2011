<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>request 내장객체1</h1>
	<%
	String servProtocal=request.getProtocol();
	String servName=request.getServerName();
	int servPort=request.getServerPort();
	System.out.println(servProtocal);
	System.out.println(servName);
	System.out.println(servPort);
	System.out.println("--------------------");
	String clientAddr=request.getRemoteAddr();
	String clientName=request.getRemoteHost();
	int clientPort=request.getRemotePort();
	System.out.println(clientAddr);
	System.out.println(clientName);
	System.out.println(clientPort);
	%>
</body>
</html>










