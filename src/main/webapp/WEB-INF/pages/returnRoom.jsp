<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>学生才有</title>
</head>
<body>
6666666666
<table>
    <c:forEach items="${returnRoom}" var="l">
        <tr>
            <td>${l.rid}</td>
            <td>${l.rname}</td>
            <td>${l.isEmpty}</td>
            <td>${l.useBySid}</td>
            <td>${l.signUpTid}</td>
            <td>${l.applyTime}</td>
            <td>${l.returnTime}</td>
            <td><a href="${pageContext.request.contextPath }/styroom/returnRoom?rid=${l.rid}" >确认离开</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>