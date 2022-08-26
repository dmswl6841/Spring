<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><h3>공지사항</h3></div>
		<div>
			<form id="fm" action="noticeInsert.do" method="post" enctype="multipart/form-data">
				<div>
					<table border="1">
						<tr>
							<th width="150">작성자</th>
							<td width="200">${n.noticeWriter }</td>
							<th width="150">작성일자</th>
							<td width="200">${n.noticeDate }</td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3">${n.noticeTitle }</td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="3">${n.noticeSubject }
							</td>
						</tr>
					</table>
				</div><br>
				<input type="submit" value="등록">
				<input type="button" value="취소">
			</form>
		</div>
	</div>
</body>
</html>