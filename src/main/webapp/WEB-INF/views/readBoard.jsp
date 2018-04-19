<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
var formObj = $("#listForm");

function deleteBoard(bno) {
	formObj.attr("action", "/deleteBoard");
	formObj.attr("method", "post");
	formObj.submit();
	alert("삭제!");
} 
</script>
</head>
<body>
<a href="/viewBoard">목록</a>
<form id="listForm">
	<input type="hidden" name="bno" value="${boardVO.bno }"/>
</form>
<div>
	<h4>호랑이 선생님 과제_CRUD만들기</h4>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>${boardVO.bno}</td>
			<td>${boardVO.title}</td>
			<td>${boardVO.content}</td>
		</tr>
	</table>
	<a onclick="deleteBoard(${boardVO.bno});" style="cursor:pointer;">삭제</a>
</div>


</body>
</html>

