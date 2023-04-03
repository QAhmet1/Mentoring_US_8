package week3._1_monday;

import java.util.Scanner;

public class _04_FindSum {
    public static void main(String[] args) {
        // Find the sum of the numbers up to an entered number and print it.
        // include the entered number
        //for instance if the user entered 5 then the result will be 5+4+3+2+1=15

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=scanner.nextInt(); //5
        int sum=0;
        while(number>0)
        {
            sum=sum+number; // 5 9 12 14 15
            number--; // 5 4 3 2 1
        }

        System.out.println("Total = " + sum);
    }
}
