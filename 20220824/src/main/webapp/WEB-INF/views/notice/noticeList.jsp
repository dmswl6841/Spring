<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>공지목록</h2>
	<c:forEach items="${notices}" var="n" varStatus="status">
		${status.count } : ${n.notice_id } : ${n.notice_title } : ${n.notice_writer } : ${n.notice_date} <br>
	</c:forEach>
	<a href="noticeForm.do">form</a>
</body>
</html>