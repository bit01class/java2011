<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>학생성적관리프로그램(ver 0.11.0)</h1>
	<table border="1" width="100%">
		<tr>
			<td><a href="ex15.jsp">목록</a></td>
			<td><a href="ex16.jsp">입력</a></td>
			<td><a href="ex17.jsp">수정</a></td>
			<td><a href="ex18.jsp">삭제</a></td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<h2>입력페이지</h2>
				<form action="ex19.jsp">
					<p>학번:<input type="text" name="num"> </p>
					<p>이름:<input type="text" name="name"> </p>
					<p>국어:<input type="text" name="kor"> </p>
					<p>영어:<input type="text" name="eng"> </p>
					<p>수학:<input type="text" name="math"> </p>
					<input type="submit" value="입 력">
				</form>
			</td>
		</tr>
	</table>
</body>
</html>







