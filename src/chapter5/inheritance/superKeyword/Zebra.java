package chapter5.inheritance.superKeyword;

public class Zebra extends Animal{

    public Zebra(int age){
        super(age);
    }

    public Zebra(){
        this(4);
    }

}
