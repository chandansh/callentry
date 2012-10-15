<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Entry by Date</title>
<link rel="stylesheet" type="text/css" href="/callentry/css/callentry.css">
<link href="<s:url value="/css/main.css"/>" rel="stylesheet"
	type="text/css" />
<sx:head />
</head>
<body>
	<h3>View Entries</h3>
	<a href="home">User Home</a>
	<s:form action="ViewEntries" method="POST">
		<s:select list="usersForSelectBox" name="userId" label="Select User" />
		<sx:datetimepicker name="date" label="Select Date to display"
			displayFormat="yyyy-MM-dd" />
		<s:submit value="Show"></s:submit>
	</s:form>

	<s:form action="DownloadEntries" method="POST">
		<s:select list="usersForSelectBox" name="userId" label="Select User" />
		<sx:datetimepicker name="date" label="Select Date to display"
			displayFormat="yyyy-MM-dd" />
		<s:submit value="Download"></s:submit>
	</s:form>
	<table border="1" cellspacing="0">
		<tr>
			<th>Name</th>
			<th>Call Type</th>
			<th>Service Ticket No</th>
			<th>Online Description</th>
			<th>Sale Made</th>
			<th>Amount</th>
			<th>Agreement Order No</th>
			<th>Comments</th>
			<th>Date</th>
		</tr>
		<s:iterator value="entries" var="entry">
			<tr>
				<td><s:property value="#entry.name" /></td>
				<td><s:property value="#entry.callType" /></td>
				<td><s:property value="#entry.serviceTicketNo" /></td>
				<td><s:property value="onlineDiscription" /></td>
				<td><s:property value="saleMade" /></td>
				<td><s:property value="amount" /></td>
				<td><s:property value="agreementOrderNo" /></td>
				<td><s:property value="comments" /></td>
				<td><s:property value="date.time" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>