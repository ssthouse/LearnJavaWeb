<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 10/01/2017
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%
    String username = request.getParameter("username");
    if (username == null || username.length() == 0) {
        response.sendRedirect("http://baidu.com");
    }else{
        response.getWriter().write(username);
    }
%>

</body>
</html>
