package week4._1_monday;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    //Define an int array with 5 elements.
    //Fill this array by getting the values from the user.
    //Then find the number of elements greater than the average
    public static void main(String[] args) {
        int [] numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        double avg=0.0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number : ");
            numbers[i]=sc.nextInt();
            sum+=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        avg=sum/ numbers.length;
        System.out.println("avg = " + avg);
        int count=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>avg){
               // System.out.println("number = " + numbers[i]);
                count++;
            }
            System.out.println("count = " + count);


        }
    }


}
