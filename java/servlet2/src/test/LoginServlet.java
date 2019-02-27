package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//get 데이터: 자동 한글 처리
		//post 데이터: 한글 인코딩 처러 필요
		request.setCharacterEncoding("utf-8"); //포스트 형식일 때만 사용 가능 get은 자동처리

		//id, pw 이름 2개 값 전송 받아서
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//checkbox type=checkbox, <select mutiple="multiple"
		String hobby[] = request.getParameterValues("hobby");
		
		String total = "";
		for(String s : hobby) {
			total+= s+ "--";
		}
		
		//출력
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>입력한 아이디는 "+id+"이고");
		out.println("암호는 "+pw+" 입니다.");
		out.println("취미는"+total+"</h1>");
		
	}

}
