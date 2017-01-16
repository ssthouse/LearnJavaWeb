<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<s:bean name="com.action.learn_data_label.User" var="user">
    <s:param name="age" value="22"/>
    <s:param name="title" value="'ssthouse'"/>
</s:bean>

<s:if test="#user.age > 20">
    <s:property value="#user.age"/><br/>
</s:if>

<s:bean name="com.action.learn_data_label.User" var="user_one">
    <s:param name="title" value="'weiuhffiweu'"/>
</s:bean>
<s:property value="#user_one.title"/>

</body>
</html>
