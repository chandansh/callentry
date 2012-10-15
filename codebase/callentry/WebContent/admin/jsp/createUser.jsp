<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New User</title>
<link rel="stylesheet" type="text/css" href="/callentry/css/callentry.css">
</head>
<body>

	<h2>Create new User</h2>
	<a href="home">User Home</a>
	<s:form action="createUser" method="post">
		<s:textfield name="user.userName" label="User Name" />
		<s:textfield name="user.firstName" label="First Name" />
		<s:textfield name="user.lastName" label="Last Name" />
		<s:password name="user.password" label="Password" />
		<s:select list="userTypes" name="user.userType" label="User Type" />
		<s:submit label="Create User" />
	</s:form>

</body>
</html>