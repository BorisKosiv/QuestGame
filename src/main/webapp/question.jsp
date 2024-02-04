<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Question Page</title>
</head>
<body>
<form action="game" method="post">
    <p>Is this your first question?</p>
    <input type="radio" name="answer" value="yes" checked> Yes
    <input type="radio" name="answer" value="no"> No
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>

