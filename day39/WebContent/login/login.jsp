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
	String empno=request.getParameter("empno");
	String ename=request.getParameter("ename");
	String sql="select ename from emp where ename='"+ename+"' and empno="+empno;
	out.println(sql);
	
%>
</body>
</html>








