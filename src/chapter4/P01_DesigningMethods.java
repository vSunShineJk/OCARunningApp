package chapter4;

public class P01_DesigningMethods {

    // ACCESS MODIFIERS (Optional) [public, privet, protected, default
    public void eat1(){}
    private void eat2(){}
    protected void eat3(){}
    void eat4(){}

    // SPECIFIERS (Optional) [final, static, abstract, synchronized, native, strictfp]
    public final void walk2(){}
    public static final void walk3(){}
    public final static void walk4(){}
    final public void walk5(){}

    // RETURN TYPE (required) [void and any objs or primitives]
    void sleep1(){}
    void sleep2(){return;}
    String sleep3(){return "";}
//    String sleep4(){} DOESN'T COMPILE
//    private sleep5(){} DOESN'T COMPILE
//    String sleep6(int a){if (a == 4)return "";} DOESN'T COMPILE

    // EXCEPTION LIST (optional) [throws: IllegalArgumentException, InterruptedException, etc...]
    public void zeroException() {}
    private void oneException() throws IllegalAccessException {}
    public void twoExceptions() throws InterruptedException, IllegalAccessException{}

    // VARARGS
    public void sleep1(int... nums){}
    public void sleep2(int start, int... nums){}
//    public void sleep3(int... nums, int start){}
//    public void sleep4(int... nusm, int... nums2){}

    public static void walk(int start, int... nums){
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk(1);
        walk(1,2);
        walk(1,2,3);
        walk(1,new int[]{4,5,6});
//        walk(1,null); NullPointerException
        System.out.println();

        run(11,22);
    }

    public static void run(int... nums){
        System.out.println(nums[1]);
    }

}
