<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니보기</title>
</head>
<body>
<h1>장바구니 저장 내용은 다음과 같습니다.</h1>

	<%
	String product = (String)session.getAttribute("sessionproduct");
	int balance = (Integer)session.getAttribute("sessionbalance");
	%>

	<h1> <%=product.split(":")[0] %> : <%=product.split(":")[1] %></h1>
	<h1> 구입 수량 : <%=balance %></h1>

</body>
</html>