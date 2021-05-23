<%--
  Created by IntelliJ IDEA.
  User: mmkle
  Date: 07.05.2021
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles/style.css">
    <title>Войти</title>
</head>
<body>
<div class="block">
    <h2 align="center" style="padding-bottom: 20px">Войти</h2>
    <table class = "table">
        <form action = "/lab6/login" method="get">
            <tr>
                <td align = "center">
                    <label for="login">Логин</label>
                    <input type="text" name="login" id="login">
                </td>
            </tr>
            <tr>
                <td align = "center">
                    <label for="pass">Пароль</label>
                    <input type="text" name="pass" id="pass">
                </td>
            </tr>
            <tr>
                <td align = "center">
                    <p style="color: red">${message}</p>
                </td>
            </tr>
            <tr>
                <td align = "center">
                    <input type="submit" value="Отправить">
                </td>
            </tr>
        </form>
    </table>
</div>
</body>
</html>
