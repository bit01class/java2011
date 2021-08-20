<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="kr.co.tjoeun.bbs39.BbsList"%>
<%@page import="kr.co.tjoeun.bbs39.BbsBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p align="right"><a href="add.jsp">[입 력]</a></p>
	<table width="600" border="1" cellspacing="0" align="center">
		<tr>
			<td width="100">글번호</td>
			<td>제목</td>
			<td width="100">글쓴이</td>
			<td width="100">조회수</td>
		</tr>
		<%
		BbsList bbs=new BbsList();
		ArrayList<BbsBean> list=bbs.getList();
		for(int i=0; i<list.size(); i++){
			BbsBean bean=list.get(i);
		%>
		<tr>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getSub().replace("<","&lt;") %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getId() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getCnt() %></a></td>
		</tr>
		<%} %>
	</table>
</body>
</html>










