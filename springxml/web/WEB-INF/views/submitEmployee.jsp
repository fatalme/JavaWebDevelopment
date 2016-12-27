<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: nm
  Date: 12/24/2016
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="defaultDateFormat" class="java.text.SimpleDateFormat" scope="application">
    <%=defaultDateFormat.format(new Date())%>
</jsp:useBean>

<spring:message message="haha">
    <spring:argument>xixi</spring:argument>
</spring:message>
</body>
</html>
