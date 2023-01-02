// HIDING STATIC METHODS
package chapter5.inheritance.hidingStaticMethods;

public class Bear {
    public static void eat(){
        System.out.println("Bear is eating");
    }

    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }

    public void hibernate(){
        System.out.println("Bear is hibernating");
    }
}
