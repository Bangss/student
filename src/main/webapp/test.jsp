<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="param/login" method="post">
    <input type="text" name="name">
    <input type="password" name="password">
    <button>login</button>
</form>
<form action="param/t01" method="get">
    <input type="text" name="abc">
    <input type="password" name="password">
    <button>t01</button>
</form>
<form action="param/t01" method="get">
    <input type="text" name="abc">
    <button>t01，没有password参数</button>
</form>
<form action="param/t01" method="get">
    <input type="text" name="name">
    <button>t01，没有abc这个参数</button>
</form>
<a href="param/t02?abc=123">测试t02</a>
<a href="param/t03">测试t03</a>
<% Cookie[] cs = request.getCookies();
    for (Cookie item : cs) {
        String name = item.getName();
        if(name.equals("JSESSIONID")) {
            String value = item.getValue();
            System.out.println("原生代码JSESSIONID:::" + value);
        }
    }
    //Cookie: JSESSIONID=ED98DB61BF8CA230540FCC5E90F8C8AD
%>
<form action="param/t04" method="post">
    <input type="text" name="id">
    <input type="text" name="username">
    <input type="number" name="age">
    <button>测试t04，使用pojo</button>
</form>
<form action="param/t04" method="post">
    <input type="text" name="id">
    <input type="text" name="username">
    <button>测试t04，使用pojo，少一个age属性</button>
</form>
</body>
</html>