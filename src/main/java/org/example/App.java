package org.example;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String... args) {
        LocalDate localDate = LocalDate.parse("2018-02-01");

        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        Date date = Date.from(instant);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        DayOfWeek dayDate = localDate.getDayOfWeek();
        System.out.println("LocalDate: " + localDate);
        System.out.println("Calendar year: " + calendar.get(Calendar.YEAR));
        System.out.println("Calendar month (0 to 11): " + calendar.get(Calendar.MONTH));// Calendar mont from 0 to 11
        System.out.println("Calendar day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("calender day name " + dayDate);
    }



}