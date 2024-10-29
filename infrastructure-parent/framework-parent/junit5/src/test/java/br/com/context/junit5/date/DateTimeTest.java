package br.com.context.junit5.date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DateTimeTest {

    @Test
    void contextLoads() {
        Clock clock = Clock.fixed(Instant.parse("2000-01-01T00:00:00.00Z"), ZoneId.of("UTC"));
        LocalDateTime dateTime = LocalDateTime.now(clock);
        mockStatic(LocalDateTime.class);
        when(LocalDateTime.now()).thenReturn(dateTime);
        LocalDateTime now = LocalDateTime.now();
        assertEquals(now, dateTime);
    }


    @Test
    public void test001() {
        String currentTime = "20220101";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDateTime = LocalDate.parse(currentTime, dateTimeFormatter);
        System.out.println(localDateTime);
    }

    @Test
    public void scheduleFixedRateTask()  {
        String currentTime= "2022-01-01 00:00:00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(currentTime, dateTimeFormatter);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Before subtraction of hours from date: " + localDateTime.format(formatter));

        {
            // Add years, months, weeks, days to LocalDate
            LocalDateTime localDateTime1 = localDateTime.plusSeconds(1);
            LocalDateTime localDateTime2 = localDateTime.plusMinutes(1);
            LocalDateTime localDateTime3 = localDateTime.plusHours(1);
            LocalDateTime localDateTime4 = localDateTime.plusDays(1);
            LocalDateTime localDateTime5 = localDateTime.plusWeeks(1);
            LocalDateTime localDateTime6 = localDateTime.plusMonths(1);
            LocalDateTime localDateTime7 = localDateTime.plusYears(1);

            System.out.println(localDateTime1.format(formatter));
            System.out.println(localDateTime2.format(formatter));
            System.out.println(localDateTime3.format(formatter));
            System.out.println(localDateTime4.format(formatter));
            System.out.println(localDateTime5.format(formatter));
            System.out.println(localDateTime6.format(formatter));
            System.out.println(localDateTime7.format(formatter));
        }

        System.out.println("****************************");

        {
            // Subtract years, months, weeks, days to LocalDate
            LocalDateTime localDateTime1 = localDateTime.minusSeconds(1);
            LocalDateTime localDateTime2 = localDateTime.minusMinutes(1);
            LocalDateTime localDateTime3 = localDateTime.minusHours(1);
            LocalDateTime localDateTime4 = localDateTime.minusDays(1);
            LocalDateTime localDateTime5 = localDateTime.minusWeeks(1);
            LocalDateTime localDateTime6 = localDateTime.minusMonths(1);
            LocalDateTime localDateTime7 = localDateTime.minusYears(3);

            System.out.println(localDateTime1.format(formatter));
            System.out.println(localDateTime2.format(formatter));
            System.out.println(localDateTime3.format(formatter));
            System.out.println(localDateTime4.format(formatter));
            System.out.println(localDateTime5.format(formatter));
            System.out.println(localDateTime6.format(formatter));
            System.out.println(localDateTime7.format(formatter));
        }


        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Duration duration = Duration.between(localDateTimeNow, localDateTime);

        long seconds = duration.toSeconds();
        long minutes = duration.toMinutes();
        long days = duration.toDays();

        System.out.println("**************************");
        System.out.println(seconds);
        System.out.println(minutes);
        System.out.println(days);
        System.out.println("**************************");
    }

}
