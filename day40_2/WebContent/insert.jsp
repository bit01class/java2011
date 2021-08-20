<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="kr.co.tjoeun.bbs39.BbsUpdate"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String sub=request.getParameter("sub");
String id=request.getParameter("id");
String content=request.getParameter("content");
BbsUpdate bbsUpdate =new BbsUpdate();
bbsUpdate.insert(sub,id,content);

response.sendRedirect("index.jsp");
%>
</body>
</html>