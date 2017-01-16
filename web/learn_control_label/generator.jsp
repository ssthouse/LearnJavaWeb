<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:generator separator="," val="%{'111,222,333,444'}" count="3">
    <s:iterator>
        <s:property/>
    </s:iterator>
</s:generator>

</body>
</html>
