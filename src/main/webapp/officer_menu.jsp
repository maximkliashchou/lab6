<%--
  Created by IntelliJ IDEA.
  User: mmkle
  Date: 04.05.2021
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles/style.css">
    <title>Автопарк</title>
</head>
<body>

<div class="block">
    <h2 align="center" style="padding-bottom: 20px">Автопарк</h2>
    <table class = "table">
        <tr>
            <td align = "center">
                <a href = "/lab6/driver-add/form">Добавить водителя</a>
            </td>
        </tr>
        <tr>
            <td align = "center">
                <a href = "/lab6/car-add/form">Добавить автомобиль</a>
            </td>
        </tr>

        <tr>
            <td align = "center">
                <a href = "/lab6/journeys/list">Список рейсов</a>
            </td>
        </tr>

        <tr>
            <td align = "center">
                <a href = "/lab6/driver-journey/form">Информация по водителю(список рейсов)</a>
            </td>
        </tr>

        <tr>
            <td align = "center">
                <a href = "/lab6/cars/list">Автомобили в ремонте</a>
            </td>
        </tr>
    </table>
</div>

</body>
</html>