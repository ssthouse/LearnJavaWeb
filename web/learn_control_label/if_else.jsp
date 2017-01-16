<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn If Else label</title>
</head>
<body>
<s:if test="'A' in {'A', 'B', 'C'}">
    A is in the list!
</s:if>
<s:elseif test="1 == 3">
    1 == 3 !
</s:elseif>
<s:else>
    this is in the else!
</s:else>
</body>
</html>
