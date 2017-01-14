<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 09/01/2017
  Time: 9:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<p>this is a action test jsp page!</p>

<jsp:include page="../simple.jsp"/>

<jsp:forward page="disp_param.jsp">
    <jsp:param name="username" value="ssthouse"/>
    <jsp:param name="age" value="21"/>
</jsp:forward>

</body>
</html>
