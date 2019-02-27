package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberInsertServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//request.setCharacterEncoding("utf-8");
	
	//parameter 5개 요청, 입력
	//member table insert (indate column은 sysdate)
	//결과 응답. "회원가입 완료!"
	
	String id = request.getParameter("id");
	int pw = Integer.parseInt(request.getParameter("pw"));
	String name=request.getParameter("name");
	String phone=request.getParameter("phone");
	String email=request.getParameter("email");
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
	
	
	//응답
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	out.println(result);
	
}
}
