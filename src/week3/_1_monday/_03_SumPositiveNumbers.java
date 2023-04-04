package week3._1_monday;

import java.util.Scanner;

public class _03_SumPositiveNumbers {

    public static void main(String[] args) {
        /*
        Write a program that continues as long as the user enters a positive number,
         and sums positive numbers
         and prints the sum on the screen.
         */
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        while (number >= 0) {
            sum += number;
            System.out.print("Enter a number : ");
            number= sc.nextInt();

        }
        System.out.println("sum = " + sum);


    }

}

