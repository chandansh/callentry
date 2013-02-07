<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Call Entry</title>
<link rel="stylesheet" type="text/css" href="/callentry/css/callentry.css">
</head>
<body>
	<h2>Edit Call Entry Form</h2>
	<s:actionerror />
	<a href="home">User Home</a>
	<s:form action="updateEditEntry" method="post">
		<s:hidden name="callEntry.id"></s:hidden>
		<s:hidden name="callEntry.userId"></s:hidden>
		<s:hidden name="forwardPage"></s:hidden>
		<s:select list="callTypes" name="callEntry.callType" label="Call Type" />
		<s:textfield name="callEntry.name" label="Client Name" />
		<s:textfield name="callEntry.serviceTicketNo"
			label="Service Ticket No" />
		<s:textarea name="callEntry.onlineDiscription"
			label="Online Discription" />
		<s:radio name="callEntry.saleMade" list="#{true:'Yes',false:'No'}"
			label="Sale Made" />
		<s:textfield name="callEntry.amount" label="Amount" />
		<s:textfield name="callEntry.agreementOrderNo"
			label="Agreement/Order No" />
		<s:textarea name="callEntry.comments" label="Comments" />
		<s:submit label="Create Entry" />
	</s:form>

</body>
</html>