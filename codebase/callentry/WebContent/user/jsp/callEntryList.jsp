<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<s:actionmessage />
<a href="populateCallEntry">Create new Entry</a>
|
<a href="home">User Home</a>
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
		<th>Modify</th>
	</tr>
	<s:iterator value="entries" var="entry">
		<s:url action="deleteEntry" var="deleteUrl" method="deleteEntry"
			encode="true">
			<s:param name="entryId">
				<s:property value="#entry.id" />
			</s:param>
			<s:param name="forwardPage">
				<s:property value="forwardPage" />
			</s:param>
		</s:url>
		<s:url action="populateEditEntry" var="editUrl">
			<s:param name="entryId">
				<s:property value="#entry.id" />
			</s:param>
			<s:param name="forwardPage">
				<s:property value="forwardPage" />
			</s:param>
		</s:url>
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
			<td><s:a href="%{editUrl}">Edit</s:a>|<s:a href="%{deleteUrl}">Delete</s:a></td>
		</tr>
	</s:iterator>
</table>
