<%@ page import="java.util.Enumeration" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 10/01/2017
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<%
    //打印所有参数
    Enumeration<String> paramNames = request.getParameterNames();
    while (paramNames.hasMoreElements()) {
        String paramName = paramNames.nextElement();
        out.println(paramName);
        out.println(request.getParameter(paramName));
    }
    //打印客户端信息
    out.println(request.getHeader("User-Agent"));
    out.println(request.getHeader("Accept"));
%>

</body>
</html>
