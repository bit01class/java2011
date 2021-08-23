<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
<jsp:useBean id="bean" class="kr.co.tjoeun.bbs01.dto.Bbs01Dto" ></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
<%

if("POST".equals(request.getMethod())){
	
	String sql="insert into bbs01 values (bbs01_seq.nextval,'"
				+bean.getName()+"','"+bean.getSub()+"','"+bean.getContent()+"',sysdate)";
	
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
}else{
	out.println("<h3>잘못된 접근입니다</h3>");
	out.println("<a href=\"add.jsp\">[link]</a>를 통해 입력하세요");
}
%>
<%@ include file="../template/footer.jspf" %>
</body>
</html>









