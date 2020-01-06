<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- jsp에서는 되도록 자바 코드를 줄이는 것이 좋음. 그래서 나온 것이 JSTL, EL --%>
<%-- EL표기법으로 구현 --%>
${v1 } + ${v2 } = ${result }


<%-- Java 표현코드로 구현
<%
	int v1 = (int)request.getAttribute("v1");
	int v2 = (int)request.getAttribute("v2");
	int result = (int)request.getAttribute("result");
%>

<%=v1 %> + <%=v2 %> = <%=result %> 
--%>
</body>
</html>