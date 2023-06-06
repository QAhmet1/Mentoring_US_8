package week11.thursday;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        // How can you convert an array to array list?

        String [] arr = {"java", "pythoon", "sql", "XSS"};


        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);


        System.out.println("---------------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        // addAll  -- the ability to add more than one element in one time


        list2.addAll(Arrays.asList(1,2,4,5,6,7,8,9,11));
        System.out.println(list2);








      /*
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
      */













    }




}
