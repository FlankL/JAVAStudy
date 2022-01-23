package com.flank.javastudy.jdk8date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

/**
 * @author flank
 * @date 2020/11/24 10:13
 */
public class DateDemon {
    @Test
    public void testZone(){
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }
    @Test
    public void testInstant(){
        Instant now = Instant.now();
        Instant instant = now.plusSeconds(3);
        Instant minus = now.minusSeconds(3);
        System.out.println("minus = " + minus);
        System.out.println("instant = " + instant);

    }
    @Test
    public void testClock(){
        Clock system = Clock.systemDefaultZone();
        System.out.println(system);
    }
    @Test
    public void testDate(){
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        LocalDate plusYears = now.plusYears(3);
        System.out.println(plusYears);
    }
    @Test
    public void testtLocalTime() throws ParseException {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.parse("2020-10-10");
    }

    @Test
    public void testDateTimeFormatter(){
        String format = DateTimeFormatter.BASIC_ISO_DATE.format(LocalDateTime.now());
        System.out.println(format);
    }
}
