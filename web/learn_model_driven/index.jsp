<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 15/01/2017
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<center>
    <s:form action="/learn_model_driven/login">
        <s:textfield label="Name" name="name"/>
        <s:textfield label="Age" name="age"/>
        <s:textfield label="Telephone" name="telephone"/>
        <s:textfield label="Adress" name="address"/>
        <s:submit/>
    </s:form>
</center>

</body>
</html>
