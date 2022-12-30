package chapter3.DateAndTime;

import java.time.*;

public class P02_WorkingWithPeriods {

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    private static void performAnimalEnrichment2(LocalDate start, LocalDate end, Period period) { // use the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds a period
        }
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);

        System.out.println("--- Using generic period ---");
        Period period = Period.ofMonths(1);
        performAnimalEnrichment2(start,end,period);

        // UnsupportedTemporalTypeException
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period2 = Period.ofMonths(1);
        System.out.println(date.plus(period2)); // 2015-02-20
        System.out.println(dateTime.plus(period2)); // 2015-02-20T06:15
        System.out.println(time.plus(period2)); // UnsupportedTemporalTypeException

    }

    public static void measuresOfPeriod() {
        Period annual = Period.ofYears(2); // every 2 years
        Period quarterly = Period.ofMonths(4); // every 4 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(5); // every 5 days
        Period everyYearAndWeek = Period.of(5, 6, 7); // every 5 years 6 months 7 days
    }


}
