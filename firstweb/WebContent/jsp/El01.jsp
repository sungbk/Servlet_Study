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
<!--  jsp�� ����ϴ� ��� -->
pageContext.getAttribute("p1") : <%= pageContext.getAttribute("p1") %>

<!--  EL�� ����ϴ� ��� -->
pageContext.getAttribute("p1") : ${pageScope.p1} <br>
request.getAttribute("r1") : ${requestScope.r1 } <br>
session.getAttribute("s1") : ${sessionScope.s1 } <br>
application.getAttribute("a1") : ${applicationScope.a1 } <br>
<br><br>
<!--  �Ʒ��� ǥ��ó�� scope ��ü�̸� �ۼ����� �ʾƵ� ��� ���� -->
<!--  p1, r1 .. ����� �ٸ� ��ü�� �ߺ��Ǵ� ��� ���� Scope���� �켱������ Ž���Ͽ� ��� -->
<!--  �׷��� ������ �� ����� ǥ���� ���ؼ� ��ó�� �ۼ��ϱ� -->
pageContext.getAttribute("p1") : ${p1 } <br>
request.getAttribute("r1") : ${r1 } <br>
session.getAttribute("s1") : ${s1 } <br>
application.getAttribute("a1") : ${a1 } <br>

</body>
</html>