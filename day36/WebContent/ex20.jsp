<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@ page import="oracle.jdbc.driver.OracleDriver,java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�л������������α׷�(ver 0.11.0)</h1>
	<table border="1" width="100%">
		<tr>
			<td><a href="ex15.jsp">���</a></td>
			<td><a href="ex16.jsp">�Է�</a></td>
			<td><a href="ex17.jsp">����</a></td>
			<td><a href="ex18.jsp">����</a></td>
		</tr>
		<tr>
			<td colspan="4" align="center">
<%
String num=request.getParameter("num");
String sql="delete from stu01 where num="+num;
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

OracleDriver driver=new OracleDriver();

Connection conn=null;
Statement stmt=null;
try{
	conn=DriverManager.getConnection(url, user, password);
	stmt=conn.createStatement();
	stmt.executeUpdate(sql);
	out.print("<h2>��������</h2>");
}catch(java.sql.SQLException e){
	out.print("<h2>��������</h2>");
}finally{
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}

%>			
			</td>
		</tr>
	</table>
</body>
</html>










