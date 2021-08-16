<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단2</h1>
	<table border="1" width="500">
		<%for(int i=1; i<10; i++){ %>
		<tr>
			<%for(int j=2; j<10; j++){ %>
			<td><%=j%>x<%=i%></td>
			<%} %>
		</tr>
		<%} %>
	</table>
</body>
</html>










