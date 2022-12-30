package chapter3.arrayList;

import java.util.ArrayList;
import java.util.List;

public class StraightforwardExamples {
    public static void main(String[] args) {
        // simple ways to create ArrayList.
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        // these are GENERICS which allow to specify the type of class that ArrayList will contain.
        ArrayList<String> list4 = new ArrayList<String>();
        // from Java 7 we can omit the type from right side.
        ArrayList<String> list5 = new ArrayList<>();

        // ArrayList implements interface called List, so Arraylist is a List
        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); Doesn't compile

        // Basic useful Methods
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list);

        // using Generics
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        // safer.add(Boolean.TRUE);

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1,"robin");
        birds.add(0,"blue jay");
        birds.add(1,"cardinal");
        System.out.println(birds);
    }

}
