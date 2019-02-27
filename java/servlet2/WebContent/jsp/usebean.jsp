<%@page import="vo.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>usebean 태그연습</title>
</head>

<body>
<%-- <%
	BoardVo vo = new BoardVo(); 
	vo.setSeq(10);
	vo.setTitle("10번게시물제목");
	vo.setContents("10번게시물내용");
	vo.setViewcount(500);
	%>
	<h1>번호: <%= vo.getSeq() %></h1>
	<h1>제목: <%= vo.getTitle() %></h1>
	<h1>내용: <%= vo.getContents()%></h1>
	<h1>조회수: <%= vo.getViewcount() %></h1> --%>
	<hr>
	<h1> 액션 태그 이용 </h1>
	<!-- request.setAttribute("vo2",vo2) -->
	<jsp:useBean class="vo.BoardVo" id="vo2" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="vo2"/>
	
<%-- 	<jsp:setProperty property="seq" name="vo2"/>
	<jsp:setProperty property="title" name="vo2"/>
	<jsp:setProperty property="contents" name="vo2"/>
	<jsp:setProperty property="viewcount" name="vo2"/> --%>
	<!-- forward 동작: request 객체 포함 다른 객체 전송 -->
	<jsp:forward page="usebean2.jsp"/>
	
	
</body>
</html>