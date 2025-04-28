<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP connection and data fetch from JDBC</title>

<style>
div {
	background-color: lightpink;
	text-align: center;
	/* align-content: center; */
	width: 600px;
	height: 500px;
	margin-left: 100px;
	margin-top: 50px;
	border: 9em;
	margin-top: 50px;
}

.header {
	font-size: 30px;
	text-decoration: blink;
	text-decoration: underline;
	color: red;
	margin: 5px, 10px;
}

.text {
	font-size: 20px;
	font-style: italic;
	color: green;
	margin: 3px;
}
</style>

</head>
<body>
	<%
	String url = "jdbc:mysql://localhost:3306/udemy";
	/* String url =  "jdbc:mysql://localhost:3306/SQL_Practice"; */
	String user = "root";
	String password = "himanshu";

	String sql = "select * from student";

	Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL 8 and later

	Connection conn = DriverManager.getConnection(url, user, password);

	Statement st = conn.createStatement();

	ResultSet rs = st.executeQuery(sql);
	%>
	<div>
		<h2>Below is the data of respondent:</h2>
		<br>
		<hr>
		<hr>
		<table border="2px thik black">
			<tr class="header">
				<td>User ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Email Address</td>
			</tr>
			<%
			while (rs.next()) {
			%>
			<tr class="text">
				<td><%=rs.getString(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
			</tr>
<%
}
%>

		</table>
	</div>
</body>
</html>