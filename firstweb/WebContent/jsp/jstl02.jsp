<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- JSTL ����� ����ϵ��� tag ��� ����, �ش� �±��� prefix ���� -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 
	�ڹٷ� ���ϸ�
	request.setAttribute("n", 10);
	�� ������ �ڵ�
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
	n�� 0�� �����ϴ�
</c:if>
<c:if test="${n==10}">
	n�� 10�� �����ϴ�
</c:if>
</body>
</html>