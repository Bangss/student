<%--
  Created by IntelliJ IDEA.
  User: Tdocm
  Date: 2020/1/8
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<% pageContext.setAttribute("ctx" , request.getContextPath());%>
<html>
<head>
    <title>请假</title>
</head>
<body>
    <form action="${ctx}/ask/ask" method="post">
        <input type="text" name="reason">请假原因<br>
        <button>提交申请</button>
    </form>
</body>
</html>
