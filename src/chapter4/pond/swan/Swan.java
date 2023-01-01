package chapter4.pond.swan;

import chapter4.pond.shore.Bird;

public class Swan extends Bird {
    public void swim(){
        floatInWater(); // referring to protected members via inheriting them
        System.out.println(text); // referring to protected members via inheriting them
    }

    public void helpOtherSwanSwim(){
        Swan swan = new Swan();
        swan.floatInWater(); // package access to superclass
        System.out.println(swan.text); // package access to superclass
    }

    public void helpOtherBirdsSwim(){
        Bird bird = new Bird();
//        bird.floatInWater(); Compiler error
//        System.out.println(bird.text); CompilerError
    }
}
