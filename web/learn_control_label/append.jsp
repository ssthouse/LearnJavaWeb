<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:append var="newList">
    <s:param value="{'A', 'B', 'C'}"/>
    <s:param value="{'1', '2', '3'}"/>
</s:append>

<s:iterator value="%{#newList}" var="item">
    <s:property value="item"/>
</s:iterator>

</body>
</html>
