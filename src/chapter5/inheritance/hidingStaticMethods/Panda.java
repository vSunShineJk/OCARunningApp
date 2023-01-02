// HIDING STATIC METHODS
package chapter5.inheritance.hidingStaticMethods;

public class Panda extends Bear {
    public static void eat(){
        System.out.println("Panda is eating");
    }

/*    DOES NOT COMPILE, BECAUSE SUBCLASS/CHILD TRIES OVERRIDE THE METHOD. ISSUE: STATIC IS MISSIN
      GENERATES COMPILER ERROR

      public void sneeze(){
          System.out.println("Panda is sneezing");
      }
*/

/*    DOESN'T COMPILE BECAUSE THE SUBCLASS/CHILD TRIES TO HIDE THE METHOD, WHILE PARENT METHOD MISSING STATIC
      GENERATES COMPILER ERROR

      public static void hibernate(){
          System.out.println("Panda is hibernating");
      }
*/

    public static void main(String[] args) {
        Panda.eat();
    }
}
