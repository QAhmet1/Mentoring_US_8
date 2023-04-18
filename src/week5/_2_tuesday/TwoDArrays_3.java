package week5._2_tuesday;

import java.util.Arrays;

public class TwoDArrays_3 {
    public static void main(String[] args) {
        int []arr={5,1,22,3,45,5,36,7,89,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("differance between max and min  :  " +(arr[arr.length-1]-arr[0]));
    }
}