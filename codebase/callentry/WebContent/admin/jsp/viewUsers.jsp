<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
</head>
<body>
<a href="home">admin Home</a>
<table border="1" cellspacing="0">
	<tr>
		<th>User Name</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>User Type</th>
	</tr>
	<s:iterator value="users" var="user">
		<tr>
			<td><s:property value="#user.userName" /></td>
			<td><s:property value="#user.firstName" /></td>
			<td><s:property value="#user.lastName" /></td>
			<td><s:property value="userType" /></td>
		</tr>
	</s:iterator>
</table>

</body>
</html>