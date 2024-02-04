package com.company.questgame.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GameOverServlet", urlPatterns = "/gameover")

public class GameOverServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

        String answer = request.getParameter("answer");
        if (answer != null && !answer.isEmpty()) {
            request.setAttribute("answer", answer);
        }
        assert answer != null;
        if (answer.equals("yes")){
        request.getRequestDispatcher("gameover.jsp").forward(request, response);
    }
        else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
