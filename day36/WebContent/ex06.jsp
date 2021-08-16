<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>request 내장객체2 - parameter</h1>
	<p><a href="ex07.jsp?id=abcd&pw=1234">go ex07.jsp</a></p>
	<form action="ex07.jsp"  method="get">
		<input type="text" name="id" value=""><br>
		<input type="password" name="pw"><br>
		<input type="radio" name="ra" value="ra1">item1
		<input type="radio" name="ra" value="ra2">item2
		<input type="radio" name="ra" value="ra3">item3<br>
		<input type="checkbox" name="ch" value="ch1">item1
		<input type="checkbox" name="ch" value="ch2">item2
		<input type="checkbox" name="ch" value="ch3">item3<br>
		<textarea rows="5" cols="10" name="ta"></textarea>
		
		<input type="submit" value="전달">
	</form>
</body>
</html>









