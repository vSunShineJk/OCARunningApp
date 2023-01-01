package chapter4.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

//        print(animals,new CheckIfHopper());
        print(animals, e -> e.canHop());
        print(animals, e -> e.canSwim());
        print(animals, e -> ! e.canSwim());
        print(animals,(Animal T) -> {return T.canSwim();});
        print(animals,(Animal E) -> {return E.canHop();});

        // VALID LAMBDA EXPRESSIONS
//        print(() -> true);  0 params
//        print(e -> e.startsWith("test")); 1 param
//        print((String e) -> e.startsWith("test")); 1 param
//        print((a, b) -> a.startsWith("test")); // 2 parameters
//        print((String a, String b) -> a.startsWith("test")); // 2 parameters

    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }

}
