<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="kr.co.tjoeun.bean.BbsBean"></jsp:useBean>
<jsp:setProperty property="num" name="bean"/>

<%
String sql="select * from bbs39 where num="+bean.getNum();

java.sql.Connection conn=null;
try{
	conn=kr.co.tjoeun.util.MyOracle.getConnection();
	java.sql.Statement stmt=conn.createStatement();
	java.sql.ResultSet rs=stmt.executeQuery(sql);
	while(rs.next()){
		bean.setSub(rs.getString("sub"));
		bean.setContent(rs.getString("content"));
		bean.setNalja(rs.getDate("nalja"));
		bean.setCnt(rs.getInt("cnt"));
		bean.setId(rs.getString("id"));
	}
}finally{
	if(conn!=null)conn.close();
}

%>
�۹�ȣ:<jsp:getProperty property="num" name="bean"/><br>
��¥:<jsp:getProperty property="nalja" name="bean"/><br>
�۾���:<jsp:getProperty property="id" name="bean"/><br>
��ȸ��:<jsp:getProperty property="cnt" name="bean"/><br>
����:<jsp:getProperty property="sub" name="bean"/><br>
����:<jsp:getProperty property="content" name="bean"/>
</body>
</html>















