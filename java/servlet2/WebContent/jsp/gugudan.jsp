<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, td {
border:2px solid blue;
text-align: center;
}
</style>
</head>


<body>
	<% 
	if(request.getMethod().equalsIgnoreCase("post")){
	int dan=0;
	String inputdan = request.getParameter("dan");
	
	if(inputdan == null){
		dan=2;	
	}else{
		dan =Integer.parseInt(inputdan);
	}
	%>
	
	<!-- 입력을 받아주는 것은 form 태그이다. submit 아님!!(시험문제) -->
	<form action="gugudan.jsp" method="post">
	단을 입력하세요: <input type="text" name=dan>
	<input type="submit" value="계산">
	</form>
	
	<br>
	
	<table>
	<%
	for(int i=1; i<=9; i++){
		out.println("<tr>");
		for(int j=2; j<=dan; j++){
			//2단부터 입력한 단까지 구구단 출력을 해보자.
			//서버 출력 버퍼 줄 바꿈 저장
			out.println("<td>"+j+ "*" +i+ "=" +j*i+"</td>");
		}
		out.println("</tr>");
	}
	%>
	</table>
	<%} %>
	
	<h1>클라이언트 ip: <%= request.getRemoteAddr() %></h1>
	<% System.out.println(request.getRemoteAddr()); %>
</body>
</html>