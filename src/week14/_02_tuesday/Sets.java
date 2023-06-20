package week14._02_tuesday;

import java.util.*;

public class Sets {
    // SETS : HashSet , LinkedHashSet, TreeSet
    public static void main(String[] args) {

        // HashSet stores elements based on hash algorithm
        HashSet<String>hs=new HashSet<>();
        hs.add("Banana");
        hs.add("Apple");
        hs.add("Melon");
        hs.add("Carrot");
        System.out.println("hs = " + hs); // hs = [Apple, Carrot, Banana, Melon]

        // LinkedHashSet stores elements based on order added
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("Banana");
        lhs.add("Apple");
        lhs.add("Melon");
        lhs.add("Carrot");
        System.out.println("lhs = " + lhs); // lhs = [Banana, Apple, Melon, Carrot]
        // TreeSet stores elements in alphabetical order
        TreeSet<String>ts1=new TreeSet<>();
        ts1.add("Banana");
        ts1.add("Apple");
        ts1.add("Melon");
        ts1.add("Carrot");
        System.out.println("ts1 = " + ts1);// ts1 = [Apple, Banana, Carrot, Melon]
        // stores elements in numerical order
        TreeSet<Integer>ts2=new TreeSet<>();
        ts2.add(1);
        ts2.add(10);
        ts2.add(8);
        ts2.add(2);
        ts2.add(0);
        ts2.add(1);
        System.out.println("ts2 = " + ts2);// ts2 = [0, 1, 2, 8, 10]
        HashSet<Boolean>hs3=new HashSet<>();
        hs3.add(2>1);
//        hs3.add(false);
//        hs3.add(true);
        System.out.println("hs3 = " + hs3);

    }


}
