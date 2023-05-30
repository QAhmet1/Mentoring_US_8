package wwek11.tuesday;

import java.util.Arrays;
import java.util.HashSet;

public class SetQ3 {
     // Generate a Set
     //Write a method with a method called AddElements that can add 1 or more than 1 number.
     // Fill the set with the AddElements method.
     //Print all elements in console
     public static void main(String[] args) {
         HashSet<Integer>hs=new HashSet<>();
         Add(hs,1,2,3,4,5,6,7,8,9);
         System.out.println("hs = " + hs);
     }


     public static void Add(HashSet<Integer>hs,Integer ...numbers){
         hs.addAll(Arrays.asList(numbers));

     }

}
