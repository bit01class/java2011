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
	<%
	java.util.ArrayList<kr.co.tjoeun.bean.BbsBean> list;
	list=new java.util.ArrayList<kr.co.tjoeun.bean.BbsBean>();
	String sql="select num,sub,id,cnt from bbs39 order by num desc";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	java.sql.Connection conn=null;
	java.sql.Statement stmt=null;
	java.sql.ResultSet rs=null;
	
	Class.forName(driver);
	try{
		conn=java.sql.DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			kr.co.tjoeun.bean.BbsBean bean;
			bean=new kr.co.tjoeun.bean.BbsBean();
			bean.setNum(rs.getInt(1));
			bean.setSub(rs.getString(2));
			bean.setId(rs.getString(3));
			bean.setCnt(rs.getInt(4));
			list.add(bean);
		}
	}finally{
		if(conn!=null)conn.close();
	}
	%>
	<p><a href="add.jsp">[입 력]</a></p>
	<table>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>글쓴이</td>
			<td>날짜</td>
		</tr>
	<%
	// 개선된 루프문(for in)
	for(kr.co.tjoeun.bean.BbsBean bean: list){
	%>	
		<tr>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getId() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getCnt() %></a></td>
		</tr>
	<%} %>	
	</table>
</body>
</html>














