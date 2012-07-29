<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to CallEntry Application</title>
</head>
<body>
	<h1 align="center">Welcome to CallEntry Application</h1>
	<div align="center">
		Please Enter Your Login Credential
		<s:form action="/login" method="post">
			<s:textfield name="user.userName" label="User Name" />
			<s:password name="user.password" label="Password" />
			<s:submit label="Login" />
		</s:form>
	</div>
</body>
</html>