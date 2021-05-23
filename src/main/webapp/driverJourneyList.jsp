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
    <title>Информация по водителю(список рейсов)</title>
</head>
<body>
    <div style="padding: 10px">
        <h1 align="center">Информация по водителю(список рейсов)</h1>
        <table class="table">
        	<th>Рег. номер машины</th>
        	<th>Номер заявки</th>
        	<th>Статус поездки</th>
        	<th>Состояние машины</th>
            <c:forEach items="${list}" var="el">
                <tr>
                    <td>${el.regNum}</td>
                    <td>${el.requestId}</td>
                    <td>${el.isFinish}</td>
                    <td>${el.carState}</td>
                </tr>
            </c:forEach>
        </table>
        <div id="link" class="link__back"><a href="/lab6/menu">Назад</a></div>
    </div>
</body>
</html>