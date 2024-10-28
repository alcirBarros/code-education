//package br.com.security.login.session;
//
//import java.io.IOException;
//import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LogoutSuccess extends HttpStatusReturningLogoutSuccessHandler implements LogoutSuccessHandler {
//
//    private final static Logger LOGGER = Logger.getLogger(LogoutSuccessHandler.class.getName());
//
//    @Override
//    public void onLogoutSuccess(final HttpServletRequest request, final HttpServletResponse response, final Authentication authentication) throws IOException, ServletException {
//
//        if (request != null && request.getSession() != null) {
//            LOGGER.warning("Logout handler for session= " + request.getSession().getId());
//        }
//
//        if (authentication != null) {
//            LOGGER.info("User name=" + authentication.getPrincipal());
//        }
//        super.onLogoutSuccess(request, response, authentication);
//    }
//}
