<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		<%@ page import="java.util.*,java.sql.*" %>
		<%!
		Connection conn;
		Statement stmt;
		ResultSet rs;
		class BbsBean{
			int  num;
			String sub;
			java.sql.Date  nalja;
		}
		%>
		<%
		ArrayList<BbsBean> list=new ArrayList<BbsBean>();
		Class.forName("oracle.jdbc.OracleDriver");
		try{
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.99.100:11521:xe"
					,"system","oracle");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from bbs01 order by nalja desc");
			while(rs.next()){
				BbsBean bean=new BbsBean();
				bean.num=rs.getInt("num");
				bean.sub=rs.getString("sub");
				bean.nalja=rs.getDate("nalja");
				list.add(bean);
			}
		}finally{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		for(BbsBean bean:list){
		%>
		<tr>
			<td><a href="./?jsp=detail&num=<%=bean.num %>"><%=bean.num %></a></td>
			<td><a href="./?jsp=detail&num=<%=bean.num %>"><%=bean.sub %></a></td>
			<td><a href="./?jsp=detail&num=<%=bean.num %>"><%=bean.nalja %></a></td>
		</tr>
		<%} %>
	</table>
	<a href="./?jsp=add">[입 력]</a>
</body>
</html>



