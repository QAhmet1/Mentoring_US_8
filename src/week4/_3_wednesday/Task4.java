package week4._3_wednesday;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

           /*
Enter the lenght and  Create an array of integers.
Insert their values from the console.
Print only positive elements.
Input
5
1 2 3 4 5
Output
1 2 3 4 5
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter lenght for array");
        int length = input.nextInt();

        int [] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element for array");
            arr[i] = input.nextInt();
        }

        // TO have the positive numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }

        }














    }

}
