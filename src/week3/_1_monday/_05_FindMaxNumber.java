package week3._1_monday;

import java.util.Scanner;

public class _05_FindMaxNumber {
    public static void main(String[] args) {
        // Accept 5 numbers from the user, find the largest number, and print it.
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int maxNumber = 0;

        while (count < 5) {
            System.out.print("Enter a number : ");
            int number = sc.nextInt();

//            if (number > maxNumber)
//                maxNumber=number;

            maxNumber = Math.max(maxNumber, number); //or

            count++;
        }

        System.out.println("maxNumber = " + maxNumber);
    }
}

