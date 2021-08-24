<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../template/header.jsp">
	<jsp:param value=".." name="path"/>
</jsp:include>
<h1>리스트 페이지</h1>
<table width="600">
	<tr>
		<th width="80">글번호</th>
		<th>제목</th>
		<th width="100">글쓴이</th>
		<th width="100">날짜</th>
	</tr>
<%@ page import="java.util.ArrayList" %>
<%@ page import="kr.co.tjoeun.bean.BbsDto" %>
<%@ page import="kr.co.tjoeun.dao.BbsDao" %>	
	<%
	BbsDao dao=new BbsDao();
	ArrayList<BbsDto> list=dao.getList();
	for(BbsDto bean:list){
	%>
	<tr>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
		<td><%
		for(int i=0; i<bean.getDep(); i++){
			out.print("&nbsp;&nbsp;");
		}
		if(bean.getDep()!=0)out.print("┗");
		%><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getSub() %></a></td>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getName() %></a></td>
		<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNalja() %></a></td>
	</tr>
	<%} %>
</table>
<a href="add.jsp">[입 력]</a>
<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>







