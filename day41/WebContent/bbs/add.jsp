<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
	<center>
	<h3>입력페이지</h3>
	<form action="insert.jsp" method="post">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="sub" size="55"></td>
		</tr>
		<tr>
			<td>글쓴이</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td colspan="2"><textarea name="content" rows="6" cols="60"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="SUBMIT">
				<input type="reset" value="RESET">
			</td>
		</tr>
	</table>
	</form>
	</center>	
<%@ include file="../template/footer.jspf" %>
</body>
</html>