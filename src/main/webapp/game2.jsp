<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.company.questgame.game.question.Question" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>

    <title> UFO ENCOUNTER</title>
</head>
<body>
<% Question question = (Question) session.getAttribute("question"); %>

<p>
<h1>  <%= question.getTitleEng() %> </h1>
</p>

<form action="/gameover" method="post">

    <input type="radio" name="answer" value="yes" checked> Так
    <input type="radio" name="answer" value="no"> Ні
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
