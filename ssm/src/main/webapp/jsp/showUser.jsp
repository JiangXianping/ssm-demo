<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>
</head>
<body>
<form action="book/findAllBook" method="post">
	<table cellpadding="10" cellspacing="0" align="center">
		<tr>
			<th>图书编号</th>
			<th>图书名称</th>
			<th>图书作者</th>
			<th>出版社</th>
			<th>出版时间</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
		
		<c:forEach items="${list}" var="book">
		<tr>
			<td>${book.bookCode }</td>
			<td>${book.bookName }</td>
			<td>${book.bookAuthor }</td>
			<td>${book.bookPublishing }</td>
			<td>${book.bookPublicationDate }</td>
			<td><a href="">Edit</a></td>
			<td><a href="">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>