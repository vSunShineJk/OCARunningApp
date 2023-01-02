package chapter5.inteface;

public interface IsWarmBlooded {

    boolean hasScale();

    default double getTemperature(){
        return 10.0;
    }

}
