<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>request내장객체2-결과</h1>
	<p>
	<% 
	String id=request.getParameter("id");
	out.println("id="+id);
	String pw=request.getParameter("pw");
	out.println("<br>pw="+pw);
	String ra=request.getParameter("ra");
	out.println("<br>ra="+ra);
	//String ch1=request.getParameter("ch");
	//out.println("<br>ch1="+ch1);
	//String ch2=request.getParameter("ch");
	//out.println("<br>ch2="+ch2);
	//String ch3=request.getParameter("ch");
	//out.println("<br>ch3="+ch3);
	String[] ch=request.getParameterValues("ch");
	System.out.println(java.util.Arrays.toString(ch));
	String ta=request.getParameter("ta");
	ta=ta.replace("\n", "<br>");
	out.print("<br>");
	out.print(ta);
	System.out.println("-----------------------------");
	java.util.Enumeration<String> en=request.getParameterNames();
	while(en.hasMoreElements()){
		String paramName=en.nextElement();
		System.out.println(paramName+"="+request.getParameter(paramName));
	}
	System.out.println("-----------------------------");
	java.util.Map<String,String[]> map=request.getParameterMap();
	java.util.Set<String> set=map.keySet();
	java.util.Iterator<String> ite= set.iterator();
	while(ite.hasNext()){
		String key=ite.next();
		System.out.println(key+"="
			+java.util.Arrays.toString(map.get(key)));
	}
	%>
	</p>	
</body>
</html>










