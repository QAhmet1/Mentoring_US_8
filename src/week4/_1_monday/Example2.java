package week4._1_monday;

import java.util.Scanner;

public class Example2 {
    //Define a 7-element number array.
    //Fill the array with the values you get from the user.
    //Find the number of odd elements in the array.
    //find the sum of the odd elements in the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        int countOdd = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number : ");
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 1) {
                sumOdd += numbers[i];
                countOdd++;
            }
        }
        System.out.println("sumOdd = " + sumOdd);
        System.out.println("countOdd = " + countOdd);


    }


}
