package com.company.questgame.servlet;
import org.junit.jupiter.api.Test;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.mockito.Mockito.when;

class GameOverServletTest {
    @Test
    void testDoPost() throws Exception {
        // Arrange
        HttpServletRequest request = org.mockito.Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = org.mockito.Mockito.mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = org.mockito.Mockito.mock(RequestDispatcher.class);
        javax.servlet.ServletContext context = org.mockito.Mockito.mock(javax.servlet.ServletContext.class);
        when(request.getRequestDispatcher("gameover.jsp")).thenReturn(dispatcher);
        when(request.getServletContext()).thenReturn(context);
        // Act
        new GameOverServlet().doPost((javax.servlet.http.HttpServletRequest) request, (javax.servlet.http.HttpServletResponse) response);
        // Assert
        org.mockito.Mockito.verify(request).getRequestDispatcher("gameover.jsp");
        org.mockito.Mockito.verify(dispatcher).forward(request, response);



        }

}
