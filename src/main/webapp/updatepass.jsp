<%--
  Created by IntelliJ IDEA.
  User: Tdocm
  Date: 2020/1/7
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<% pageContext.setAttribute("ctx" , request.getContextPath());%>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="${ctx}/unknown/updatepass">
    <input type="text" name="password">密码<br>
    <input type="text" name="cfmPassword">确认密码<br>
    <button>提交</button>
    ${requestScope.msg}<br>
</form>

</body>
</html>
