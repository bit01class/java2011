<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
			<h2>�� ������</h2>
<%
new oracle.jdbc.driver.OracleDriver();
String num=request.getParameter("num");
String sql="select num,name,nalja,subject,content from bbs37 where num="+num;
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
%>
		<form action="update.jsp">	
			<input type="hidden" name="num" value="<%=rs.getString(1) %>" >
			<table width="600" align="center">
				<tr>
					<td bgcolor="gray" width="80">�۹�ȣ</td>
					<td><%=rs.getString(1) %></td>
					<td bgcolor="gray" width="80">�۾���</td>
					<td><%=rs.getString(2) %></td>
					<td bgcolor="gray" width="80">��¥</td>
					<td><%=rs.getString(3) %></td>
				</tr>
				<tr>
					<td bgcolor="gray">����</td>
					<td colspan="5"><input type="text" name="subject" value="<%=rs.getString(4) %>"></td>
				</tr>
				<tr>
					<td colspan="6"><textarea cols="80" rows="6" name="content"><%
					String content=rs.getString(5); 
					if(content==null)content="";
					out.print(content);
					%></textarea></td>
				</tr>
				<tr>
					<td bgcolor="gray" colspan="6" align="center">
						<input type="submit" value="�� ��">
					</td>
				</tr>
			</table>
		</form>
<%
	}
}catch(SQLException e){}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
		</td>
	</tr>
	<tr>
		<td colspan="5">
		�ֽ�ȸ�� �ް����̾ؾ�<br>
		��������ǻ�;�ī����<br>

		��ǥ��ȣ1588.8748<br>
		<p align="center">&copy; THEJOEUN ACADEMY Corp.</p>
		</td>
	</tr>
</table>
</body>
</html>






