<%@ page language="java" %>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page pageEncoding="EUC-KR"%>
<%@ page import="java.lang.*,java.util.*"%>
    <!-- ��Ƽ�� - class �� -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<% 
	// ��ũ��Ʈ�� - �޼��� ����, main �޼��� ����(��, non-static)
	func01();
	System.out.println(this.getClass());
%>
<%!
	// ����� - Ŭ���� �� �޼��� ��, �ʵ��� ��ġ
	int su1=1111;
	static double su2=3.14;
	
	public void func01(){
		System.out.println(su1++);
	}	
	public static void func02(){}
%>
</head>
<body>
	<!-- ����Ʈ���� �ּ� -->
	<h1>jsp ����</h1>
	<% 
	// �鿣�� �ּ� 
	%>
</body>
<% 
	// ��ũ��Ʈ��
	
	%>
</html>











