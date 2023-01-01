package chapter4.pond.inland; // different package than Bird

import chapter4.pond.shore.Bird;

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); Doesn't compile
//        System.out.println(bird.text); Doesn't compile
    }

}
