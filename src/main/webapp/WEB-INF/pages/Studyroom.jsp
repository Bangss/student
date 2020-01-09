<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>学生老师都有</title>
</head>
<body>
6666666666666666666666666
<table>
    <c:forEach items="${selAll}" var="l">
       <tr>
           <td>${l.rid}</td>
           <td>${l.rname}</td>
           <td>${l.isEmpty}</td>
           <td>${l.useBySid}</td>
           <td>${l.signUpTid}</td>
           <td>${l.applyTime}</td>
           <td>${l.returnTime}</td>
           <!--<td><a href="${pageContext.request.contextPath }/styroom/deleteOne?rid=${l.rid}" onclick="return confirm('你确定要删除这记录吗')">删除</a></td>-->
       </tr>
    </c:forEach>
</table>
</body>
</html>