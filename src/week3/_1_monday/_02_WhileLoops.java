package week3._1_monday;

public class _02_WhileLoops {
    public static void main(String[] args) {
        // Example 2: This program will find the summation of numbers from 1 to 10.
        int i = 1, sum = 0;

        // Exit when i becomes greater than 4
        while (i <= 10) {
            // summing up i
            sum = sum + i;

            // Increment the value of i for
            // next iteration
            i++;
        }
        System.out.println("Summation: " + sum);
    }
}
