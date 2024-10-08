<%@page import="springmvc.dto.Purchase"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>구매 상품 리스트 검색</title>
	</head>
	<body>
		<form action="/springmvcmybatis7th/findPurchaseList" method="post">
			NAME: <input type="text" name="name" placeholder="name"/>
			<input type="submit" value="검색" >
		</form>
		
		<table border="1">
			<thead><tr>
				<th style='border-left: none;'>상품번호</th>
				<th style='border-left: none;'>상품이름</th>
				<th style='border-right: none;'>수량</th>
				<th style='border-right: none;'>가격</th>
				<th style='border-left: none;'>고객번호</th>
			</tr></thead>
			<c:forEach var="purchase" items="${purchase}">
				<tr><td>${purchase.pno}</td>
				<td>${purchase.pname}</td>
				<td>${purchase.quantity}</td>
				<td>${purchase.price}</td>
				<td>${purchase.no}</td></tr>
			</c:forEach>
		</table>
	</body>
</html>