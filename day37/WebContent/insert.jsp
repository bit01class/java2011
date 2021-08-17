<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="oracle.jdbc.driver.OracleDriver" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
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
		<td colspan="5" height="400">
<%
// get방식 한글처리
// server.xml
// <Connector  port="8080" 에 다음 속성추가 URIEncoding="EUC-KR"

String sub=request.getParameter("subject");
String name=request.getParameter("name");
String content=request.getParameter("content");
String sql="insert into bbs37 (num,subject,name,content,nalja) values ";
sql+="(bbs37_seq.nextval,'"+sub+"','"+name+"','"+content+"',sysdate)";

String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

new OracleDriver();
Connection conn=null;
Statement stmt=null;
try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	stmt.executeUpdate(sql);
	out.println("<h2 align=\"center\">입력성공</h2>");
}catch(SQLException e){
	out.println("<h2 align=\"center\">입력실패</h2>");
}finally{
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
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






