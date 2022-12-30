package chapter3.DateAndTime;

import java.time.*;
import java.time.format.*;

public class P03_FormattingDatesAndTimes {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate.getDayOfWeek() = " + currentDate.getDayOfWeek());
        System.out.println("currentDate.getMonth() = " + currentDate.getMonth());
        System.out.println("currentDate.getYear() = " + currentDate.getYear());
        System.out.println("currentDate.getEra() = " + currentDate.getEra());
        System.out.println("currentDate.getDayOfYear() = " + currentDate.getDayOfYear());
        System.out.println();

        LocalTime time = LocalTime.of(11,12,34);
        LocalDateTime dateTime = LocalDateTime.of(currentDate,time);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("dateTime = "+shortDateTime.format(dateTime));
        //System.out.println("time = "+shortDateTime.format(time)); UnsupportedTemporalTypeException
        System.out.println();


        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time2 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortF.format(dateTime2)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime2)); // Jan 20, 2020 11:12:34 AM
        System.out.println();

        // CREATING OWN DATE FORMAT
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss, dd, MMM, yyyy");
        System.out.println(dateTime2.format(f));
        System.out.println();

        // PARSING DATE AND TIME
        DateTimeFormatter Df = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", Df);
        LocalTime DTime = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(DTime); // 11:22

    }
}
