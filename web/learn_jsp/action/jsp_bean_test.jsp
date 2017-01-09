<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 09/01/2017
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

    <jsp:useBean id="userOne" class="com.ssthouse.bean.User" scope="session"/>
    <jsp:setProperty name="userOne" property="name" value="ssthouse_one"/>
    <jsp:setProperty name="userOne" property="age" value="21"/>

    <p>用户信息为:</p>
    <jsp:getProperty name="userOne" property="name"/>
    <jsp:getProperty name="userOne" property="age"/>

</body>
</html>
