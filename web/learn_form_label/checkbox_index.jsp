<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 17/01/2017
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:form action="checkbox" namespace="learn_form_label">
    Sex: <s:checkbox label="Male" fieldValue="male" name="sex"/>
    Role: <s:checkbox label="Student" name="isStudent"/>
    <s:submit/>
</s:form>
</body>
</html>
