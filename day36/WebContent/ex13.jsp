<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단 출력</h1>
	<table width="500" border="1">
		<%
		for(int j=1; j<10; j++){
		out.println("<tr>");
			for(int i=2; i<10; i++){
			out.print("<td>"+i+"x"+j+"</td>");
			} 
		out.println("</tr>");
		}
		%>
	</table>
</body>
</html>





