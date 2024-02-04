package com.company.questgame.servlet;
import com.company.questgame.game.Player;
import com.company.questgame.game.question.Question;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(name= "GameServlet",urlPatterns = "/game")
public class GameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       HttpSession session = request.getSession();

        Player player = (Player) session.getAttribute("player");
        String answer = request.getParameter("answer");

        if (answer != null && !answer.isEmpty()) {
            player.nextQuestion(answer);
        }

        Question question = player.getCurrentQuestion();
        List<Question> nextQuestions = player.getNextQuestions();

        session.setAttribute("player", player);
        session.setAttribute("question", question);
        session.setAttribute("nextQuestions", nextQuestions);

        if (Objects.equals(answer,"3")){
            RequestDispatcher dispatcher = request.getRequestDispatcher("game2.jsp");
            dispatcher.forward(request, response);
        }
        else if (Objects.equals(answer,"5")){
            RequestDispatcher dispatcher = request.getRequestDispatcher("game2.jsp");
            dispatcher.forward(request, response);
        }
        else if (Objects.equals(answer,"7")){
            RequestDispatcher dispatcher = request.getRequestDispatcher("game2.jsp");
            dispatcher.forward(request, response);
        }
         else if (Objects.equals(answer,"9")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("game2.jsp");
            dispatcher.forward(request, response);
        }
            else    {
            RequestDispatcher dispatcher = request.getRequestDispatcher("game1.jsp");
            dispatcher.forward(request, response);
        }
    }
}
