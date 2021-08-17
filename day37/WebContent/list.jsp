<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@ page import="oracle.jdbc.driver.OracleDriver" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0" align="center" width="800">
	<tr>
		<td colspan="5"><img src="imgs/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor="gray" width="100"></td>
		<td bgcolor="gray" align="center"><a href="index.jsp">[HOME]</a></td>
		<td bgcolor="gray" align="center"><a href="intro.jsp">[INTRO]</a></td>
		<td bgcolor="gray" align="center"><a href="list.jsp">[B B S]</a></td>
		<td bgcolor="gray" width="100"></td>
	</tr>
	<tr>
		<td colspan="5" height="400" valign="top">
		<%
		String sql="select num,subject,name,nalja from bbs37 order by num desc";
		
		%>
		<h2>게시판</h2>
		<table border="1" cellspacing="0" width="80%" align="center">
			<tr>
				<td width="50">글번호</td>
				<td>제목</td>
				<td width="100">글쓴이</td>
				<td width="100">날짜</td>
			</tr>
<%
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
new OracleDriver();
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	conn=DriverManager.getConnection(url, user, password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
%>			
			<tr>
				<td><a href="detail.jsp?num=<%=rs.getString(1) %>"><%=rs.getString(1) %></a></td>
				<td><a href="detail.jsp?num=<%=rs.getString(1) %>"><%=rs.getString(2) %></a></td>
				<td><a href="detail.jsp?num=<%=rs.getString(1) %>"><%=rs.getString(3) %></a></td>
				<td><a href="detail.jsp?num=<%=rs.getString(1) %>"><%=rs.getDate(4) %></a></td>
			</tr>
<%
	}
}catch(SQLException e){
	e.printStackTrace();
	out.print("<tr><td colspan=\"4\">데이터베이스접근이 원할하지 못합니다</td></tr>");
} finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}

%>			
		</table>
		<a href="add.jsp">[입 력]</a>
		</td>
	</tr>
	<tr>
		<td colspan="5">
		주식회사 메가제이앤씨<br>
		더조은컴퓨터아카데미<br>

		대표번호1588.8748<br>
		<p align="center">&copy; THEJOEUN ACADEMY Corp.</p>
		</td>
	</tr>
</table>
</body>
</html>






