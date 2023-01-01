package chapter5.inheritance.superKeyword;

public class Shark extends Fish{

    private int numOfFins = 8;

    public Shark(int age){
        super(age);
    }

    public void getSharkDetails(){
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numOfFins + " fins.");
    }

    public void getSharkDetailsWithThisKeyword(){
        System.out.print("Shark with age: " + this.getAge());
        System.out.print(" and " + this.size + " meters long");
        System.out.print(" with " + this.numOfFins + " fins.");
    }

    public void getSharkDetailsWithSuperKeyword(){
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
        System.out.print(" with " + this.numOfFins + " fins.");
    }

    public void getSharkDetailsWithSuperKeywords(){
        System.out.print("Shark with age: " + super.getAge());
        System.out.print(" and " + super.size + " meters long");
//        System.out.print(" with " + super.numOfFins + " fins."); // doesn't compile
    }
}
