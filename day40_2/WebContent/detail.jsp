<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="kr.co.tjoeun.bbs39.BbsList" %>
<%@ page import="kr.co.tjoeun.bbs39.BbsBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	BbsList list=new BbsList();
	BbsBean bean=list.getOne(num);
%>
	<h1>�� ������</h1>
	<table width="600" align="center">
		<tr>
			<td>�۹�ȣ</td>
			<td><%=bean.getNum() %></td>
			<td>��¥</td>
			<td><%=bean.getNalja() %></td>
		</tr>
		<tr>
			<td>�۾���</td>
			<td><%=bean.getId() %></td>
			<td>��ȸ��</td>
			<td><%=bean.getCnt() %></td>
		</tr>
		<tr>
			<td>����</td>
			<td colspan="3"><%=bean.getSub().replace("<", "&lt;") %></td>
		</tr>
		<tr>
			<td colspan="4"><%=bean.getContent() %></td>
		</tr>
		<tr>
			<td colspan="4">
				<a href="edit.jsp?num=<%=bean.getNum()%>">[�� ��]</a>
				<a href="delete.jsp?num=<%=bean.getNum()%>">[�� ��]</a>
			</td>
		</tr>
	</table>
</body>
</html>