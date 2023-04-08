package week4._1_monday;

import java.util.Scanner;

public class Example2 {
    //Define a 7-element number array.
    //Fill the array with the values you get from the user.
    //Find the number of odd elements in the array.
    //find the sum of the odd elements in the array
    public static void main(String[] args) {
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+(i + 1) + "th number : ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 1) {
                sumOdd += arr[i];
                countOdd++;
            }
        }
        System.out.println("sumOdd = " + sumOdd);
        System.out.println("countOdd = " + countOdd);

    }

}
