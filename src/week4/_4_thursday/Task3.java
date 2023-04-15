package week4._4_thursday;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        // Sort the letters of char array in alphabetical order

        char [] arr = { 'z', 'a', 'd', 'f', 'l' };  // from a to z
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // Sorts the array in alphatical order
        System.out.println(Arrays.toString(arr));

    }
}
