<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="kr.co.tjoeun.dao.BbsDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("euc-kr"); 
	if("POST".equals(request.getMethod())){
	%>
	<jsp:useBean id="bean" class="kr.co.tjoeun.bean.BbsDto"></jsp:useBean>
	<jsp:setProperty property="*" name="bean"/>
	<% 
		if(bean.getName()!=null){
			BbsDao dao=new BbsDao();
			dao.insertOne(bean);
			response.sendRedirect("list.jsp");
		}else{
			//response.sendRedirect("add.jsp?sub="+bean.getSub()
			//						+"&content="+bean.getContent());
	%>
		<jsp:forward page="add.jsp"></jsp:forward>
	<%		
		}
	}else{
		response.sendRedirect("add.jsp");
	}
	%>
</body>
</html>








