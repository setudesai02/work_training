<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${ title }</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<br />
	<a href="<%=request.getContextPath()%>/subject/insert">Insert
		Subject</a>
	<br />
	<a href="<%=request.getContextPath()%>/subject/search">Find Subject</a>
	<br />
	<a href="<%=request.getContextPath()%>/subject/all">All Subjects</a>
	<br />

	<%@include file="footer.jsp"%>
</body>
</html>