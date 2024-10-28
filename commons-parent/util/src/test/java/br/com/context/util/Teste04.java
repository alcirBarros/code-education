//package br.com.context.util;
//
//import java.lang.reflect.Field;
//import java.util.Optional;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigInteger;
//import java.time.Duration;
//import java.time.LocalTime;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//
//@SpringBootTest
//@DisplayName("ObservableTest JUnit 5 😀 Kotlin")
//public class Teste04 {
//
//    @Test
//    @DisplayName("Deve realizar com sucesso")
//    public void teste01() {
//
//        LocalTime start = LocalTime.ofSecondOfDay(600);
//
//        LocalTime end = LocalTime.now();
//
//        Duration duration = Duration.between(start, end);
//
//        long nano = Duration.between(start, end).getNano();
//
//        int experian = LocalTime.now().plusNanos(20000).toSecondOfDay();
//
//        int time = LocalTime.now().toSecondOfDay();
//
//        System.out.println(experian < time);
//
//    }
//
//    @Test
//    public void generateDocumentKey() {
//        String PROTOCOL_REGEX = "(http|https)://";
//
//        String domain = "http://localhost";
//        String companyId = "b12e129e-daae-47e3-a2f0-7d7120d34307";
//        String clientId = "6e45254a-b425-4c60-8bfe-2f2a44140e3a";
//        String batchId = "38f7bb5b-48ed-43f4-8df9-856ea8ac3ca7";
//        String sequentialId = "ID140048406000002023022409451200001";
//
//        String replace = domain.replaceAll(PROTOCOL_REGEX, "");
//        String concat = sequentialId.concat(".xml");
//
//        String format = String.format("%s/%s/esocial/%s/%s/%s", replace, companyId,clientId, batchId, concat);
//        System.out.println(format);
//    }
//
//    @Test
//    public void optionalDefaultValue() {
//        Optional<String> value1 = Optional.ofNullable("default");
//        Optional<String> value2 = Optional.ofNullable(null);
//        Optional<String> or = value1.or(() -> value2);
//        assertNotNull(or);
//    }
//
//
////    @Test
////    public void reflectionTest() {
////        Class<ESocialEventReactor> classe = ESocialEventReactor.class;
////        for (Field atributo : classe.getDeclaredFields()) {
////            Column annotation = atributo.getAnnotation(Column.class);
////            if (annotation != null) {
////                System.out.println(annotation.value());
////            }
////        }
////        System.out.println("");
////    }
//}
