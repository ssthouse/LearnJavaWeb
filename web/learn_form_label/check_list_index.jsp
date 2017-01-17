<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 17/01/2017
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<s:form action="check_list" namespace="learn_from_label">
    <s:checkboxlist name="characters" list="#{'a':'1', 'b':'2', 'c':'3'}"/>
    <s:checkboxlist list="{'football', 'basketball', 'volleyball', 'swimming'}" name="interests"/>
    <s:submit/>
</s:form>
</body>
</html>
