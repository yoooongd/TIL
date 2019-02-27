<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지불창</title>
<script src="http://localhost:8081/servlet/jquery-3.2.1.min.js"></script>
<script>
	$(document).ready(function(){

	 	$("#a").on("click", function(){
			menu="지불하신 선택수단은 현금입니다.";
			$('#output').html(menu);
		});
		$("#b").on("click", function(){
			menu="지불하신 선택수단은 신용카드입니다.";
			$('#output').html(menu);
		});
		$("#c").on("click", function(){
			menu="지불하신 선택수단은 핸드폰입니다.";
			$('#output').html(menu);
		});

	});
</script>
</head>

<body>
	<h1>지불 수단을 선택하세요.</h1>
	
	<form action="pay.jsp">
	<input type="radio" name="menu" id="a" value="현금" /> 현금
	<input type="radio" name="menu" id="b" value="신용카드" /> 신용카드
	<input type="radio" name="menu" id="c" value="핸드폰" /> 핸드폰소액결제
	<input type="submit" value="선택">
	</form>	

	<%
	String product = (String)session.getAttribute("sessionproduct");
	int balance = (Integer)session.getAttribute("sessionbalance");
	int price = Integer.parseInt(product.split(":")[1]);

	%>
	 
	<h1> <%=product.split(":")[0] %> : <%=price%></h1>
	<h1> 구입 수량 : <%=balance %></h1>
	<h1> 총 지불 가격은 <%=balance*price %></h1>
	<h1 id="output"></h1>
	
	
	<% 
	if(request.getParameter("menu")==null) {
		out.println("지불방식을 선택하세요.");
	}
	else {
		session.removeAttribute("sessionproduct");
		session.removeAttribute("sessionbalance");		
		out.println("<h1>장바구니를 비웁니다.</h1>");
	}
	
	%> 
	
</body>
</html>