<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
<style>
table, th, td {
	border: collapse;
	border-spacing: 15px;
}
</style>
</head>
<body>
	<h1>Scheduled Sessions</h1>
	<table>
		<tr>
			<th>SessionName</th>
			<th>Duration(Days)</th>
			<th>Faculty</th>
			<th>Mode</th>
		</tr>
		<c:forEach items="${aList}" var="session">
			<tr>
				<td><c:out value="${session.name}" /></td>
				<td><c:out value="${session.duration}" /></td>
				<td><c:out value="${session.faculty}" /></td>
				<td><c:out value="${session.mode1}" /></td>
				<td><a href="enrollMe?sessionId=${session.id}">Enroll Me</a></td>
			</tr>
		</c:forEach>
	</table>
	<div>
		<font color='red'> <c:if test="${not empty errorMessage}">
              ${errorMessage} </c:if>
		</font>
	</div>
</body>
</html>