<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.sql.*, dao.BoardDAO"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>html 태그 영역입니다.</h1>
	
	<% System.out.println("콘솔 출력 jsp 문장 영역입니다.");
	out.println("<h1>브라우저 출력 jsp 문장 영역</h1>");
	BoardDAO dao = new BoardDAO();
	try{
		Class.forName("");
		DriverManager.getConnection("");
	}catch(Exception e){e.getStackTrace();}
	
	String s1="local"; //_jspService에 메소드 지역 변수
	%>
	
	<%! String s2 = "global"; %><!-- 내부적으로 변수가 생기는 위치가 다름. 필드 변수로 생김 --> 
	
	<%="<h2>브라우저 출력 전용 태그(=%)</h2>" + request.getParameter("id")%><!-- request도 내장 함수 -->
	
	<% out.println("<h2>브라우저 출력 전용 태그(%%)</h2>"); %>
	
	<h2>브라우저출력전용태그(html)</h2>
	
	<input type=text name='n' value ='<%= request.getParameter("id") %>' >
	<%=request.getMethod() %>
	<% if(request.getMethod().equals("POST")){
		//POST 방식일 때 뭐할 지를 여기에 적어주면 됨!
	} %>
	
</body>
</html>