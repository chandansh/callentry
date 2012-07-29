<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Call Entry</title>
</head>
<body>

	<h2>New Call Entry</h2>
	<s:form action="CallEntry" method="post">
		<s:select list="callTypes" name="callEntry.callType" label="Call Type" />
		<s:textfield name="callEntry.name" label="Client Name" />
		<s:textfield name="callEntry.serviceTicketNo" label="Service Ticket No" />
		<s:textarea name="callEntry.onlineDiscription" label="Online Discription" />
		<s:radio name="callEntry.saleMade" list="#{true:'Yes',false:'No'}" label="Sale Made" />
		<s:textfield name="callEntry.amount" label="Amount" />
		<s:textfield name="callEntry.agreementOrderNo" label="Agreement/Order No" />
		<s:textarea name="callEntry.comments" label="Comments" />
		<s:submit label="Create Entry" />
	</s:form>

</body>
</html>