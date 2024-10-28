package br.com.web.configuracao.websocket.messaging;

public class Notification {

    private String message;

    public Notification(String content) {
        this.message = content;
    }

    public String getContent() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
