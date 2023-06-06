package week11.wednesday;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        // Array List + Set

          // How can we add element to array list?

        // 1.way-- manually
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println(list);

        // 2. way of adding element to array list
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("john", "ali"));
        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            list3.add(i);

        }
        System.out.println("list3 = " + list3);



            // What is the difference between array and array list?

            // 1) Arrays-- size is fixed.. Array list size is dyanmic
            // 2) Arrays support primitive and non primitive ---> array list supports only non primitive
            // 3) arrray list is a type Collection  --> Array is a data structure in java


        Integer [] arr = new Integer [4];
        // This is an integer array which has 4 elements
        // 0 0 0 0


        arr[0] = 1;
        arr[1] = 2;

        System.out.println(Arrays.toString(arr));

        // 1, 2 , 0, 0
        // 1, 2 .................











    }


}
