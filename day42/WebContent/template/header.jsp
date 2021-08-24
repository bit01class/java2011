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
String path=request.getParameter("path");
%>
<table width="100%">
	<tr>
		<td colspan="6"><img src="<%=path %>/imgs/logo.gif"></td>
	</tr>
	<tr>
		<td bgcolor="gray">&nbsp;</td>
		<td width="100" bgcolor="gray" align="center"><a href="<%=path %>/" style="color:white">[HOME]</a></td>
		<td width="100" bgcolor="gray" align="center"><a href="<%=path %>/intro.jsp" style="color:white">[INTRO]</a></td>
		<td width="100" bgcolor="gray" align="center"><a href="<%=path %>/bbs/list.jsp" style="color:white">[B B S]</a></td>
		<td width="100" bgcolor="gray" align="center"><a href="<%=path %>/login/form.jsp" style="color:white">[LOGIN]</a></td>
		<td bgcolor="gray">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="6" align="center">
		<!-- content start -->
</body>
</html>