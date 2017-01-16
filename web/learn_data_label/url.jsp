<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:url value="https://baidu.com" var="url">
    <s:param name="id" value="11"/>
</s:url>

<s:property value="#url"/>
</body>
</html>
