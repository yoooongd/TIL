<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body>
	<%
	String product = request.getParameter("product");
	int balance = Integer.parseInt(request.getParameter("balance"));
	int price = Integer.parseInt(product.split(":")[1]);
	%>
	
	<%
	session.setAttribute("sessionproduct",product);
	session.setAttribute("sessionbalance", balance);
	%>

	<h1> 장바구니에 저장한 제품은 <%=product.split(":")[0] %>이고,
		가격은 <%=product.split(":")[1] %>입니다. </h1>
	<h1> 구입 수량은 <%=balance %> 입니다. </h1>
</body>
</html>