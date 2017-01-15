<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 15/01/2017
  Time: 8:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn data validate</title>
</head>
<body>

<center>
    <s:form action="learn_data_validate/login">
        <s:textfield name="name" label="Name:"/>
        <s:textfield name="age" label="Age:"/>
        <s:textfield name="tel" label="Tel"/>
        <s:submit method="log"/>
    </s:form>
</center>
</body>
</html>
