<!DOCTYPE html>
<html>
<head>
    <title>TRSOFT</title>
</head>
<body>
<h1>TRSOFT</h1><hr>
<h4>Made by Averin Ivan</h4>
<form action="/" method="get">
    Поиск пользователя по email: <input type="text" name="email"><br>
    <input type="submit" value="Поиск"/>
</form>
<#list users as user>
    <div>
        <p><b>${user.email}</b> ${user.phoneNumber} | <a href="/users/${user.id}">Подробная информация о пользователе...</a></p>
    </div>
    <#else>
    <h3>Пользователей нет :(</h3>
</#list>
<hr>
<h3>Создать нового пользователя</h3>
<form action="/users/create" method="post">
    Фамилия: <input type="text" name="lastName"/><br><br>
    Имя: <input type="text" name="name"/><br><br>
    Отчество: <input type="text" name="surname"/><br><br>
    Дата рождения: <input type="text" name="dateOfBirthday"/><br><br>
    Email: <input type="text" name="email"/><br><br>
    Номер телефона: <input type="text" name="phoneNumber"/><br><br>
    <input type="submit" value="Создать пользователя"/>
</form>
</body>
</html>