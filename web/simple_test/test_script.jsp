<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 09/01/2017
  Time: 9:39 AM
  测试 JSP 脚本语句的使用
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%--声明变量(成员变量)--%>
<%! String name = "hahaha"; %>

<%--表达式输出--%>
<%= name + "_suffix"%>

<%--scriptlet 测试--%>
<%
    String testStr = "I am";
    String strStudent = "a stuedent";
    out.print(testStr + strStudent);
%>
</body>
</html>
