<%@page import="vo.MemberVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
//1. 요청 파라미터 5개 입력
	String id = request.getParameter("id");
	int pw = Integer.parseInt(request.getParameter("pw"));
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String email=request.getParameter("email");
	MemberVO vo = new MemberVO(id, pw, name, phone, email);

//2. db에 insert
	String result="";
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con 
			= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("연결성공");

		String sql = "insert into member values (?, ?, ?, ?, sysdate, ?)";
		PreparedStatement pt = con.prepareStatement(sql);
		
		pt.setString(1, id);//id
		pt.setInt(2, pw);//pw
		pt.setString(3, name);//name
		pt.setString(4, phone);//phone 
		pt.setString(5, email);//email
		
		int insertRow = pt.executeUpdate();
		
		if(insertRow==1) {
			result="회원가입 완료";
		}else {
			result="정보를 다시 입력하세요 회원가입 미완료";
		}
		
		con.close();
		System.out.println("연결해제");
	}catch(Exception e) {
		e.printStackTrace();
		result="정보를 다시 입력하세요 회원가입 미완료";
	}
%>
<!-- 3. login2.jsp로 forward
forward 이전 출력 버퍼 저장 - forward 삭제 
-->

<% request.setAttribute("memberinform", vo); %>

<jsp:forward page="login2.jsp">
	<jsp:param value="<%=result%>" name="a"/>
</jsp:forward>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인처리</title>
</head>

<body>

</body>

</html>