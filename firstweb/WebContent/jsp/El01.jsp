<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<%
	pageContext.setAttribute("p1", "page scope value");
	request.setAttribute("r1", "request scope value");
	session.setAttribute("s1", "session scope value");
	application.setAttribute("a1", "application scope value");
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!--  jsp로 사용하는 경우 -->
pageContext.getAttribute("p1") : <%= pageContext.getAttribute("p1") %>

<!--  EL로 사용하는 경우 -->
pageContext.getAttribute("p1") : ${pageScope.p1} <br>
request.getAttribute("r1") : ${requestScope.r1 } <br>
session.getAttribute("s1") : ${sessionScope.s1 } <br>
application.getAttribute("a1") : ${applicationScope.a1 } <br>
<br><br>
<!--  아래의 표현처럼 scope 객체이름 작성하지 않아도 사용 가능 -->
<!--  p1, r1 .. 등등이 다른 객체와 중복되는 경우 작은 Scope부터 우선순위로 탐색하여 출력 -->
<!--  그러나 가독성 및 명시적 표현을 위해서 위처럼 작성하기 -->
pageContext.getAttribute("p1") : ${p1 } <br>
request.getAttribute("r1") : ${r1 } <br>
session.getAttribute("s1") : ${s1 } <br>
application.getAttribute("a1") : ${a1 } <br>

</body>
</html>