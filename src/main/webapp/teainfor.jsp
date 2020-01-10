<%--
  Created by IntelliJ IDEA.
  User: Tdocm
  Date: 2020/1/6
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<% pageContext.setAttribute("ctx" , request.getContextPath());%>
<html>
<head>
    <title>Teacher</title>
</head>
<body>
you are a teacher!!
${requestScope.teaId}<br>
${requestScope.teaName}<br>
${requestScope.gender}<br>
${requestScope.age}<br>
${requestScope.depId}<br>
${requestScope.email}<br>
${requestScope.regTime}<br>
${requestScope.lastLogTime}<br>
<form action="${ctx}/unknown/logout">
    <button>注销</button>
</form>
<form action="http://localhost:8080/winter/handleask.jsp">
    <button>请假</button>
</form>
</body>
</html>
