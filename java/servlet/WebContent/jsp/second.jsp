<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" autoFlush="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>
	<% 
	out.println(out.getBufferSize());
	out.println(new Date()); 
	//응답: 서버 출력 버퍼 임시 저장 => 파일의 수행이 완료되면 한 번에 출력
	//out.clear(); //따라서 지우면 출력 안됨.
	out.println(out.getRemaining());
	
	out.flush();
	//버퍼 내용 꽉 차면 일단 브라우저 출력 - 버퍼 비운다. : (buffer) flush
	//지시문에 자동 설정되어 있으므로 할 필요 없다.
	%>
	</h1> 
	<!-- 태그는 태그대로 쓰자~~ (jsp 문장 안에도 가능하지만, 말고 밖에!)  -->
	
</body>

</html>