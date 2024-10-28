//package br.com.context.filter;
//
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
//@WebFilter
//public class ContextFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//        System.out.println("init");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destroy");
//    }
//}
