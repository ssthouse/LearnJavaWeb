<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  users: ssthouse
  Date: 15/01/2017
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List result</title>
</head>
<body>

<center>
    Name: <s:property value="users[0].name"/>
    Age: <s:property value="users[0].age"/>
    Tel: <s:property value="users[0].tel"/>
    <br/>
    Name: <s:property value="users[1].name"/>
    Age: <s:property value="users[1].age"/>
    Tel: <s:property value="users[1].tel"/>
</center>
</body>
</html>
