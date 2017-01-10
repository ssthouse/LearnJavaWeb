<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 10/01/2017
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%
    int allBuf = out.getBufferSize();
    int remain = out.getRemaining();
    String outStr = String.format("allbuf: %d : remain: %d", allBuf, remain);
    out.println(outStr);
%>
</body>
</html>
