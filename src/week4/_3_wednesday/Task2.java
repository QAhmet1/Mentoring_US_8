package week4._3_wednesday;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

/*
Enter the length and create an array of integers, loop through all the elements.
Input
5
1 2 3 4 5
Output
1 2 3 4 5
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int lenght = input.nextInt();

        int [] arr = new int[lenght];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element for array");
            arr[i] = input.nextInt();
        }

        // I want to loop through the array

        System.out.println(Arrays.toString(arr));

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */


















    }





}
