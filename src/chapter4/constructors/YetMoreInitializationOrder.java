package chapter4.constructors;

public class YetMoreInitializationOrder {

    static { add(2); } // 1
    static void add(int num) { System.out.print(num + " "); } // 2 incorrect
    YetMoreInitializationOrder() { add(5); } // 7
    static { add(4); } // 3 --> 2
    { add(6); } // 5
    static { new YetMoreInitializationOrder(); } // 4
    { add(8); } // 6
    public static void main(String[] args) { }

    // 2 4 6 8 5

}
