package test;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDBS extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//요청
	request.setCharacterEncoding("utf-8");
	//id,pw 이름 파라미터 2개 입력
	
	//로그인 처리: jdbc
	//member 테이블 id, pw 조사 sql
	String result="";
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con 
			= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("연결성공");
		
		/*1.localhost:member 테이블 조회
		id 존재하면 입력 pw dbpw 같으면 "정상 로그인 사용자"
		입력 pw dbpw 같지 않으면ㅇ 암호를 확인하세요
		id 존재하지 않으면 "회원이 아닙니다"*/
		
		String sql = "select id, password from member";
		PreparedStatement pt = con.prepareStatement(sql);
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		ResultSet rs=pt.executeQuery();

		while(rs.next()) {
			if(rs.getString("id").equals(id)) {
				if(rs.getString("password").equals(pw)){//암호일치
					result = "정상사용자입니다.";
				}else{//암호불일치
					result = "암호 확인하세요.";
				}
				break;
			}
			else{
				result= "아이디리스트에 없습니다."
						+ "<h3><a href='insertform_db.html'>회원 가입하러 가기</h3>";
			}
			
		}
		
		con.close();
		System.out.println("연결해제");
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	
	
	//응답
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	out.println(result);
}
}
