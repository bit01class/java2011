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
ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();

Class.forName("oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
String sql="select num,sub,id,cnt from bbs39 order by num desc";

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("num", rs.getInt(1));
		map.put("sub", rs.getString(2));
		map.put("id", rs.getString(3));
		map.put("cnt", rs.getInt(4));
		list.add(map);
	}
}catch(SQLException e){}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>	
			<h3>리스트 페이지</h3>
			<table align="center" width="600" border="1" cellspacing="0">
				<tr>
					<td width="80">글번호</td>
					<td>제목</td>
					<td width="100">글쓴이</td>
					<td width="80">조회수</td>
				</tr>
				
				<%
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> map=list.get(i);
				%>
				<tr>
					<td width="80"><a href="detail.jsp?num=<%=map.get("num") %>"><%=map.get("num") %></a></td>
					<td><a href="detail.jsp?num=<%=map.get("num") %>"><%
					String sub=(String)map.get("sub"); 
					sub=sub.replace("<", "&lt;");
					sub=sub.replace(">","&gt;");
					out.print(sub);
					%></a></td>
					<td width="100"><a href="detail.jsp?num=<%=map.get("num") %>"><%=map.get("id") %></a></td>
					<td width="80"><a href="detail.jsp?num=<%=map.get("num") %>"><%=map.get("cnt") %></a></td>
				</tr>
				<%} %>
			</table>
			<p align="center"><a href="add.jsp">[입 력]</a></p>
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