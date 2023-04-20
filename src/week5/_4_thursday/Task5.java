package week5._4_thursday;

import java.util.Arrays;
/*
Store the alphabet in a char array, and print it.
*/
public class Task5 {

    public static void main(String[] args) {


        char [] arr = new char[26];

        int a = 0; // I am gonna use this value as index

        for (char i = 'a'; i <= 'z' ; i++) {  // a ,b,c,d ------ z
            arr[a++] = i;    // arr[0] -> a , arr[1] -> b
        }

        System.out.println(Arrays.toString(arr));









    }
}
