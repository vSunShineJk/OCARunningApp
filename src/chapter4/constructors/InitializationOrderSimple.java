// ORDER OF INITIALIZATION
package chapter4.constructors;

import java.lang.reflect.Constructor;

public class InitializationOrderSimple {

    // 1. superclass
    // 2. static variable declaration
    // 3. instance variable declaration
    // 4. Constructor

    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    static { COUNT += 10; System.out.println(COUNT); }
    public InitializationOrderSimple(){ System.out.println("Constructor"); }

    public static void main(String[] args) {
        InitializationOrderSimple obj = new InitializationOrderSimple();
        /*
            0
            10
            Torchie
            Constructor
         */
    }

}
