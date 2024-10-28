//package br.com.context.controller;
//
//import br.com.context.config.amazon.sns.publisher.SnsPublisherServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping()
//public class Controller {
//
//    @Autowired
//    private SnsPublisherServiceImpl snsPublisherService;
//
//    @RequestMapping(method = {RequestMethod.POST})
//    public ResponseEntity<String> publisher() {
//        String publisher = snsPublisherService.publisher();
//        return ResponseEntity.ok().body(publisher);
//    }
//}
