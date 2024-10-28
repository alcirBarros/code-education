package br.com.educafaciltemplate.config.websocket.mensagem;

import br.com.template.scoped.ConfigurableBeanFactory;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.PostConstruct;
import org.json.JSONObject;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_APPLICATION)
public class MensagemWebSocketHandler extends TextWebSocketHandler {

    private static final Charset UTF8 = StandardCharsets.UTF_8;
    private final ConcurrentMap<String, WebSocketSession> allClients = new ConcurrentHashMap<>();
    
    @PostConstruct
    public void init(){
        System.out.println("br.com.controller.config.SocketTextHandler.init()");
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("com.javainuse.websocket.config.SocketTextHandler.afterConnectionEstablished()");
        session.sendMessage(new TextMessage("SERVIDOR-CONECTED, " + session.getId() + "!"));
        allClients.put(session.getId(), session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("com.javainuse.websocket.config.SocketTextHandler.afterConnectionClosed()");
        allClients.remove(session.getId());
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("com.javainuse.websocket.config.SocketTextHandler.handleTransportError()");
        session.close(CloseStatus.SERVER_ERROR);
        allClients.remove(session.getId());
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws InterruptedException, IOException {
        try {
            String payload = message.getPayload();
            byte[] bytes = payload.getBytes(UTF8);

            System.out.println(payload);
            JSONObject jsonObject = new JSONObject(payload);

            String string = jsonObject.getString("message");

            for (WebSocketSession webSocketSession : allClients.values()) {
                webSocketSession.sendMessage(new TextMessage(string));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
