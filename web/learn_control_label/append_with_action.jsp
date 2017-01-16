<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:append var="newList">
    <s:param value="%{mListOne}"/>
    <s:param value="%{mListTwo}"/>
    <s:param value="%{mListThree}"/>
</s:append>
<s:iterator value="%{#newList}">
    <s:property/>
</s:iterator>

</body>
</html>
