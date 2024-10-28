//package br.com.web.configuracao.websocket.controller;
//
//import br.com.web.configuracao.websocket.messaging.Greeting;
//import br.com.web.configuracao.websocket.messaging.HelloMessage;
//import br.com.web.configuracao.websocket.messaging.Notification;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import javax.annotation.PostConstruct;
//import javax.servlet.http.HttpSession;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.messaging.handler.annotation.DestinationVariable;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class MainController {
//
//    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
//
//    @Autowired
//    private HttpSession session;
//
////    @Autowired
////    private NotificationService notificationService;
//    @Autowired
//    private SimpMessagingTemplate simpMessagingTemplate;
//
//    @PostConstruct
//    public void ini() {
//        Notification notification = new Notification("Conectando...");
//
//        simpMessagingTemplate.convertAndSend("/topic/queue/notify", notification);
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "/some-action", method = RequestMethod.POST)
//    public void someAction() {
//        Notification notification = new Notification("hello");
//        simpMessagingTemplate.convertAndSend("/topic/queue/notify", notification);
//    }
//
//    @MessageMapping("/hello/{user}")
//    @SendTo("/topic/greetings")
//    public Greeting greeting(HelloMessage message, @DestinationVariable("user") String user) throws Exception {
//        Notification notification = new Notification(message.getName());
//        simpMessagingTemplate.convertAndSend("/topic/queue/notify", notification);
//        return new Greeting(message.getName());
//    }
//
////    @MessageMapping("/hello/{chatRoomId}")
////    public void handleChat(@Payload ChatMessage message, @DestinationVariable("chatRoomId") String chatRoomId, MessageHeaders messageHeaders, Principal user) {
////        logger.info(messageHeaders.toString());
////        simpMessagingTemplate.convertAndSend("/topic/chats." + chatRoomId, "[" + getTimestamp() + "]:" + user.getName() + ":" + message.getMessage());
////    }
//    private String getTimestamp() {
//        LocalDateTime date = LocalDateTime.now();
//        return date.format(DateTimeFormatter.ISO_DATE_TIME);
//    }
//
//}
