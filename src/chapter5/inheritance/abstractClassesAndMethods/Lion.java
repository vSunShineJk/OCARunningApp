package chapter5.inheritance.abstractClassesAndMethods;

public class Lion extends BigCat{
    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public void roar() {
        System.out.println("Lion lets out laud ROAR!");
    }
}

class Lion2 extends BigCat2{
    @Override
    public void roar(){
        System.out.println("Lion lets out laud ROAR!");
    }
}
