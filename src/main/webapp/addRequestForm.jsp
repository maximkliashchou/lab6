<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles/style.css">
    <title>Заказать поездку</title>
</head>
<body>
    <div class="block">
        <h2 align="center" style="padding-bottom: 20px">Заказать поездку</h2>
        <div align="center">
            <form action="/lab6/requests" method="get">
                <label for="capability">Мин. вместительность</label>
                <input type="text" name="capability" id="capability">
                <label for="cost">Макс. стоимость</label>
                <input type="text" name="cost" id="cost">
                <input type="submit" value="Отправить">
            </form>
        </div>
        <div id="link" class="link__back"><a href="/lab6/menu">Назад</a></div>
    </div>
</body>
</html>