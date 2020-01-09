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
<form action="${ctx}/student/register" method="post">
    <input type="text" name="stuName">姓名<br>
    <input type="text" name="gender">性别<br>
    <input type="text" name="age">年龄<br>
    <input type="text" name="depId">学院<br>
    <input type="text" name="email">邮箱<br>
    <button>提交</button>
    ${requestScope.msg}<br>
</form>

</body>
</html>
