<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 15/01/2017
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input Error</title>
</head>
<body>
you see this page, because the input: <s:property value="age"/> is error!<br/>
<s:fielderror/>
</body>
</html>
