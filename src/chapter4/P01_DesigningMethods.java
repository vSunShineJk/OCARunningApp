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




}
