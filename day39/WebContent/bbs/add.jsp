<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table width="100%">
	<tr>
		<td colspan="5">
		<img alt="" src="../imgs/logo.gif">
		</td>
	</tr>
	<tr>
		<td bgcolor="#cccccc">&nbsp;</td>
		<td bgcolor="#cccccc" width="100" align="center"><a href="../index.jsp">[HOME]</a></td>
		<td bgcolor="#cccccc" width="100" align="center"><a href="../login/form.jsp">[LOGIN]</a></td>
		<td bgcolor="#cccccc" width="100" align="center"><a href="./list.jsp">[B B S]</a></td>
		<td bgcolor="#cccccc">&nbsp;</td>
	</tr>
	<tr>
		<td colspan="5">
			<h3>�Է� ������</h3>
			<form action="insert.jsp" method="post">
			<table align="center">
				<tr>
					<td>����</td>
					<td><input type="text" name="sub" size="55"></td>
				</tr>
				<tr>
					<td>�۾���</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td colspan="2"><textarea name="content" rows="6" cols="60"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="�� ��">
						<input type="reset" value="�� ��">
					</td>
				</tr>
			</table>
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="5" bgcolor="#aaaaaa" align="center">
			<h4>��������ǻ�;�ī����</h4>
			<p>��ǥ��ȣ1588.8748</p>
			<p>&copy; THEJOEUN ACADEMY Corp.</p>
		</td>
	</tr>
</table>
</body>
</html>