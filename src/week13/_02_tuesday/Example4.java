package week13._02_tuesday;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    //   Take 10 integer inputs from user and store them in an array.
    //   copy all the elements in another array but in reverse order.
    //   output :
    //   original array    8, 8, 5, 4, 1, 2, 3, 6, 4, 9,
    //   copy array        9, 4, 6, 3, 2, 1, 4, 5, 8, 8,

    public static void main(String[] args) {
        int[] firstArray = new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < firstArray.length ; i++) {
            System.out.print("Enter a number : ");
            firstArray[i]=sc.nextInt();
        }
        System.out.println("original array : "+ Arrays.toString(firstArray));
        int[] copyArray = new int[10];
        for (int i = firstArray.length-1; i >= 0; i--) {
            copyArray[firstArray.length-1-i]=firstArray[i];
        }
        System.out.println("copy Array : "+Arrays.toString(copyArray));

    }
}
