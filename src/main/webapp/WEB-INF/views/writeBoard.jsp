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
<form role="form" method="post">
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
					<input id="title" type="text" value="${BoardVO.title}">
				</td>
			</tr>
			<tr>
				<td>
					<div id=content_div>내용</div>
					<input id="content" type="text" value="${BoardVO.content}" >
					<textarea id="content" name="content" ></textarea>
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

<script type='text/javascript'>

	
	
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
