// CONSTRUCTOR CHAINING
package chapter4.constructors;

public class Mouse {

    private int numTeeth;
    private int numWhiskers;
    private int weigh;

    public Mouse(int weigh){
        this(weigh,16);
    }

    public Mouse(int weigh, int numWhiskers){
        this(weigh,numWhiskers,6);
    }

    public Mouse(int weigh, int numWhiskers, int numTeeth){
        this.weigh = weigh;
        this.numWhiskers = numWhiskers;
        this.numTeeth = numTeeth;
    }

    public void print(){
        System.out.println(weigh + " " + numWhiskers + " " + numTeeth);
    }

    public static void main(String[] args) {
        Mouse obj = new Mouse(15);
        obj.print();
    }
}
