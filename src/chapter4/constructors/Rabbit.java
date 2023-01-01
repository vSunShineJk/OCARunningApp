// DEFAULT CONSTRUCTORS
package chapter4.constructors;

public class Rabbit {
    public static void main(String[] args) {
        Rabbit obj = new Rabbit(); // calling default constructor
    }
}

class Rabbit1 {
    // Has a default constructor
}

class Rabbit2 {
    public Rabbit2(){} // not a default constructor. We have already define this
}

class Rabbit3 {
    public Rabbit3(boolean b){} // not a default constructor too
}

class Rabbit4 {
    private Rabbit4(){} // this is a private constructor
}

class RabbitsMultiply {
    public static void main(String[] args) {
        Rabbit1 r1 = new Rabbit1();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
        //Rabbit4 r4 = new Rabbit4(); // Doesn't compile
    }
}