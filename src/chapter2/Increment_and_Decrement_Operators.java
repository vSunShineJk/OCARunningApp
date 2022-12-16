package chapter2;

public class Increment_and_Decrement_Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        int sum = a++ + b++ + --a + --b;
        System.out.println(sum);

        int tt = (byte) 99.9;
        System.out.println(tt);
    }
}
