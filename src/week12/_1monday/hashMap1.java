package week12._1monday;

import java.util.HashMap;

public class hashMap1 {
    public static void main(String[] args) {
//        ArrayList<String>str=new ArrayList<>();
//        System.out.println(str.get(0));

        HashMap<Integer,String>languages=new HashMap<>();
        languages.put(1,"Java");
        languages.put(2,"Python");
        languages.put(3,"JavaScript");
        languages.put(4,"C++");
        System.out.println("Original hashmap : "+languages);

        //changing element

        languages.replace(2,"Spring Boot");

        System.out.println("Updated hashmap : "+languages);


    }
}
