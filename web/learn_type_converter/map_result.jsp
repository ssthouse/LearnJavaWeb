<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 'second'5/'fist''second'/2'fist''second'7
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<center>
        Name: <s:property value="mUserMap['fist'].name"/>
    Age: <s:property value="mUserMap['fist'].age"/>
    Tel: <s:property value="mUserMap['fist'].tel"/>
    <br/>
    Name: <s:property value="mUserMap['second'].name"/>
    Age: <s:property value="mUserMap['second'].age"/>
    Tel: <s:property value="mUserMap['second'].tel"/>
</center>

</body>
</html>
