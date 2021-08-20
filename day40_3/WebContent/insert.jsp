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
	<jsp:setProperty property="sub" name="bean"/>
	<jsp:setProperty property="id" name="bean"/>
	<%
	java.sql.Connection conn=null;
	try{
	conn=kr.co.tjoeun.util.MyOracle.getConnection();
	java.sql.Statement stmt=conn.createStatement();
	stmt.executeUpdate("insert into bbs39 (num,sub,id,content) values (bbs39_seq.nextval,'"
						+bean.getSub()+"','"+bean.getId()+"','"+bean.getContent()+"')");
	}finally{conn.close();}
	response.sendRedirect("./");
	%>
</body>
</html>










