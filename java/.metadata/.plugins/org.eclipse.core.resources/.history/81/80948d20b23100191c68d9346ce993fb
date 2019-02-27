<%@page import="vo.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.ShopServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../jquery-3.2.1.min.js"></script>
</head>

<!--1. productlist 속성 값 읽어오기(request.getAttribute이용)=> ArrayList 타입으로
2. 1번 조회: ProductVO들 5개
<form action="cart.jsp">
3. xxx.getName()//상품이름들 나올 것
	:select - option 태그로 구성
	(2, 3번 반복문)
4. 선택 상품명 구입수량 입력 <input type=text name=balance> 생성
5. option 태그 선택 상품명, 구입 수량 - cart.jsp 전송
<input type=submit value="장바구니 저장">
</form>
-->

<body>
	<%
	ArrayList<ProductVO> list= (ArrayList<ProductVO>)request.getAttribute("productlist");
	%>
	<form action="jsp/cart.jsp">
		<select name="product">
		<%
		for(ProductVO vo:list){
		%>
			<option value='<%=vo.getName()+":"+vo.getPrice()%>'>
			<%=vo.getName() %></option>
		<%
		}
		%>
		
		</select>
		
		<input type=text name=balance>	
		<input type=submit value="장바구니 저장">	
	</form>
</body>

</html>