package include;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//여러 개 서블릿 공통 필요 코드 정의: include
//request.setAttribute("공유 속성 변수 명", Obejct)
//(String)request.getAttribute("공유 속성 변수명")
//		위의 형 변환은 setAttribute의 Object 타입에 맞게!
public class SharedServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String devname=(String)(request.getAttribute("devname"));//이제 SharedServlet만 OneServlet과 공유
	
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	out.println("<hr>");
	Date now = new Date();
	SimpleDateFormat f = new SimpleDateFormat("yyyy년도 MM월 dd일 HH시 mm분 ss초");
	out.println(f.format(now));
	out.println("연락처: 010-2587-8455, 개발자: "+devname);
	out.println("<hr>");
	
}
}
