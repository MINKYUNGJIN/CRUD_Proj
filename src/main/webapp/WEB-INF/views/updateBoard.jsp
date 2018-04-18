<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

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
	
	<input type="button" id="save" value="저장">
	<input type="button" id="cancle" value="취소">
</div>


</body>
</html>
<script>
	$("#save").on("click", function(){
		formObj.attr("action", "/readBoard");
		formObj.attr("method", "post");
		alert("저장!");
		formObj.submit();
	})
	
	$("#cancle").on("click", function(){
		formObj.attr("action", "/readBoard");
		formObj.attr("method", "post");
		formObj.submit();
	})
</script>

