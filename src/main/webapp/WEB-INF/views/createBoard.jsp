<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type='text/javascript'>

	var formObj = $("#listForm");
	
	$("#save").on("click", function(){
		formObj.attr("action", "/createBoard");
		formObj.attr("method", "post");
		formObj.submit();
		alert("저장!");
	})
	
	$("#cancle").on("click", function(){
		location.href="/viewBoard";
	})
</script>
</head>
<body>
<form id="listForm" role="form" method="post">
<div>
	<h4>호랑이 선생님 과제_CRUD만들기</h4>
	<table>
		<tbody>
			<tr>
				<th>번호</th>
			</tr>
			<tr>
				<td>
					<div id=title_div>제목</div>
					<input id="title" name="title" type="text" value="${BoardVO.title}">
				</td>
			</tr>
			<tr>
				<td>
					<div id=content_div>내용</div>
					<textarea id="content" name="content"  >${BoardVO.content}</textarea>
				</td>
			</tr>
		
		
		</tbody>
		
	</table>
	
	<input type="button" id="save" value="저장">
	<input type="button" id="cancle" value="취소">
</div>

</form>
</body>
</html>


