<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="insert.jsp">
		제목:<input type="text" name="sub"><br>
		글쓴이:<input type="text" name="id"><br>
		<textarea rows="5" cols="30"></textarea><br>
		<input type="submit" value="입 력"><br>
		<input type="reset" value="취 소">
	</form>
</body>
</html>