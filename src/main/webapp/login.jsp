<%--
  Created by IntelliJ IDEA.
  User: Tdocm
  Date: 2020/1/6
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
    <% pageContext.setAttribute("ctx" , request.getContextPath());%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/unknown/login" method="post">
    <input type="text" name="id">
    <input type="text" name="password">
    <button>login</button>
    ${requestScope.msg}<br>
    </form>
    <a href="register.jsp">注册</a>
</body>
</html>
