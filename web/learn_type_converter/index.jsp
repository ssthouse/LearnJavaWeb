<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 15/01/2017
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<center>
    <s:form action="learn_type_converter/list">
        <table>
            <tr>
                <td></td>
                <td>First:</td>
                <td>Second:</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><s:textfield name="users[0].name" theme="simple"/></td>
                <td><s:textfield name="users[1].name" theme="simple"/></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><s:textfield name="users[0].age" theme="simple"/></td>
                <td><s:textfield name="users[1].age" theme="simple"/></td>
            </tr>
            <tr>
                <td>Tel:</td>
                <td><s:textfield name="users[0].tel" theme="simple"/></td>
                <td><s:textfield name="users[1].tel" theme="simple"/></td>
            </tr>
            <tr>
                <td colspan="3"><s:submit/></td>
            </tr>
        </table>
    </s:form>
</center>

</body>
</html>
