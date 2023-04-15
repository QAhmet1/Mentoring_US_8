package week4._4_thursday;

/*
Given an array  int [] arr = {12,3,24,5,68.78,34}   find the maximum element of this array?
*/


import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {


        // First Way
        int [] arr = {12,3,24,5,6, 78,34};
        int max = arr[0];  // This is temorary assigned value
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);

        System.out.println("---------------");


        // Second Way (with Arrays.sort method)

        int [] arr1 = {12,3,24,5,6, 78,34,23,0,1234};
        Arrays.sort(arr1);   // sorted integer array this

        System.out.println(Arrays.toString(arr1));
        int max1 = arr1[arr1.length-1]; // This is the maximum element of array
        System.out.println("max1 = " + max1);
        int min1 = arr1[0]; // This is the minium element of array
        System.out.println("min1 = " + min1);










    }

}
