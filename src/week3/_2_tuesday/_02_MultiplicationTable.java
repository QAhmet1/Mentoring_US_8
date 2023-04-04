package week3._2_tuesday;

import java.util.Scanner;

public class _02_MultiplicationTable {
 /*
    Write a program that prompts the user to input a positive integer.
    It should then print the multiplication table of that number.
    out put
    number x 1=result
    number x 2=result
    number x 3=result
    .
    .
    .
    number x 10=result
     */
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a positive number : ");
     int number= sc.nextInt();
     for (int i = 1; i <= 10; i++) {
         System.out.println(number+" x "+i+" = "+number*i);

     }
 }
}
