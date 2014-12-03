<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="include.jsp"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>${ title }</title>
</head>
<body>

	<%@include file="header.jsp"%>
	<%
		String message = request.getParameter("message");
		boolean isSet = message != null;
		if (isSet) {
	%>
	<p>Message:</p><%=message%>
	<%
		}
	%>


	<br />
	<br />
	<a href="<%=request.getContextPath()%>/student">Student</a>
	<br />
	<br />
	<a href="<%=request.getContextPath()%>/tutor">Tutor</a>
	<br />
	<br />
	<a href="<%=request.getContextPath()%>/subject">Subject</a>

	<%@include file="footer.jsp"%>
</body>
</html>