package week3._2_tuesday;

import java.util.Scanner;

public class _01_SuperNumber {
    // write a program to accept a number from the user.
    //check the entered number if it is super number or not.

    //A perfect number, in number theory, is a number whose positive divisors are equal to itself.
    // 6=1,2,3  //1+2+3=6
    //28-->> 1,2,4,7,14

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number= sc.nextInt();
        int sum=0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sum+=i;
                //System.out.println("i = " + i);
            }

        }
        if (number==sum){
            System.out.println("perfect number");
        }
        else {
            System.out.println("not perfect number");
        }
    }

}
