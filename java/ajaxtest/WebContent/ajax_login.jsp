<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw"); 
	/* 
	id=hr 이고 pw=hr인 경우에만 정상로그인 취급
	ajax jquery 함수 요청-응답
	json: {"auth":true, "time": "2019-01-23"}	
	*/
	String result="";
	if(id.equals("hr") && pw.equals("hr")){
		result="{\"auth\":true, \"time\": \"2019-01-23\"}";
	}
	else{
		result="{\"auth\":false}";
	}

%>
<%=result%>