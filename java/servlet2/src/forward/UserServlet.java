package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String userid=(String)(request.getAttribute("userid"));
		String pw=(String)(request.getAttribute("pw"));
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>일반 유저용 화면 입니다.</h1>");
		out.println("<h2> userid: "+userid+" pw: "+pw+"</h2>");
	}
}
