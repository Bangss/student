<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
</head>
<body>
<table>
    <c:forEach items="${result}" var="l">
       <td><input value="${l.Rid}"></td>
    </c:forEach>
</table>
</body>
</html>