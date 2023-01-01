package chapter4.constructors;

public class Hamster {

    private String color;
    private int weigh;

    public Hamster(int weigh){  // first constructor

        // this() always must be first statement
        this(weigh,"brown");

        this.weigh = weigh;
        color = "brown";

//        Hamster(weigh, "brown"); // doesn't compile
        new Hamster(weigh,"brown"); // compiles, but does not do what we need
    }

    public Hamster(int weigh, String color){  // second constructor
        this.weigh = weigh;
        this.color = color;
    }



}
