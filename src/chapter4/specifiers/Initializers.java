package chapter4.specifiers;

import java.util.ArrayList;

public class Initializers {
    // Ex #1
    private static final int NUM_BUCKETS = 45;

    // Ex #2
    private static final ArrayList<String> arr = new ArrayList<>();

    // Ex #3
    private static final int NUM_OF_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_OF_SECONDS_PER_HOUR = numMinutesPerHour * numSecondsPerMinute;
    }

    // Ex #4
    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four;  //Doesn't compile
    static {
        one = 1;
        two = 2;
//        three = 3; Doesn't compile
//        two = 4; Doesn't compile
    }

    public static void main(String[] args) {
        // #1
//        NUM_BUCKETS = 5; DOES NOT COMPILE
        // #2
        arr.add("Hello");
        // #3
        System.out.println(NUM_OF_SECONDS_PER_HOUR);

    }
}
