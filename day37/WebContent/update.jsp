<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="0;url=/day37/list.jsp">
<title>Insert title here</title>
</head>
<body>
<%
String sub=request.getParameter("subject");
String content=request.getParameter("content");
String num=request.getParameter("num");
String sql="update bbs37 set subject='"+sub
			+"',content='"+content+"' where num="+num;

String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
System.out.println(sql);
new oracle.jdbc.driver.OracleDriver();

Connection conn=null;
Statement stmt=null;
try{
	conn=DriverManager.getConnection(url, user, password);
	stmt=conn.createStatement();
	stmt.executeUpdate(sql);
	}catch(SQLException e){
		e.printStackTrace();
}finally{
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
</body>
</html>










