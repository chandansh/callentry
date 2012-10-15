<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<link rel="stylesheet" type="text/css" href="/callentry/css/callentry.css">
</head>
<body>
	<h1>Admin Home</h1>
	<h3>
		Welcome
		<s:property value="%{#session.user.userName}" />
	</h3>
	<a href="populatecreateUser">Create User</a>
	<br>
	<a href="viewUsers">View Users</a>
	<br>
	<a href="populateViewEntries">View Entries by User and Date</a>
	<br>
	<s:url action="logout" var="logout" namespace="">
	</s:url>
	<s:a href="%{logout}">Logout</s:a>
	<br>
</body>
</html>