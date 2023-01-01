package chapter4.pond.goose;

import chapter4.pond.shore.Bird;


public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose goose = new Goose();
        goose.floatInWater();
        System.out.println(goose.text);
    }

    public void helpOtherGooseSwim(){
        Bird bird = new Goose();
//        bird.floatInWater();
//        System.out.println(bird.text);
    }
}
