<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- JSTL 기능을 사용하도록 tag 사용 설정, 해당 태그의 prefix 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 
	자바로 비교하면
	request.setAttribute("n", 10);
	와 동일한 코드
-->
<c:set var="n" scope="request" value="10"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:if test="${n==0}">
	n와 0은 같습니다
</c:if>
<c:if test="${n==10}">
	n와 10은 같습니다
</c:if>
</body>
</html>