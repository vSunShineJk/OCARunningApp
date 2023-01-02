package chapter5.inheritance.hidingStaticMethods;

// USING STATIC HIDING
public class Marsupial {
    public static boolean isBiped(){
        return false;
    }

    public void marsupialDescription(){
        System.out.println("Marsupial can walk in two legs: " + isBiped());
    }
}

// USING OVERRIDING
class Marsupial2 {
    public boolean isBiped(){
        return false;
    }

    public void marsupialDescription(){
        System.out.println("Marsupial can walk in two legs: " + isBiped());
    }
}
