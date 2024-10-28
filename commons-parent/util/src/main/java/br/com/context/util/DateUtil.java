package br.com.context.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.time.FastDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alcir
 */
public class DateUtil {

    private static final FastDateFormat QUERY_DATE_FORMATTER = FastDateFormat.getInstance("yyyy-MM-dd");
    private static final FastDateFormat QUERY_DATE_TIME_FORMATTER = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime) {
        return QUERY_DATE_FORMATTER.format(localDateTime);
    }


    public static void main(String[] args) {

        LocalDateTime localDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String localDateFormatString = localDate.format(formatter);

        LocalDateTime date = LocalDateTime.parse("2023-01-01T00:00:00.441106", formatter);

        System.out.println(date);

    }
}
