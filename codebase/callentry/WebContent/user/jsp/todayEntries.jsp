<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/callentry/css/callentry.css">
</head>
<body>
<h2>Today's Entries</h2>
<s:set var="forwardPage" value="%{'todayEntries'}"></s:set>
<jsp:include page="callEntryList.jsp"></jsp:include>
</body>
</html>