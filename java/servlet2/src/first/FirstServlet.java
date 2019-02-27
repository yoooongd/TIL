package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out =response.getWriter();
	out.println("<h1>hello 서블릿 실행 결과입니다.</h1>");//<body> 내부만 쓴 것
	out.println("<h3>hello servlet complete</h3>");
}
}

/*요청: request: xxx
처리: ??
응답: response.xxx
html 태그 문자열, 한글 인코딩*/
