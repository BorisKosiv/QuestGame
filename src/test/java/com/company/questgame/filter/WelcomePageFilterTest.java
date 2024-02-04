package com.company.questgame.filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import static org.mockito.Mockito.*;

class WelcomePageFilterTest {

    @Test
    void testDoFilter() throws Exception {
        // Arrange
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);
        FilterConfig filterConfig = mock(FilterConfig.class);

        WelcomePageFilter welcomePageFilter = new WelcomePageFilter();
        welcomePageFilter.init((javax.servlet.FilterConfig) filterConfig);

        // Act
        welcomePageFilter.doFilter((ServletRequest) request, (ServletResponse) response, (javax.servlet.FilterChain) filterChain);

        //Assert
        verify(response).sendRedirect("/index");
        verify(filterChain, never()).doFilter(Mockito.any(), Mockito.any());
    }

}