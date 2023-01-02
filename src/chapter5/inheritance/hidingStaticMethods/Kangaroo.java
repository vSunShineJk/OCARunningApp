package chapter5.inheritance.hidingStaticMethods;

// USING STATIC HIDING
public class Kangaroo extends Marsupial {
    public static boolean isBiped(){
        return true;
    }

    public void kangarooDescription(){
        System.out.println("Kangaroo can hop in two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo kangaroo = new Kangaroo();
        kangaroo.marsupialDescription();
        kangaroo.kangarooDescription();
    }
}

// USING OVERRIDING
class Kangaroo2 extends Marsupial2 {
    @Override
    public boolean isBiped(){
        return true;
    }

    public void kangarooDescription(){
        System.out.println("Kangaroo can hop in two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo2 kangaroo = new Kangaroo2();
        kangaroo.marsupialDescription();
        kangaroo.kangarooDescription();
    }
}
