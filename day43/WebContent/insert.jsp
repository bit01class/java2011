<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%!
Connection conn;
Statement stmt;
%>
<%
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn=DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.99.100:11521:xe","system","oracle");
		stmt=conn.createStatement();
		stmt.executeUpdate("insert into bbs01 values (bbs01_seq.nextval,'"
							+sub+"','"+content+"',sysdate)");
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("./?jsp=list");
%>
</body>
</html>










