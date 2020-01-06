<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var="t" value="<script type='text/javascript'>alert(3);</script>"/>

<!--  escapeXml을 falue로 설정하면 JavaScript 실행되어 출력
true로 설정하면 JavaScript 코드가 그대로 출력 -->
<c:out value="${t }" escapeXml="true"/>
</body>
</html>