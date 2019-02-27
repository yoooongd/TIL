package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginSessionServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//1. HttpSession 생성
	//브라우저를 열고 최초 요청 - HttpSession 객체 생성
	//브라우저 2, 3, ... 요청 - 생성 HttpSession 객체 리턴
	HttpSession session = request.getSession();
	System.out.println(session.isNew());
	
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	
	String html="";
	
	if(session.getAttribute("sessionid")!=null &&
			((String)session.getAttribute("sessionid")).equals(request.getParameter("id"))) {
		html="<h1>이미 로그인 하셨습니다.</h1>";
	}
	else {
		//2. 입력 id 전송 받아서 1 생성 세션 저장
		session.setAttribute("sessionid", request.getParameter("id"));
		html="<h1>로그인 되었습니다.(아이디를 세션에 저장했습니다.)</h1>";		
	}
	
	out.println(html);
	out.println("<a href='mypagesession'> 마이페이지로 이동하기</a>");
	out.println("<a href='logoutsession'> 로그아웃</a>");
	out.println("<a href='http://localhost:8081/servlet/jsp/boardwrite_session.jsp'>"
			+ " 글쓰러 이동하기</a>");
}
}

//얘는 다른 servlet에서 사용할 거야ㅏㅏㅑㅏㅑ 지금 이거는 의미가 없다.
//session.getAttribute("sessionid");