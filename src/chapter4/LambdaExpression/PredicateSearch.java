package chapter4.LambdaExpression;

import java.util.*;
import java.util.function.*;

public class PredicateSearch {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));

        print(animals, a -> a.canSwim());

        // removeIf() method
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.removeIf (e -> e.charAt(0) != 'h');
        System.out.println(bunnies);

    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + "");
            }
        }
        System.out.println();
    }

}
