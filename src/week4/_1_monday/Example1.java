package week4._1_monday;

import java.util.Scanner;

public class Example1 {
    //Define an int array with 5 elements.
    //Fill this array by getting the values from the user.
    //Then find the number of elements greater than the average.
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+(i+1)+"th number : ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avg=sum/ arr.length;
        System.out.println("avg = " + avg);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>avg)
                count++;
        }
        System.out.println("count = " + count);
    }
}
