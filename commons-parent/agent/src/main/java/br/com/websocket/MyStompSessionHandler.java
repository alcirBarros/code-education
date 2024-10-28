//package br.com.websocket;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.CloseStatus;
//import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketSession;
//import org.springframework.web.socket.handler.TextWebSocketHandler;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//@Scope("application")
//public class MyStompSessionHandler extends TextWebSocketHandler {
//
//    private final static Map<String, WebSocketSession> allClients = new HashMap<>();
//
//    @Override
//    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
//        TextMessage textMessage = new TextMessage("CLIENT-CONECTED, " + webSocketSession.getId() + "!");
//        webSocketSession.sendMessage(textMessage);
//        allClients.put(webSocketSession.getId(), webSocketSession);
//    }
//
//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
//        System.out.println("com.javainuse.websocket.config.SocketTextHandler.afterConnectionClosed()");
//    }
//
//    @Override
//    public void handleTextMessage(WebSocketSession webSocketSession, TextMessage message) throws IOException {
//        System.out.println(webSocketSession.getId()+ "|" + message);
//    }
//
//    @Override
//    public void handleTransportError(WebSocketSession session, Throwable exception) {
//        System.out.println(exception);
//    }
//
//    public void sendAllMessage(String message) throws IOException {
//        for (WebSocketSession webSocketSession : allClients.values()) {
//            TextMessage textMessage = new TextMessage(message);
//            webSocketSession.sendMessage(textMessage);
//        }
//    }
//}
