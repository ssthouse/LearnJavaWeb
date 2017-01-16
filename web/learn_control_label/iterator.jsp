<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 16/01/2017
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<center>
    <table border="1px" cellpadding="0" cellspacing="0">
        <s:iterator var="name" value="{'HTML', 'JAVA', 'CSS', 'JavaWeb'}" status="st">
            <s:if test="#st.odd">
                <tr style="background-color: aqua">
                    <td><s:property value="name"/></td>
                </tr>
            </s:if>
            <s:else>
                <tr style="background-color: antiquewhite">
                    <td><s:property value="name"/></td>
                </tr>
            </s:else>
        </s:iterator>
    </table>
</center>

</body>
</html>
