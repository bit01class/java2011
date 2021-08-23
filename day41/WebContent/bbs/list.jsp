<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="kr.co.tjoeun.bbs01.dto.Bbs01Dto" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
	<center>
		<h3>List Page</h3>
		<table width="600" border="1" cellspacing="0">
			<tr>
				<td width="80">글번호</td>
				<td>제목</td>
				<td width="100">글쓴이</td>
				<td width="100">날짜</td>
			</tr>

<%
String sql="select * from bbs01 order by num desc";


java.util.ArrayList<Bbs01Dto> list=new java.util.ArrayList<Bbs01Dto>();
try{
	conn=java.sql.DriverManager.getConnection(url, user, password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
		Bbs01Dto bean=new Bbs01Dto();
		bean.setNum(rs.getInt("num"));
		bean.setName(rs.getString("name"));
		bean.setSub(rs.getString("sub"));
		bean.setNalja(rs.getDate("nalja"));
		list.add(bean);
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)rs.close();
	if(conn!=null)conn.close();
}
for(Bbs01Dto bean:list){
%>			
			<tr>
				<td><%=bean.getNum() %></td>
				<td><%=bean.getSub() %></td>
				<td><%=bean.getName() %></td>
				<td><%=bean.getNalja() %></td>
			</tr>
<%} %>			
		</table>
		<a href="add.jsp">[입 력]</a>
	</center>
<%@ include file="../template/footer.jspf" %>
</body>
</html>




