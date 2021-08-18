<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- Save for Web Slices (Untitled-1) -->
<table align="center" id="Table_01" width="800" height="601" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="3"  height="85">
			<img src="images/index_01.jpg" width="231" height="85" alt=""></td>
		<td colspan="4"></td>
	</tr>
	<tr>
		<td height="56">
		<img src="images/index_03.gif" width="119" height="56" alt=""></td>
		<td height="56">
			<a href="index.jsp"><img src="images/index_04.gif" width="99" height="56" alt=""></a></td>
		<td height="56">
			<img src="images/index_05.gif" width="107" height="56" alt=""></td>
		<td height="56">
			<a href="list.jsp"><img src="images/index_06.gif" width="126" height="56" alt=""></a></td>
		<td height="56">
			<img src="images/index_07.gif" width="136" height="56" alt=""></td>
		<td height="56">
			<img src="images/index_08.gif" width="109" height="56" alt=""></td>
		<td height="56">
			<img src="images/index_09.gif" width="104" height="56" alt=""></td>
	</tr>
	<tr>
		<td colspan="7" valign="top">
			<!-- content start -->
			<h3 align="center">리스트페이지</h3>
			<table border="1" cellspacing="0" align="center" width="600">
				<tr>
					<td width="80">글번호</td>
					<td>제목</td>
					<td width="100">글쓴이</td>
					<td width="100">날짜</td>
				</tr>
<%
new oracle.jdbc.driver.OracleDriver();
String key=request.getParameter("key");		
String word=request.getParameter("word");
String p=request.getParameter("p");
if(p==null)p="1";
int pg=Integer.parseInt(p);
int total=0;
if(key==null)key="subject";
if(word==null)word="";
String sql="select * from (select rownum as rn,num,subject,name,"
		+"nalja from (select num,subject,name,nalja from bbs37  where "
		+key+" like ('%"+word+"%') order by num desc)) "
		+"where rn between "+((pg-1)*10+1)+" and "+((pg-1)*10+1)+"+9";	// pg=1		(pg-1)*10+1
		
System.out.println(sql);
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	conn=DriverManager.getConnection(url,user,password);
	stmt=conn.createStatement();
	rs=stmt.executeQuery("select count(*) from bbs37  where "
			+key+" like ('%"+word+"%') order by num desc");
	rs.next();
	total=rs.getInt(1);
	rs.close();
	stmt.close();
	stmt=conn.createStatement();
	rs=stmt.executeQuery(sql);
	while(rs.next()){
%>				
				<tr>
					<td><a href="#"><%=rs.getInt(2) %></a></td>
					<td><a href="#"><%=rs.getString(3) %></a></td>
					<td><a href="#"><%=rs.getString(4) %></a></td>
					<td><a href="#"><%=rs.getDate(5) %></a></td>
				</tr>
<%
	}
}finally{
	if(rs!=null)rs.close();
	if(stmt!=null)stmt.close();
	if(conn!=null)conn.close();
}
%>				
			</table>
			<form action="list.jsp">
				<select name="key">
					<option value="subject">제목</option>
					<option value="name">글쓴이</option>
				</select>
				<input type="text" name="word">
				<input type="submit" value="검색">
			</form>
			<%
			int start=5*((pg-1)/5);
			int end=start+5;
			int limit=(total-1)/10+1;
			if(end>=limit)end=limit;
			if(start!=0){
			%>
			<a href="list.jsp?p=<%=start%>">[이전]</a>
			<%
			}
			for(int i=start;i<end; i++){
			%>
			<a href="list.jsp?p=<%=i+1%>">[<%=i+1%>]</a>
			<%
			}
			if(end<limit){
			%>
			<a href="list.jsp?p=<%=end+1%>">[다음]</a>
			<%} %>
			<!-- content end -->
		</td>
	</tr>
	<tr>
		<td height="81" colspan="7" background="images/index_11.gif">
			더조은컴퓨터아카데미<br>

			대표번호1588.8748<br/>
			&copy; THEJOEUN ACADEMY Corp.
		</td>
	</tr>
</table>
<!-- End Save for Web Slices -->
</body>
</html>