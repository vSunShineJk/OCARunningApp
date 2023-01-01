package chapter4.pond.goose;

import chapter4.pond.shore.Bird; // another package

public class Gosling extends Bird { // extend means creating subclass
    public void swim(){
        floatInWater(); // calling protected number
        System.out.println(text); // calling protected number


    }
}
