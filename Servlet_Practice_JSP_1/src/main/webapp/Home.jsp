<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="error1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page for Error generate</title>

</head>
<body>
<p>Trying to device by zero(0)</p>

<% int i = 9/0;
		out.println(i);

%>
</body>
</html>