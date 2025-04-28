<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isErrorPage="true"	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="color:red; background-color:lightgreen; font-size: 40px">
<div>Error Here:</div>
<%= exception.getMessage().toString() +" --is the main reason" %>
</body>
</html>