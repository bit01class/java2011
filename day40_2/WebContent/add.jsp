<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�Է� ������</h1>
	<form action="insert.jsp" method="post">
		<table width="600" align="center">
			<tr>
				<td>����</td>
				<td><input type="text" name="sub" size="55"></td>
			</tr>
			<tr>
				<td>�۾���</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td rowspan="2"><textarea name="content" rows="6" cols="60"></textarea></td>
			</tr>
			<tr>
				<td rowspan="2">
					<input type="submit" value="�� ��">
					<input type="reset" value="�� ��">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>