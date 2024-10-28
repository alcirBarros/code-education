package br.com.integration.integration.interceptor;

import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;


public class RequestDetailsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
