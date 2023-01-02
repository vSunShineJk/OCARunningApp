package chapter5.inheritance.hidingVariables;

public class Rodent {

    protected int tailLength = 4;

    public void getRodentDetails(){
        System.out.println("[ parent tail = " + tailLength + " ]");
    }

}
