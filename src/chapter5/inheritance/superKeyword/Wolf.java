package chapter5.inheritance.superKeyword;

public class Wolf extends Canine {

    @Override
    public double getAverageWeigh() {
        return super.getAverageWeigh()+20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeigh());
        System.out.println(new Wolf().getAverageWeigh());
    }

}
