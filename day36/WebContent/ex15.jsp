<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�л������������α׷�(ver 0.11.0)</h1>
	<table border="1" width="100%">
		<tr>
			<td><a href="ex15.jsp">���</a></td>
			<td><a href="ex16.jsp">�Է�</a></td>
			<td><a href="ex17.jsp">����</a></td>
			<td><a href="ex18.jsp">����</a></td>
		</tr>
		<tr>
			<td colspan="4">
				<table width="500" align="center">
					<tr>
						<td>�й�</td>
						<td>�̸�</td>
						<td>����</td>
						<td>����</td>
						<td>����</td>
					</tr>
<%
//����̹� �ε�
oracle.jdbc.driver.OracleDriver driver=null;
driver=new oracle.jdbc.driver.OracleDriver();

String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";
String sql="select num,name,kor,eng,math from stu01 order by num asc";

java.sql.Connection conn=null;
java.sql.Statement stmt=null;
java.sql.ResultSet rs=null;
try{
	conn=java.sql.DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
		out.println("<tr>");
		out.println("	<td>"+rs.getString(1)+"</td>");
		out.println("	<td>"+rs.getString(2)+"</td>");
		out.println("	<td>"+rs.getString(3)+"</td>");
		out.println("	<td>"+rs.getString(4)+"</td>");
		out.println("	<td>"+rs.getString(5)+"</td>");
		out.println("</tr>");
	}
}catch(java.sql.SQLException e){
} finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>






