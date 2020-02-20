<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<link rel="stylesheet" href="css/css.css">
<script type="text/javascript">
	function order(){
		$("form").submit();
	}
	function page(page){
		$("[name=page]").val(page);
		order();
	}
</script>
<body>

	<form action="list" method="post">
		
		发表时间：<input type="date" name="created1" value="${created1}">--
		<input type="date" name="created2" value="${created2}">
		<input type="submit" value="查询">
		<select  name="ReverseOrder"  onchange="order()">
			<option <c:if test="${ReverseOrder=='created'}">selected</c:if> value="created">发表时间</option>
			<option <c:if test="${ReverseOrder=='user_id'}">selected</c:if> value="user_id">作者Id</option>
			<option <c:if test="${ReverseOrder=='commentCnt'}">selected</c:if> value="commentCnt">评论数量</option>
        <select>
		<table>
		 	<tr>
		 		<td>编号</td>
		 		<td>标题</td>
		 		<td>内容</td>
		 		<td>作者</td>
		 		<td>作者ID</td>
		 		<td>评论数量</td>
		 		<td>发表时间</td>
		 		<td>修改时间</td>
		 	</tr>
		 	<c:forEach items="${list}" var="a">
		 	<tr>
		 		<td>${a.id}</td>
		 		<td>${a.title}</td>
		 		<td>${a.content}</td>
		 		<td>${a.username}</td>
		 		<td>${a.user_id}</td>
		 		<td>${a.commentCnt}</td>
		 		<td>${a.created}</td>
		 		<td>${a.updated}</td>
		 	</tr>
		 	</c:forEach>
		 	
		 	<tr>
			  	<td colspan="100">
			  		总条数:${page.total}
			  		<button name="pageNum" value="1">首页</button>
			  		<button name="pageNum" value="${page.prePage}">上一页</button>
			  		<button name="pageNum" value="${page.nextPage}">下一页</button>
			  		<button name="pageNum" value="${page.lastPage}">尾页</button>
			  		${page.pageNum}/${page.pages}
			  	</td>
			  </tr>
		</table>
	</form>
</body>
</html>