package br.com.educafaciltemplate.config.websocket.menu;

import br.com.context.configuracao.ConfiguracaoProjeto;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_APPLICATION)
public class MenuWebSocketHandler extends TextWebSocketHandler {

    @Autowired(required = false)
    private List<ConfiguracaoProjeto> configuracaoProjetoList;

    private List<WebSocketSession> list = new ArrayList();

    @PostConstruct
    public void init() {
        System.out.println("br.com.controller.config.SocketTextHandler.init()");
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        try {
            System.out.println("com.javainuse.websocket.config.SocketTextHandler.afterConnectionEstablished()");

//        List<ConfiguracaoProjeto> configuracaoProjetoList = new ArrayList<>();
//        ConfiguracaoService configuracaoService = new ConfiguracaoService();
//        configuracaoProjetoList.add(configuracaoService);
//
//        String toJson = new Gson().toJson(configuracaoService);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            stringBuilder.append("        \"items\": [");
            stringBuilder.append("            {");
            stringBuilder.append("                \"home\": \"Home\",");
            stringBuilder.append("                \"itens\": [");
            stringBuilder.append("                    {");
            stringBuilder.append("                        \"separador\": \"Menu\",");
            stringBuilder.append("                        \"itens\": [");

            if (configuracaoProjetoList != null) {

                for (ConfiguracaoProjeto configuracaoProjeto : configuracaoProjetoList) {

                    String titulo = configuracaoProjeto.getConfiguracao().getTitulo();

                    stringBuilder.append("                            {");
                    stringBuilder.append("                                \"menuTitle\": \"").append(titulo).append("\",");
                    stringBuilder.append("                                \"styleClasseArray\": [\"fa\", \"fa-dashboard\"],");

                    stringBuilder.append("                                \"styleClasseInfoArray\": [");
                    stringBuilder.append("                                    {");
                    stringBuilder.append("                                        \"info\": 12,");
                    stringBuilder.append("                                        \"styleClasse\": [\"label\", \"pull-right\", \"bg-yellow\"]");
                    stringBuilder.append("                                    },");
                    stringBuilder.append("                                    {");
                    stringBuilder.append("                                        \"info\": 16,");
                    stringBuilder.append("                                        \"styleClasse\": [\"label\", \"pull-right\", \"bg-green\"]");
                    stringBuilder.append("                                    },");
                    stringBuilder.append("                                    {");
                    stringBuilder.append("                                        \"info\": 5,");
                    stringBuilder.append("                                        \"styleClasse\": [\"label\", \"pull-right\", \"bg-red\"]");
                    stringBuilder.append("                                    }");
                    stringBuilder.append("                                ],");

                    stringBuilder.append("                                \"menuArray\": [");
                    stringBuilder.append("                                    {");
                    stringBuilder.append("                                        \"menuTitle\": \"Cadastro\",");
                    stringBuilder.append("                                        \"link\": \"/web/pages/private/pessoa/pessoa.xhtml\",");
                    stringBuilder.append("                                        \"styleClasseArray\": [\"fa\", \"fa-circle-o\"]");
                    stringBuilder.append("                                    }");
                    stringBuilder.append("                                ]");
                    stringBuilder.append("                            },");

                    stringBuilder.append("                            {");
                    stringBuilder.append("                                \"menuTitle\": \"Atendimento\",");
                    stringBuilder.append("                                \"styleClasseArray\": [\"fa\", \"fa-edit\"],");
                    stringBuilder.append("                                \"styleClasseInfoArray\": [");
                    stringBuilder.append("                                    {");
                    stringBuilder.append("                                        \"info\": \"Novo\",");
                    stringBuilder.append("                                        \"styleClasse\": [\"label\", \"pull-right\", \"bg-green\"]");
                    stringBuilder.append("                                    }");
                    stringBuilder.append("                                ],");
                    stringBuilder.append("                                \"menuArray\": [");
                    stringBuilder.append("                                    {");
                    stringBuilder.append("                                        \"menuTitle\": \"Anamnese\",");
                    stringBuilder.append("                                        \"link\": \"/web/pages/private/anamnese/anamnese.xhtml\",");
                    stringBuilder.append("                                        \"styleClasseArray\": [\"fa\", \"fa-circle-o\"]");
                    stringBuilder.append("                                    }");
                    stringBuilder.append("                                ]");
                    stringBuilder.append("                            }");

                }
            }

            stringBuilder.append("                        ]");
            stringBuilder.append("                    }");
            stringBuilder.append("                ]");
            stringBuilder.append("            }");
            stringBuilder.append("        ]");
            stringBuilder.append("}");
            TextMessage textMessage = new TextMessage(stringBuilder.toString());
            session.sendMessage(textMessage);
            list.add(session);
        } catch (IOException ex) {
            Logger.getLogger(MenuWebSocketHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
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
