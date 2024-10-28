//package br.com.context.config.amazon.sns.publisher;
//
//import com.amazonaws.services.sns.AmazonSNS;
//import com.amazonaws.services.sns.model.PublishResult;
//import com.amazonaws.services.sns.model.Topic;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SnsPublisherServiceImpl {
//
//    @Autowired
//    private AmazonSNS amazonSNS;
//
//    @Autowired
//    private Topic topic;
//
//    public String publisher() {
//
//        String topicArn = topic.getTopicArn();
//
//        PublishResult publish = amazonSNS.publish(topicArn, "Text-plan");
//        String messageId = publish.getMessageId();
//        return messageId;
//    }
//}
