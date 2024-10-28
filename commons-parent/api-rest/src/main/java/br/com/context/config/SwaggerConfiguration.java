//package br.com.context.config;
//
//import io.swagger.v3.oas.models.ExternalDocumentation;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springdoc.core.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//
//import java.text.ParseException;
//import java.time.*;
//import java.time.format.DateTimeFormatter;
//
//@Configuration
//@EnableScheduling
//public class SwaggerConfiguration {
//
//
//    ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
//
//
//    @Scheduled(cron = "0 * 11 * * *", zone="America/Sao_Paulo")
//    public void scheduleFixedRateTask() throws ParseException {
//
//
//        String currentTime= "2022-01-01 00:00:00";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime localDateTime = LocalDateTime.parse(currentTime, dateTimeFormatter);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        System.out.println("Before subtraction of hours from date: " + localDateTime.format(formatter));
//
//
//        {
//            // Add years, months, weeks, days to LocalDate
//            LocalDateTime localDateTime1 = localDateTime.plusSeconds(1);
//            LocalDateTime localDateTime2 = localDateTime.plusMinutes(1);
//            LocalDateTime localDateTime3 = localDateTime.plusHours(1);
//            LocalDateTime localDateTime4 = localDateTime.plusDays(1);
//            LocalDateTime localDateTime5 = localDateTime.plusWeeks(1);
//            LocalDateTime localDateTime6 = localDateTime.plusMonths(1);
//            LocalDateTime localDateTime7 = localDateTime.plusYears(1);
//
//            System.out.println(localDateTime1.format(formatter));
//            System.out.println(localDateTime2.format(formatter));
//            System.out.println(localDateTime3.format(formatter));
//            System.out.println(localDateTime4.format(formatter));
//            System.out.println(localDateTime5.format(formatter));
//            System.out.println(localDateTime6.format(formatter));
//            System.out.println(localDateTime7.format(formatter));
//        }
//
//        System.out.println("****************************");
//
//        {
//            // Subtract years, months, weeks, days to LocalDate
//            LocalDateTime localDateTime1 = localDateTime.minusSeconds(1);
//            LocalDateTime localDateTime2 = localDateTime.minusMinutes(1);
//            LocalDateTime localDateTime3 = localDateTime.minusHours(1);
//            LocalDateTime localDateTime4 = localDateTime.minusDays(1);
//            LocalDateTime localDateTime5 = localDateTime.minusWeeks(1);
//            LocalDateTime localDateTime6 = localDateTime.minusMonths(1);
//            LocalDateTime localDateTime7 = localDateTime.minusYears(3);
//
//            System.out.println(localDateTime1.format(formatter));
//            System.out.println(localDateTime2.format(formatter));
//            System.out.println(localDateTime3.format(formatter));
//            System.out.println(localDateTime4.format(formatter));
//            System.out.println(localDateTime5.format(formatter));
//            System.out.println(localDateTime6.format(formatter));
//            System.out.println(localDateTime7.format(formatter));
//        }
//
//
//        LocalDateTime localDateTimeNow = LocalDateTime.now();
//        Duration duration = Duration.between(localDateTimeNow, localDateTime);
//
//        long seconds = duration.toSeconds();
//        long minutes = duration.toMinutes();
//        long days = duration.toDays();
//
//        System.out.println("**************************");
//        System.out.println(seconds);
//        System.out.println(minutes);
//        System.out.println(days);
//        System.out.println("**************************");
//    }
//
//    @Bean
//    public GroupedOpenApi publicApi() {
//
//        String packagesToscan[] = {"br.com.context"};
//
//        return GroupedOpenApi.builder()
//                .group("springshop-public")
//                .packagesToScan(packagesToscan)
//                .build();
//    }
//
//    @Bean
//    public OpenAPI springShopOpenAPI() {
//        return new OpenAPI()
//                .info(new Info().title("SpringShop API")
//                        .description("Spring shop sample application")
//                        .version("v0.0.1")
//                        .license(new License().name("Apache 2.0").url("https://springdoc.org")))
//                .externalDocs(new ExternalDocumentation()
//                        .description("SpringShop Wiki Documentation")
//                        .url("https://springshop.wiki.github.org/docs"));
//    }
//
//}
