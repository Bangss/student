<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>老师才有</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/styroom/teaDeal">
<table>
    <c:forEach items="${dealRoom}" var="l">
        <tr>
            <td>${l.roomId}</td>
            <td>${l.roomName}</td>
            <td>${l.isEmpty}</td>
            <td>${l.useBySid}</td>
            <td>${l.signUpTid}</td>
            <td>${l.applyTime}</td>
            <td>${l.returnTime}</td>
            <td><a href="${pageContext.request.contextPath }/styroom/teaDeal?rid=${l.roomId}&isEmpty=0">拒绝</a></td>
            <td><a href="${pageContext.request.contextPath }/styroom/teaDeal?rid=${l.roomId}&isEmpty=1">同意</a></td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>