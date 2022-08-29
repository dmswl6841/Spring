<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div align="center">
		<div><h2>로그인</h2></div>
		<div>
			<form id="fm" action="memberLogin.do" method="post">
				<div>
					<table>
						<tr>
							<th width="150">아이디</th>
							<td width="200"><input type="text" id="member_id" name="member_id"></td>
						</tr>
						<tr>
							<th width="150">password</th>
							<td width="200"><input type="password" id="member_password" name="member_password"></td>
						</tr>
					</table>
				</div> <br>
				<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</form>
		</div>
	</div>
</body>
</html>