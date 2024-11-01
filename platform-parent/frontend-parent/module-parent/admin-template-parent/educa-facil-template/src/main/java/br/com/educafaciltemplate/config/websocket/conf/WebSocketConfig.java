package br.com.educafaciltemplate.config.websocket.conf;

import br.com.educafaciltemplate.config.websocket.mensagem.MensagemWebSocketHandler;
import br.com.educafaciltemplate.config.websocket.menu.MenuWebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    private MensagemWebSocketHandler mensagemWebSocketHandler;
    
    @Autowired
    private MenuWebSocketHandler menuWebSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(mensagemWebSocketHandler, "/mensagem");
        registry.addHandler(menuWebSocketHandler, "/menu");
    }
}
