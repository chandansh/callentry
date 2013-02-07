<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Call Entry</title>
<link rel="stylesheet" type="text/css" href="/callentry/css/callentry.css">
</head>
<body>
	<h2>New Call Entry</h2>
	<s:actionerror />
	<div>
	<a href="home">User Home</a>
	</div>
	<div style="float: left;">
	<s:form action="CallEntry" method="post">
		<s:select list="callTypes" name="callEntry.callType" label="Call Type" />
		<s:textfield name="callEntry.name" label="Client Name" />
		<s:textfield name="callEntry.serviceTicketNo"
			label="Service Ticket No" />
		<s:textarea name="callEntry.onlineDiscription" cols="40" rows="5"
			label="Online Discription" />
		<s:radio name="callEntry.saleMade" list="#{true:'Yes',false:'No'}"
			label="Sale Made" />
		<s:textfield name="callEntry.amount" label="Amount" />
		<s:textfield name="callEntry.agreementOrderNo"
			label="Agreement/Order No" />
		<s:textarea name="callEntry.comments" label="Comments" cols="40"
			rows="5" />
		<s:submit label="Create Entry" />
	</s:form>
	</div>
	<div style="float: left;">
	Notepad<br>
	<s:textarea name="sample" cols="40"
			rows="20"></s:textarea>
	</div>
</body>
</html>