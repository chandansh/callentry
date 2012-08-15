<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Entry by Date</title>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet"
	type="text/css" />
<sx:head/>
</head>
<body>
	<s:form action="listEntriesByDate" method="POST">
		<sx:datetimepicker name="date" label="Select Date to display"
			displayFormat="yyyy-MM-dd"  />
		<s:submit value="Show"></s:submit>
	</s:form>
	<s:set var="forwardPage" value="%{'entriesByDate'}"></s:set>
	<jsp:include page="callEntryList.jsp"></jsp:include>
</body>
</html>