package week3._4_thursday;

import java.util.Scanner;

// FOR LOOP PRACTICES

public class _01_MixLoopsExamples {

    public static void main(String[] args) {

        // even numbers from 30 to 1
        for (int i = 30; i >= 1 ; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }


        // Find the average of numbers from 30 to 1
        // What is average?  2 and 4 --> sum/count --> 3

        double sum = 0;
        for (int i = 30; i >=1 ; i--) {
            sum+=i;
        }

        double average = sum/30;
        System.out.println("average = " + average);

        System.out.println("---------------------------------");


        // Print the letters from a to z
        // char is the shourtcut of Character

        for (char i = 'a'; i <='z' ; i++) {       // a,b,c,d----------z
            System.out.println(i);
        }


        // Enter 5 numbers and have the sum
        Scanner input = new Scanner(System.in);
        int sum1 =0;

        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number please");
            int number = input.nextInt();
            sum1+=number;
        }

        System.out.println("sum1 = " + sum1);
*/


        System.out.println("----------------------");

        //  find the count of "l" in the word (HelloWorld)
        // output = 3

        String str = "Helloworld";
        // What is index in the string? What is the letter in index 0 --> index 0 equals -> H
        // System.out.println(str.charAt(str.length()-1)); This is the method of getting last letter

        int countOfl =0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                countOfl++;
            }
        }

        System.out.println("countOfl = " + countOfl);

        System.out.println("----------------------------");


        String str1= "john";
        String str2 = "john";

        // Are these names same, if same print true, if not false
        // If I compare two strings I am gonna use .equal method.

        if (str1.equals("john")){
            System.out.println("True");
        } else  {
            System.out.println("False");
        }














    }



















}
