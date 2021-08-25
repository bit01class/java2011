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
<%
int num=Integer.parseInt(request.getParameter("num"));
String sub="",content="";
java.sql.Date nalja=null;
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	Class.forName("oracle.jdbc.OracleDriver");
	conn=DriverManager.getConnection(
			"jdbc:oracle:thin:@192.168.99.100:11521:xe","system","oracle"
			);
	stmt=conn.createStatement();
	rs=stmt.executeQuery("select * from bbs01 where num="+num);
	if(rs.next()){
		nalja=rs.getDate("nalja");
		sub=rs.getString("sub");
		content=rs.getString("content");
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
<h1>상세 페이지</h1>
<table>
	<tr>
		<td>글번호</td>
		<td><%=num %></td>
		<td>날짜</td>
		<td><%=nalja %></td>
	</tr>
	<tr>
		<td>제목</td>
		<td colspan="3"><%=sub %></td>
	</tr>
	<tr>
		<td colspan="4"><%=content %></td>
	</tr>
	<tr>
		<td colspan="4">
			<a href="#">[수 정]</a>
			<a href="#">[삭 제]</a>
		</td>
	</tr>
</table>
</body>
</html>