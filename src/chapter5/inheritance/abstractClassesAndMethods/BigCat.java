package chapter5.inheritance.abstractClassesAndMethods;

public abstract class BigCat extends Animal {
    public abstract void roar();
}

// IMPLEMENTING ABSTRACT METHOD RIGHT IN THE INTERMEDIATE ABSTRACT CLASS
abstract class BigCat2 extends Animal{
    public String getName(){
        return "Lion";
    }

    public abstract void roar();
}
