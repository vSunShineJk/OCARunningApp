package chapter4;

public class P03_MethodOverloading {


    // ALL LEGAL OPTIONS FOR USING METHOD OVERLOADING
    public void fly(int numOfMiles){}
    public void fly(short nuOfMiles){}
    public boolean fly(){return false;}
    void fly(int numOfMiles, short numFeet){}
    void fly(short numFeet, int numOfMiles)throws Exception{}

//    public static void fly(int numOfMiles){}  Does not compile


    public void fly(int... nums){}
    public void fly(Integer num){}

    public static void main(String[] args) {
        P03_MethodOverloading obj = new P03_MethodOverloading();
        obj.fly(1,2,3);
        obj.fly(7);
    }

}
