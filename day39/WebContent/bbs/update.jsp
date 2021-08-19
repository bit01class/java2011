<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

if(request.getMethod().equals("POST")){
	request.setCharacterEncoding("euc-kr"); // 매 요청시 마다
	int num=Integer.parseInt(request.getParameter("num"));
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	String sql="update bbs39 set sub='"+sub
				+"', content='"+content+"' where num="+num;
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	java.sql.Connection conn=null;
	java.sql.Statement stmt=null;
	Class.forName(driver);
	try{
		conn=java.sql.DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
}
response.sendRedirect("detail.jsp?num="+request.getParameter("num"));
%>

</body>
</html>








