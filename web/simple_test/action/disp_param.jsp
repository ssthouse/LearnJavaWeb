<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 09/01/2017
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<%
    String userName = request.getParameter("username");
    String ageStr = request.getParameter("age");
%>

<%= "用户名为: " + userName%>
<%= "年龄为: " + ageStr%>
</body>
</html>
