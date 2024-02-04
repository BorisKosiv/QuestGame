<%@ page import="com.company.questgame.game.question.Question" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
    <title>THE GAME IS OVER</title>
</head>
<body>
<% Question question = (Question) session.getAttribute("question"); %>

<p>
   <h2> <%= question.getTextEng() %> </h2>
</p>

    <h1>THE GAME IS OVER</h1>

    <a href="/">RESTART THE GAME</a>


</body>
</html>
