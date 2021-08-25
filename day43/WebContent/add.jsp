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
		<label>제목</label><input type="text" name="sub"><br>
		<textarea rows="6" cols="60" name="content"></textarea><br>
		<input type="submit" value="입 력">
		<input type="reset" value="취 소">
	</form>
</body>
</html>