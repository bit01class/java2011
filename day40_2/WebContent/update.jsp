<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String sub=request.getParameter("sub");
String content=request.getParameter("content");
int num=Integer.parseInt(request.getParameter("num"));
kr.co.tjoeun.bbs39.BbsUpdate update=new kr.co.tjoeun.bbs39.BbsUpdate();
update.updateOne(sub, content, num);

response.sendRedirect("detail.jsp?num="+num);
%>
</body>
</html>