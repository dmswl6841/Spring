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

<P>  The time on the server is ${serverTime}. </P><br>
<a href="noticeSelect.do">Select</a><br>
<a href="noticeSelectList.do">List</a><br>
<a href="noticeInsert.do">insert</a><br>
<a href="noticeUpdate.do">update</a><br>
<a href="noticeSearch.do">search</a><br>
<a href="noticeForm.do">form</a><br>
</body>
</html>
