<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	try{
		//1. "servlet" 프로젝트 설정내용 기억
		Context initContext = new InitialContext();
		
		//2. context.xml 파일 설정 내용 찾아와
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		
		//3.jdbc/myoracle 생성 객체 찾아왕
		//ds: connectionpool 객체
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		
		for(int i= 1; i <= 1000; i++){
			//4.connectionpool ds로부터 con 전달받음.
			Connection con = ds.getConnection();
			System.out.println(i+"번째 "+con+" 성공");
			
			//5. con을 ds에게 반납.
			con.close();
		}
	}catch(Exception e){e.printStackTrace();}
	
	
	%>
<%-- 	<%
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		for(int i=1; i<=100; i++){
			Connection con 
				= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println(i+"번째 "+con+" 연결성공");
			/* 
			con 메모리 삭제: g/c
			con 표시만 - 일괄 삭제
			*/
			con.close();
			System.out.println("연결해제");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	%> --%>

</body>
</html>