<%@ page language="java" contentType="text/html; charset = UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Quest Game">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
    <title>Quest Game</title>
</head>
<body>
    <h1>WELCOME TO QUEST GAME</h1>
    <h1>UFO ENCOUNTER</h1>

    <form action="<%= "/game" %>" method="get">
         <input type="submit" value="Start Game">
    </form>
</body>
</html>
