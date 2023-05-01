package week7._1_monday;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_1 {
    public static void main(String[] args) {
        // Example 1 : Write a method to print hi and call it 10 times
//        for (int i = 0; i <10 ; i++) {
//            sayHi();
//        }
//        sayHi("Ozgur");

        //Example 2 :
        // Force the user to enter numbers as a string with spaces between them
        // Find the largest element, smallest element, and the sum of all elements,
        //find the average of the numbers in separate methods.
        // It will be entered like 3 4 12 45 67.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers with space between them : ");
        String enteredNumbers=sc.nextLine();
        System.out.println(enteredNumbers);

        String[] strArr=enteredNumbers.split(" ");
       // System.out.println(Arrays.toString(strArr));

        int [] intArr=new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i]=Integer.parseInt(strArr[i]);

        }
        minNumber(intArr);
        maxNumber(intArr);
        sum(intArr);
        avg(intArr);



    }

    public static void sayHi(){
        System.out.println("Hi");
    }
    public static void sayHi(String name){
        System.out.println("Hi "+name);
    }

    public static void minNumber(int[] arr){
        Arrays.sort(arr);
        System.out.println("Min number is : "+ arr[0]);

    }
    public static void maxNumber(int[] arr){
        Arrays.sort(arr);
        System.out.println("Max number is : "+ arr[arr.length-1]);

    }
    public static void sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum of all elements is : "+ sum);

    }

    public static void avg(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Avg of all elements is : "+ sum/ arr.length);

    }


}