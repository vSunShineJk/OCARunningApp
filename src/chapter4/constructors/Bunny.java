package chapter4.constructors;

public class Bunny {


    private String color;
    private int height;
    private int length;


    public Bunny(String color){
        System.out.println("Constructor");

        this.color = color;
    }

    public Bunny(int length, int theHeight){
        length = this.length;  // backwards - no Good!
        height = theHeight;    // fine because different name
        this.color = "white";  // fine, but redundant
    }


//    public bunny(){} // doesn't compile, the name must exactly match with the class name
    public void Bunny(){} // Not constructor, constructors have no any return type


    public static void main(String[] args) {
        //new Bunny(); // instantiating

        Bunny obj = new Bunny(1,2);
        System.out.println(obj.length + " " + obj.height + " " + obj.color);
    }
}
