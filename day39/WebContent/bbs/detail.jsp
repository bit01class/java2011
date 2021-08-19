<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="100%">
	<tr>
		<td colspan="5">
		<img alt="" src="../imgs/logo.gif">
		</td>
	</tr>
	<tr>
		<td bgcolor="#cccccc">&nbsp;</td>
		<td bgcolor="#cccccc" width="100" align="center"><a href="../index.jsp">[HOME]</a></td>
		<td bgcolor="#cccccc" width="100" align="center"><a href="../login/form.jsp">[LOGIN]</a></td>
		<td bgcolor="#cccccc" width="100" align="center"><a href="./list.jsp">[B B S]</a></td>
		<td bgcolor="#cccccc">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="5">
<%
HashMap<String,Object> map=new HashMap<String,Object>();

String param=request.getParameter("num");
// try
try{
int num=Integer.parseInt(param);
Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
String sql="select num,nalja,id,cnt,sub,content from bbs39 where num="+num;
		
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	stmt.executeUpdate("update bbs39 set cnt=cnt+1 where num="+num);
	stmt.close();
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
		map.put("num", rs.getInt(1));
		map.put("nalja", rs.getString(2));
		map.put("id", rs.getString(3));
		map.put("cnt", rs.getInt(4));
		map.put("sub", rs.getString(5));
		map.put("content", rs.getString(6));
	}
}catch(SQLException e){}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
}catch(NumberFormatException e){
	response.sendRedirect("list.jsp");
}
%>	
			<h3>상세 페이지</h3>
			<table align="center" width="600" border="1" cellspacing="0">
				<tr>
					<td width="100" bgcolor="#cccccc">글번호</td>
					<td><%=map.get("num") %></td>
					<td width="100" bgcolor="#cccccc">날짜</td>
					<td><%=map.get("nalja") %></td>
				</tr>
				<tr>
					<td bgcolor="#cccccc">글쓴이</td>
					<td><%=map.get("id") %></td>
					<td bgcolor="#cccccc">조회수</td>
					<td><%=map.get("cnt") %></td>
				</tr>
				<tr>
					<td bgcolor="#cccccc">제목</td>
					<td colspan="3"><%=map.get("sub") %></td>
				</tr>
				<tr>
					<td colspan="4" height="300"><%=map.get("content") %></td>
				</tr>
				<tr>
					<td colspan="4"  bgcolor="#cccccc">
						<a href="edit.jsp?num=<%=map.get("num")%>">[수 정]</a>
						<a href="delChk.jsp?num=<%=map.get("num")%>">[삭 제]</a>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td colspan="5" bgcolor="#aaaaaa" align="center">
			<h4>더조은컴퓨터아카데미</h4>
			<p>대표번호1588.8748</p>
			<p>&copy; THEJOEUN ACADEMY Corp.</p>
		</td>
	</tr>
</table>
</body>
</html>