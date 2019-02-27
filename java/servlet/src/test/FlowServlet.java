package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//main:콘솔출력
//main x :브라우저 서블릿 실행 
//=> 웹 어플리케이션 서버(=servlet container)
//tomcat + jdk
//객체 생성-어떤 메소드 실행 순서 제어
//객체 생성(자동) - init() 정의 - doGet() 정의 - destroy 정의 

public class FlowServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		System.out.println("doGet 메소드다");
	}

	public void destroy() {
		System.out.println("destroy 메소드 호출할거다ㅏㅏㅏ");
	}

	public void init() throws ServletException {
		System.out.println("수정 init 메소드 호출");
	}
}
