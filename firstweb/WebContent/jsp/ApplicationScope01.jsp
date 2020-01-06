<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	try {
		int value = (int)application.getAttribute("value");
		value+=2;
		application.setAttribute("value", value);
		
		out.println("<h1>APP2 value : "+value+"</h1>");
	} catch (NullPointerException e) {
		out.print("Value의 값이 설정되지 않음");
	}
%>
</body>
</html>