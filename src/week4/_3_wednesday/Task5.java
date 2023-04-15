package week4._3_wednesday;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

    /*
    Enter an integer of array and as a result print it in reverse order
    intput = {1,2,3,4 } --> output {4,3,2,1}

     */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter lenght for array");
        int length = input.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element for array");
            arr[i] = input.nextInt();
        }

        // forr + Enter Key

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }










    }

}
