<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>学生申请科室</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/styroom/applyRoom">
    <table>
        <tr>
            <td>你申请的科室rid</td>
            <td>你的学号</td>
            <td>申请时间</td>
            <td>申请天数</td>
        </tr>
        <tr>
            <td><input type="text" name="rid" readonly="true" value="${middle}"></td>
            <td><input type="text" name="sid"></td>
            <td><input type="text" name="applyTime"></td>
            <td><input type="text" name="returnTime"></td>
            <td><input type="submit" value="确认申请" onclick="return confirm('你已经提交申请')"></td>
        </tr>
    </table>
</form>
</body>
</html>