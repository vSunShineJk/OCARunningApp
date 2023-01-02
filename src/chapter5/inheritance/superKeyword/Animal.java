package chapter5.inheritance.superKeyword;

public class Animal {

    private int age;
    private String name;

    public Animal(int age, String name){
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age){
        super();
        this.age = age;
        this.name = null;
    }

}
