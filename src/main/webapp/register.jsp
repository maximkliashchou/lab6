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
    <title>Регистрация</title>
</head>
<body>
    <h2 align="center" style="padding-bottom: 20px">Регистрация</h2>
    <table class = "table">
        <form action="/lab6/register" method="get">
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
                    <label for="roleId">Роль</label>
                    <select size = "1" name = "roleId" id = "roleId">
                        <option value="1">Админ</option>
                        <option value="2">Оператор</option>
                        <option selected value="3">Пользователь</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td align = "center">
                    <p style = "color: red">${message}</p>
                </td>
            </tr>
            <tr>
                <td align = "center">
                    <input type="submit" value="Отправить">
                </td>
            </tr>
        </form>
    </table>
</body>
</html>
