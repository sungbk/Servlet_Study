<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- JSTL ����� ����ϵ��� tag ��� ����, �ش� �±��� prefix ���� -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="value1" scope="request" value="seong"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�� : ${value1 } <br>
<c:remove var="value1" scope="request"/>
�� : ${value1 } <br>
</body>
</html>