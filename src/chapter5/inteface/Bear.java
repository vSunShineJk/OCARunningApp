package chapter5.inteface;

public class Bear implements Omnivore, Herbivore{
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    // if there are two methods with the same name but different parameter list or method signature
    @Override
    public void eatPlants2(){
        System.out.println("Eating plants");
    }

    @Override
    public int eatPlants2(int quantity){
        System.out.println("Eating plants: " + quantity);
        return quantity;
    }

/* if there are two methods with the same name and parameter list
    DOESN'T COMPILE

    @Override
    public void eatPlants3(){}
    @Override
    public void eatPlants3(){}

 */
}
