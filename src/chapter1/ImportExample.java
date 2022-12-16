package chapter1;

import  java.util.*; // imports Random class among others. -- > shortcut
//import java.util.Random;


public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
