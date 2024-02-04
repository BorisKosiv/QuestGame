package com.company.questgame.filter;
import com.company.questgame.game.Player;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/game")
public class GameFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig)  {
        System.out.println("GameFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //String lang = request.getParameter("lang");

            Player player = new Player();
            HttpSession session = request.getSession();
          //session.setAttribute("lang", lang);
            session.setAttribute("player", player);
            request.getRequestDispatcher("/game").forward(request, response);
            filterChain.doFilter(request, response);


    }

    @Override
    public void destroy() {

    }
}