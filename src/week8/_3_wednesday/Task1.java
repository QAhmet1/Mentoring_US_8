package week8._3_wednesday;

/*
// create simple method that will replace all negative elements in array into 0
This must be void method -  This must be static method

// {2, 3,4 , -1, -2 ,9}  --  2, 3, 4, 0, 0,9

 */

import java.util.Arrays;

public class Task1 {    // class level

     // WHAT CAN BE STATIC IN JAVA


    public static void main(String[] args) {  // method level


        int [] arr = {1,2,4,-1,-4};
        toZero(arr);

    }



    // CUSTOM METHOD AREA


    public static void toZero (int [] arr ) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                arr[i]=0;
            }
        }

        System.out.println(Arrays.toString(arr));                    // Arrays.toString

    }



}
