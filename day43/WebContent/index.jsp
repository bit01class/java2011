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
	String jsp=request.getParameter("jsp");
	if(jsp==null)jsp="main";
	jsp+=".jsp";
%>
<table width="100%">
	<tr>
		<td colspan="4">
			<img alt="logo" src="imgs/logo.gif">
		</td>
	</tr>
	<tr>
		<td bgcolor="gray">&nbsp;</td>
		<td bgcolor="gray" width="100" align="center"><a href="./?jsp=main">[HOME]</a></td>
		<td bgcolor="gray" width="100" align="center"><a href="./?jsp=list">[B B S]</a></td>
		<td bgcolor="gray">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="4">
		<!-- content -->
		<jsp:include page="<%=jsp %>"></jsp:include>
		</td>
	</tr>
	<tr>
		<td colspan="4" bgcolor="gray" align="center">
		<h4>더조은컴퓨터아카데미</h4>
		<p>대표번호1588.8748</p>
		<p>&copy; THEJOEUN ACADEMY Corp.</p>
		</td>
	</tr>
</table>
</body>
</html>