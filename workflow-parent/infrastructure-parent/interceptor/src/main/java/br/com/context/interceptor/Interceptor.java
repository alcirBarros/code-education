package br.com.context.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;


@Component
public class Interceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    if (handler instanceof ResourceHttpRequestHandler) {
      response.addHeader("Interceptor", "Passou por aqui");
      return true;
    }

    if (handler instanceof HandlerMethod) {
      response.addHeader("Interceptor", "Passou por aqui");

      final AllowAnnonymous allowAnnonymous = ((HandlerMethod) handler).getMethod().getAnnotation((AllowAnnonymous.class));
      if (allowAnnonymous != null) {
        response.addHeader("Interceptor", "Passou por aqui");
        return true;
      }

      if (request.getHeader("Authorization") == null) {
        response.addHeader("Interceptor", "Authorization não enviado");
        return false;
      } else if (request.getHeader("Authorization").equals("Teste")) {
        response.addHeader("Interceptor", "Authorization OK");
        return true;
      } else {
        response.addHeader("Interceptor", "Authorization NOK");
        return false;
      }
    }
    return true;
  }
}