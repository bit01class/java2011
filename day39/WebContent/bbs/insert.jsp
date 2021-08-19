<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
if(request.getMethod().equals("POST")){
	request.setCharacterEncoding("euc-kr");// post방식의 한글처리
	String sub=request.getParameter("sub");
	String id=request.getParameter("id");
	String content=request.getParameter("content");
	String sql="insert into bbs39 (num,sub,id,content) values (";
	sql+="bbs39_seq.nextval,'"+sub+"','"+id+"','"+content+"')";
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Class.forName(driver);
	Connection conn=null;
	Statement stmt=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}catch(SQLException e){}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	
	response.sendRedirect("list.jsp");
}else{
	response.sendRedirect("add.jsp");
}
%>
</body>
</html>










