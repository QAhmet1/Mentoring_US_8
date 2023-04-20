package week5._4_thursday;

// Get the square of each element and store them in a new array.
//  {1,2,3,4,5};  -->  {1,4,9,16,25}

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        double[]  arr  = {1,2,3,4,5};    // In the arrays size is fixed..
        double [] arr1  = new double[arr.length]; // This is a new array, square values will be stored here

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i]*arr[i];  // for alternative -->  Math.pow(arr[i],2);
        }

        System.out.println(Arrays.toString(arr1));      // Arrays.toString for printing arrays


        // How can we print whole multi-dimensional array? --> with Arrays.deeptoString
        int [][] multiArray = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.deepToString(multiArray));
















    }
}
