package chapter5.inheritance;

public class Animal {

    private int age;

    public int getAge(){
        return age;
    }

    private void setAge(int age){
        this.age = age;
    }

}

class Lion extends Animal{

    private void roar(){
        System.out.println("The " + getAge() + " year old Lion says: Roar!");
    }

}
