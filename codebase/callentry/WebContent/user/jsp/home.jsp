<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home</title>
</head>
<body>
	Welcome
	<s:property value="%{#session.user.userName}" />
	<h1>User Home</h1>
	<a href="populateCallEntry">Create Entry</a>
	<br>
	<a href="viewTodayEntries">View Today Entries</a>
	<br>
	<a href="viewAllEntries">View All Entries</a>
	<br>
	<a href="viewEntriesByDateForm">View Entries By Date</a>
	<br>
	<s:url action="logout" var="logout" namespace="">
	</s:url>
	<s:a href="%{logout}">Logout</s:a>
	<br>
</body>
</html>