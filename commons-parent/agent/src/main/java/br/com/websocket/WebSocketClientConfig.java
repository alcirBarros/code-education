//package br.com.websocket;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.client.WebSocketClient;
//import org.springframework.web.socket.client.WebSocketConnectionManager;
//import org.springframework.web.socket.client.standard.StandardWebSocketClient;
//
//@Configuration
//public class WebSocketClientConfig {
//
//    private static String URL = "ws://192.168.0.12:8282/pessoa/mensagem";
//
//    @Bean
//    public WebSocketConnectionManager webSocketConnectionManager() {
//        WebSocketClient webSocketClient = webSocketClient();
//        WebSocketHandler webSocketHandler = webSocketHandler();
//        WebSocketConnectionManager manager = new WebSocketConnectionManager(webSocketClient, webSocketHandler, URL);
//        manager.setAutoStartup(true);
//        return manager;
//    }
//
//    @Bean
//    public WebSocketClient webSocketClient() {
//        return new StandardWebSocketClient();
//    }
//
//    @Bean
//    public WebSocketHandler webSocketHandler() {
//        return new MyStompSessionHandler();
//    }
//}