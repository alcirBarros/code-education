package com.javainuse.websocket.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketTextHandler extends TextWebSocketHandler {

    private List<WebSocketSession> list = new ArrayList<WebSocketSession>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("com.javainuse.websocket.config.SocketTextHandler.afterConnectionEstablished()");
        list.add(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("com.javainuse.websocket.config.SocketTextHandler.afterConnectionClosed()");
        list.remove(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws InterruptedException, IOException {
        String payload = message.getPayload();
        JSONObject jsonObject = new JSONObject(payload);

        String string = jsonObject.getString("message");

        for (WebSocketSession webSocketSession : list) {
            webSocketSession.sendMessage(new TextMessage(string));
        }
    }

}
