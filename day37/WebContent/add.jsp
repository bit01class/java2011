<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0" align="center" width="800">
	<tr>
		<td colspan="5"><img src="imgs/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor="gray" width="100"></td>
		<td bgcolor="gray" align="center"><a href="index.jsp">[HOME]</a></td>
		<td bgcolor="gray" align="center"><a href="intro.jsp">[INTRO]</a></td>
		<td bgcolor="gray" align="center"><a href="list.jsp">[B B S]</a></td>
		<td bgcolor="gray" width="100"></td>
	</tr>
	<tr>
		<td colspan="5" height="400" align="center">
			<h2>입력페이지</h2>
			<form action="insert.jsp">
				<table>
					<tr>
						<td>제목</td>
						<td><input type="text" name="subject" size="40"></td>
					</tr>
					<tr>
						<td>글쓴이</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td colspan="2"><textarea name="content" cols="50" rows="6"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center" bgcolor="gray"><input type="submit" value="입 력"></td>
					</tr>
				</table>
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="5">
		주식회사 메가제이앤씨<br>
		더조은컴퓨터아카데미<br>

		대표번호1588.8748<br>
		<p align="center">&copy; THEJOEUN ACADEMY Corp.</p>
		</td>
	</tr>
</table>
</body>
</html>






