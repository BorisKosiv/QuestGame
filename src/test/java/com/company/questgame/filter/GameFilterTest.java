package com.company.questgame.filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import static org.mockito.Mockito.*;

class GameFilterTest {

    @Test
    void testDoFilterWithLangParameter() throws Exception {
        // Arrange
        GameFilter gameFilter = new GameFilter();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);
        ServletContext context = Mockito.mock(ServletContext.class);

        when(request.getParameter("lang")).thenReturn("en");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/game")).thenReturn(dispatcher);
        when(request.getServletContext()).thenReturn(context);

        // Act
        gameFilter.doFilter((ServletRequest) request, (ServletResponse) response, (javax.servlet.FilterChain) filterChain);

        // Assert
        verify(filterChain).doFilter(request, response);
    }


    @Test
    void testDoFilterWithoutLangParameter() throws Exception {
        // Arrange
        GameFilter gameFilter = new GameFilter();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);

        when(request.getParameter("lang")).thenReturn(null);

        // Act
        gameFilter.doFilter((ServletRequest) request, (ServletResponse) response, (javax.servlet.FilterChain) filterChain);

        // Assert
        verify(request, never()).getSession(); // Ensure that getSession is not called
        verify(filterChain).doFilter(request, response);
    }
}