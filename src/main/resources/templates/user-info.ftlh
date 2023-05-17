<!DOCTYPE html>
<html>
<head>
    <title>TRSOFT</title>
</head>
<body>
<h1>TRSOFT</h1><hr>
<h4>Подробная информация о пользователе</h4>
<b>Фамилия: </b>${user.lastName}<br>
<b>Имя: </b>${user.name}<br>
<b>Отчество: </b>${user.surname}<br>
<b>Дата рождения: </b>${user.dateOfBirthday}<br>
<b>Email: </b>${user.email}<br>
<b>Номер телефона: </b>${user.phoneNumber}<br>
<hr>
<form action="/users/delete/${user.id}" method="post">
    <input type="submit" value="Удалить пользователя"/>
</form>
</body>
</html>