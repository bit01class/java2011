<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="1;url=list.jsp">
<title>Insert title here</title>
</head>
<body>
<%
String sql="delete from bbs37 where num="+request.getParameter("num");
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

new oracle.jdbc.driver.OracleDriver();

Connection conn=null;
Statement stmt=null;
try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	stmt.executeUpdate(sql);
	out.print("<h2>삭제성공</h2>");
}catch(SQLException e){
	e.printStackTrace();
}finally{
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
</body>
</html>












