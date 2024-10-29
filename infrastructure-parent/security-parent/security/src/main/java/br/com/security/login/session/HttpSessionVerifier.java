//package br.com.security.login.session;
//
//import java.util.Date;
//import java.util.logging.Logger;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSessionEvent;
//import javax.servlet.http.HttpSessionListener;
//
//public class HttpSessionVerifier implements HttpSessionListener {
//
//    private final static Logger LOGGER = Logger.getLogger(HttpSessionVerifier.class.getName());
//    
//    @Override
//    public void sessionCreated(HttpSessionEvent event) {
//        Date sessionCreationTime = new Date(event.getSession().getCreationTime());
//        Date sessionLastAccessedTime = new Date(event.getSession().getLastAccessedTime());
//        int sessionMaxInactiveInterval = event.getSession().getMaxInactiveInterval();
//        LOGGER.warning("Session: " + event.getSession().getId()
//                + " createTime: " + sessionCreationTime
//                + " lastAccess: " + sessionLastAccessedTime
//                + " with maxInactiveInterval: " + sessionMaxInactiveInterval
//                + " created.");
//    }
//
//    @Override
//    public void sessionDestroyed(HttpSessionEvent event) {
//        Date sessionCreationTime = new Date(event.getSession().getCreationTime());
//        Date sessionLastAccessedTime = new Date(event.getSession().getLastAccessedTime());
//        int sessionMaxInactiveInterval = event.getSession().getMaxInactiveInterval();
//        LOGGER.warning("Session: " + event.getSession().getId()
//                + " createTime: " + sessionCreationTime
//                + " lastAccess: " + sessionLastAccessedTime
//                + " with maxInactiveInterval: " + sessionMaxInactiveInterval
//                + " destroyed.");
//    }
//
//    private void extractUserInformation(HttpServletRequest request, String url) {
//
//        String userAddr = request.getRemoteAddr();
//        String sessionID = request.getSession().getId();
//        Date sessionCreationTime = new Date(request.getSession().getCreationTime());
//        Date sessionLastAccessedTime = new Date(request.getSession().getLastAccessedTime());
//        int sessionMaxInactiveInterval = request.getSession().getMaxInactiveInterval();
//
//        LOGGER.warning("Page"
//                + "; url:" + url
//                + "; sessionID:" + sessionID
//                + "; created:" + sessionCreationTime
//                + "; lastAccessed:" + sessionLastAccessedTime
//                + "; inactiveInterval:" + sessionMaxInactiveInterval
//                + "; userIp:" + userAddr
//                + ";");
//    }
//}
