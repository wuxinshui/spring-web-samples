<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" href="${contextPath}/css/bootstrap.css"/>
</head>
<body>
<h2>Hello World!</h2>

<form action="login" method="POST">
   <label>用户名：</label> <input name="username" id="username" type="text"/>
   <label>密码：</label> <input name="password" id="password" type="password"/><br><br><br><br>
    <input type="submit" name="提交" id="submit-btn" value="提交" class="btn-group-lg" style="width:60px;height: 20px"/>
</form>

</body>
</html>
