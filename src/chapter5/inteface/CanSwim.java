package chapter5.inteface;

public interface CanSwim {
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public final static String type = "submersible";
}

interface CanSwim2{
    public static final int MAXIMUM_DEPTH = 100;
    public final static boolean UNDERWATER = true;
    public final static String type = "submersible";
}
