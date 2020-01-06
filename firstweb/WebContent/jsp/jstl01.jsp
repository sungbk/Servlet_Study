<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- JSTL 기능을 사용하도록 tag 사용 설정, 해당 태그의 prefix 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="value1" scope="request" value="seong"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
성 : ${value1 } <br>
<c:remove var="value1" scope="request"/>
성 : ${value1 } <br>
</body>
</html>