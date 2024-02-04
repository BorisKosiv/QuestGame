<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.company.questgame.game.question.Question" %>
<%@ page import="java.util.List" %>
<%@ page import="com.company.questgame.game.Player" %>
<%@page import="javax.servlet.http.HttpSession" %>



<html>
<head>
    <title>UFO ENCOUNTER</title>

    <link rel="stylesheet" href="css/style.css" type="text/css">
    <script type="text/javascript" src="script/script.js"></script>
</head>
<body class="game-body">
    <%

        Question question = (Question) session.getAttribute("question");
        List<Question> nextQuestions = (List<Question>) session.getAttribute("nextQuestions");

%>

<div class="question-box">
    <p>
        <%= question.getTitleEng() %>
    </p>

    <% if (nextQuestions != null && !nextQuestions.isEmpty()) { %>
    <form method="GET">
        <label>
            <input type="radio" name="answer" value='<%= nextQuestions.get(0).getValue() %>' checked>
            <%= nextQuestions.get(0).getTextEng() %>
        </label>
        <br>
        <br>
        <label>
            <input type="radio" name="answer" value='<%= nextQuestions.get(1).getValue() %>'>
            <%= nextQuestions.get(1).getTextEng() %>
        </label>
        <br>
        <br>
        <br>
        <br>
        <label>
            <button type="submit" class="submit-button">
                Next
            </button>
        </label>
    </form>
    <% } %>
</div>

    <%
    if (nextQuestions == null || nextQuestions.isEmpty()) {
%>
<div class="restart-container">
    <button onclick="redirectToWelcome()">
        Restart
    </button>
</div>
    <%
    }
%>

</body>
</html>
