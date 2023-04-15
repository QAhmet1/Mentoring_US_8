package week4._3_wednesday;

/*
/*
Task 3:
Enter the length and  create an array of integers and
loop through all the elements along with their indices.
Input
5
1 2 3 4 5
Output
0 - 1
1 - 2
2 - 3
3 - 4
4 - 5
*/

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length for array");
        int length = input.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element for array");
            arr[i] = input.nextInt();
        }

        // First We will print index and then element of array

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i]);
        }













    }


}
