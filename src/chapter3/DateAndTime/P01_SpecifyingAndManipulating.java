package chapter3.DateAndTime;

import java.time.*;

public class P01_SpecifyingAndManipulating {
    public static void main(String[] args) {

        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        // SPECIFYING THE DATE
        LocalDate date1 = LocalDate.of(2023, Month.APRIL, 3);
        LocalDate date2 = LocalDate.of(2023, 4, 3);

        // SPECIFYING THE TIME
        LocalTime time1 = LocalTime.of(3, 4); // hours + minutes
        LocalTime time2 = LocalTime.of(4, 3, 2); // + seconds
        LocalTime time3 = LocalTime.of(5, 4, 3, 2); // nanoseconds

        // COMBINING DATE AND TIME
        LocalDateTime dateTime1 = LocalDateTime.of(1999, Month.FEBRUARY, 28, 14, 5, 6, 444);
        LocalDateTime datetime2 = LocalDateTime.of(date1, time1);
        System.out.println();

        // MANIPULATES DATES
        LocalDate date = LocalDate.of(2015, Month.JULY, 13);
        System.out.println("date = " + date);
        date = date.plusDays(4);
        System.out.println("plus 4 days = " + date);
        date = date.plusWeeks(1);
        System.out.println("plus 1 week = " + date);
        date = date.plusMonths(3);
        System.out.println("plus 3 months = " + date);
        date = date.plusYears(7);
        System.out.println("plus 7 years = " + date);
        System.out.println();

        // Backward the LocalDateTime
        LocalDate Date = LocalDate.of(2014, Month.MARCH, 3);
        LocalTime Time = LocalTime.of(18, 36, 7);
        LocalDateTime dateTime = LocalDateTime.of(Date, Time);
        System.out.println("dateTime = " + dateTime);
        dateTime = dateTime.minusDays(2);
        System.out.println("minus 2 days = " + dateTime);
        dateTime = dateTime.minusHours(3);
        System.out.println("minus 3 hours = " + dateTime);
        dateTime = dateTime1.minusSeconds(59);
        System.out.println("minus 59 minutes = " + dateTime);
        System.out.println();

        // CHAINING THE METHODS ON TIME MANIPULATION
        LocalDate Date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime Time2 = LocalTime.of(5, 15);
        LocalDateTime DateTime2 = LocalDateTime.of(Date2, Time2)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println("DateTime2 = " + DateTime2);
        System.out.println();


        // EPOCH METHOD
        System.out.println("LocalDate.now().toEpochDay() = " + LocalDate.now().toEpochDay());
        //System.out.println("LocalDateTime.now().toEpochSecond() = " + LocalDateTime.now().toEpochSecond());


    }
}
