package include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//http: ...../ one?dev="이자바"
		//+SheredServlet 실행ㄹ 결과 포함
		String dev = request.getParameter("dev");
		request.setAttribute("devname", dev);//무조건 include 전에
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>OneServlet 실행 </h1>");

		RequestDispatcher rd = request.getRequestDispatcher("shared");
		
		rd.include(request, response);//현재 파일에 shared도 붙이겠다.
		//request: 같은 클라이언트에 주겠다.
		//response를 공유하겠다. 그러니까 출력물 뒤에 출력물을 붙여!
		
		//이전 출력 저장 내용 삭제하고 forward
		
		out.println("<h1>보이니</h1>");
}	
}
