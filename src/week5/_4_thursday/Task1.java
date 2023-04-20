package week5._4_thursday;

import java.util.Arrays;

// Find the maximum and minimum element of the array

public class Task1 {
    public static void main(String[] args) {


        // 1.way --> By using Array.sort Method

        int [] arr = {1,5, 65,4,76,12};
        Arrays.sort(arr);  // sorts from less one to the greater

        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length-1];  // This is the last and max element
        int min = arr[0]; // This is the first and minumum element

        System.out.println("max = " + max);
        System.out.println("min = " + min);



        // 2.way --> By using for loop and if condition --> (Go to Task 2)





    }


}
