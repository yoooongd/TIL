<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://localhost:8081/servlet/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){
	$("#a").on("click", function(){
		location.href="http://localhost:8081/servlet/shop?menu=productlist";
	});
	$("#b").on("click", function(){
		location.href="jsp/cartview.jsp";
	});
	$("#c").on("click", function(){
		location.href="jsp/pay.jsp";
	});
});
</script>
</head>

<body>
<h1>우리 쇼핑몰에 오신 것을 환영합니다.</h1>

<input type="button" id="a" value="상품리스트">
<input type="button" id="b" value="장바구니보기">
<input type="button" id="c" value="결제">

<h1>오늘은 생필품을 세일하고 있습니다.</h1>
</body>

</html>