package forward;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/* StartServlet이 doGet 방식이므로 AdminServlet과 UserServlet 모두 doGet방식이어야 한다.!!
	 * 
	 * 1. http: ... / StartServlet?id=xxx&pw=xxxx
	 * 2. id가 system이거나 admin이면 (대소문자 무시) AdminServlet으로
	 * 3. 2번의 나머지 경우 UserServlet으로 이동(id, pw 전달)
	 * */
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	for(int i = 0; i<pw.length();i++) {
		pw=pw.replace(pw.charAt(i), '*');
	}
	
	RequestDispatcher rd=null;
	if(id.equalsIgnoreCase("system") || id.equalsIgnoreCase("admin")) {
		rd= request.getRequestDispatcher("AdminServlet");
	}else {
		request.setAttribute("userid", id);
		request.setAttribute("pw", pw);
		rd = request.getRequestDispatcher("UserServlet");
	}
	rd.forward(request, response);

	
	
}
}
