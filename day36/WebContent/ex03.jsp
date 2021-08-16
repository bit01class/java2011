<%@ page language="java" %>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page pageEncoding="EUC-KR"%>
<%@ page import="java.lang.*,java.util.*"%>
    <!-- 디렉티브 - class 밖 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<% 
	// 스크립트릿 - 메서드 내부, main 메서드 내부(단, non-static)
	func01();
	System.out.println(this.getClass());
%>
<%!
	// 선언부 - 클래스 안 메서드 밖, 필드의 위치
	int su1=1111;
	static double su2=3.14;
	
	public void func01(){
		System.out.println(su1++);
	}	
	public static void func02(){}
%>
</head>
<body>
	<!-- 프런트엔드 주석 -->
	<h1>jsp 문법</h1>
	<% 
	// 백엔드 주석 
	%>
</body>
<% 
	// 스크립트릿
	
	%>
</html>











