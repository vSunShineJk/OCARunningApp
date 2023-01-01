package chapter4.Encapsulation;

public class NotImmutable {

    private StringBuilder s;

    public NotImmutable(StringBuilder sb){
        s = new StringBuilder(sb);
    }

    public StringBuilder getS() {
        return s;
    }

    public String getValue(){
        return s.toString();
    }
}
