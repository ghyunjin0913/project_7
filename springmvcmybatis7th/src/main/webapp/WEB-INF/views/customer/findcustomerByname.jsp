<%@page import="springmvc.dto.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>고객 리스트 검색</title>
	</head>
	<body>
		<form action="/springmvcmybatis7th/findcustomerByname" method="post">
			NAME: <input type="text" name="name" placeholder="name"/>
			<input type="submit" value="검색" >
		</form>

		<table border="1">
			<thead><tr>
				<th style='border-left: none;'>고객번호</th>
				<th style='border-left: none;'>고객이름</th>
				<th style='border-right: none;'>주소</th>
			</tr></thead>
			<tr><td>${customer.no}</td>
			<td>${customer.name}</td>
			<td>${customer.address}</td></tr>
		</table>
	</body>
</html>