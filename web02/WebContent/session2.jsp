<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int t = (int)session.getAttribute("tennis");
    int s = (int)session.getAttribute("swim");
    int sum = t + s;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=sum %>
</body>
</html>