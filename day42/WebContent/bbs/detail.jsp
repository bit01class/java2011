<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="kr.co.tjoeun.dao.BbsDao"%>
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
	<h1>상세 보기</h1>
	<jsp:useBean id="bean" class="kr.co.tjoeun.bean.BbsDto"></jsp:useBean>
	<jsp:setProperty property="num" name="bean"/>
	<%    
	BbsDao dao=new BbsDao();
	bean=dao.getOne(bean);
	%>
	<table>
		<tr>
			<td>글번호</td>
			<td><jsp:getProperty property="num" name="bean"/> </td>
			<td>글쓴이</td>
			<td><jsp:getProperty property="name" name="bean"/> </td>
			<td>날짜</td>
			<td><jsp:getProperty property="nalja" name="bean"/> </td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="5"><jsp:getProperty property="sub" name="bean"/> </td>
		</tr>
		<tr>
			<td colspan="6"><jsp:getProperty property="content" name="bean"/> </td>
		</tr>
		<tr>
			<td colspan="6">
				<a href="#">[수 정]</a>
				<a href="#">[삭 제]</a>
				<a href="re.jsp?ord=<%=bean.getOrd()%>&lvl=<%=bean.getLvl()%>&dep=<%=bean.getDep()+1%>">[답 글]</a>
			
			</td>
		</tr>
	</table>
	
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>