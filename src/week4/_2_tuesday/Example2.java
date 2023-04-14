package week4._2_tuesday;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // Write a Java program to find the sum of two arrays elements.
        // take the number of the array sizes from user
        // if the user entered different number for sizes "both array must have same number of elements" message
        //should appears on console and force the user to enter same numbers

        //Example:-
        //array1[] = {10, 20, 30, 40, 50};
        //array2[] = {9, 18, 27, 36, 45};
        //The resultant array will be,
        //array3[] = {19, 38, 57, 76, 95};

        int randomSize= (int) (Math.random()*6);
        System.out.println("randomSize = " + randomSize);

//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter number for size array 1 :  ");
        //int arr1Size= randomSize;
       // System.out.print("Enter number for size array 2 :  ");
       // int arr2Size= randomSize;
//        if (arr1Size!=arr2Size){
//            System.out.println("both array must have same number of elements");
//            System.out.print("Enter number for size array 1 :  ");
//            arr1Size=sc.nextInt();
//            System.out.print("Enter number for size array 2 :  ");
//            arr2Size= sc.nextInt();
//        }
        //declaration arrays
        int []arr1=new int[randomSize];
        int []arr2=new int[randomSize];
        int []arr3=new int[randomSize];

        // fill the arr1 by getting values from the user
        for (int i = 0; i < arr1.length; i++) {
            //System.out.print("Enter a number : ");
            arr1[i]= (int) (Math.random()*10);
        }

         //fill the arr2 by getting values from the uer

        for (int i = 0; i < arr2.length; i++) {
           // System.out.print("Enter a number : ");
            arr2[i]=(int) (Math.random()*10);
        }

        // display arr3
        for (int i = 0; i < arr3.length; i++) {
            arr3[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }
}
