package com.soapclient;

//package com.concretepage;
//
//import com.concretepage.wsdl.GetArticleByIdResponse;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class RunSoapClient {
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(ClientAppConfig.class);
//        ctx.refresh();
//        
//        StudentClient studentClient = ctx.getBean(StudentClient.class);
//        System.out.println("For Student Id: 1");
//        
//        GetArticleByIdResponse response = studentClient.getStudentById(1);
//        
//        System.out.println("Name:" + response.getArticleInfo().getTitle());
//        System.out.println("Age:" + response.getArticleInfo().getCategory());
//        System.out.println("Class:" + response.getArticleInfo().getArticleId());
//    }
//}
