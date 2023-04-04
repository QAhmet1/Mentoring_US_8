package week3._1_monday;

import java.util.Scanner;

public class _04_FindSum {
    public static void main(String[] args) {
        // Find the sum of the numbers up to an entered number and print it.
        // include the entered number
        //for instance if the user entered 5 then the result will be 5+4+3+2+1=15
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number;
            System.out.println("number = " + number);
            number--;

        }
        System.out.println("sum = " + sum);


    }

}
