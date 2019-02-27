package shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ProductVO;

public class ShopServlet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
	//http:localhost:8081/servlet/shop?menu=
	//http:localhost:8081/servlet/jsp/start.jsp
	
	String file="";//이동할 파일
	if(request.getParameter("menu")==null) {
		file="jsp/start.jsp";
	}
	else {
		file = "jsp/" + request.getParameter("menu")+".jsp";
	}
	//10개 상품 저장 배열 생성-productlist.jsp 출력
	//ProductVO - code 이름 가격 재고 설명 이미지 파일
	
	ArrayList<ProductVO> list = new ArrayList<ProductVO>();	
	list.add(new ProductVO(1000, "삼성에어컨", 1000000, 10));
	list.add(new ProductVO(2000, "엘지에어컨", 1100000, 20));
	list.add(new ProductVO(3000, "멀티컴퓨터", 1000000, 10));
	list.add(new ProductVO(4000, "멀티라면", 1000, 1000));
	list.add(new ProductVO(5000, "삼성맥주", 2000, 100));
	
	request.setAttribute("productlist", list);
	
	RequestDispatcher rd = request.getRequestDispatcher(file);
	rd.forward(request, response);
}
}
