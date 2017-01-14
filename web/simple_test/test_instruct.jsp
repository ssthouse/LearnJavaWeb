<%--
  Created by IntelliJ IDEA.
  User: ssthouse
  Date: 09/01/2017
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>

<%--test using page --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--这里语法可能已经改变了... 书上可能没有更新--%>
<%@ page import="java.util.*, java.io.*" %>

<html>
<head>
    <title></title>
</head>
<body>

<%--测试 include 指令--%>
<%@include file="test.txt"%>
<%@ include file="simple.jsp"%>


<%--测试 taglib  ===> 这里 taglib 路径也变了... 无法识别--%>
<%--<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
</body>
</html>
