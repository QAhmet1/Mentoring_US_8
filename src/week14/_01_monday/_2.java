package week14._01_monday;

import java.util.HashSet;

public class _2 {
/*
    Create 2 hashsets and find the intersection between two sets
     */
public static void main(String[] args) {
    HashSet<String>hs1=new HashSet<>();
    // ali, ozgur
    hs1.add("Elvira");
    hs1.add("Yaren");
    hs1.add("Burcu");
    hs1.add("Cankut");
    System.out.println("hs1 = " + hs1);
    HashSet<String>hs2=new HashSet<>();
    hs2.add("Yaren");
    hs2.add("Burcu");
    hs2.add("Ozgur");
    hs2.add("Baran");
    System.out.println("hs2 = " + hs2);
    hs1.retainAll(hs2);
    System.out.println("Intersection is : "+hs1);


    //cankut,ozgur
}
}
