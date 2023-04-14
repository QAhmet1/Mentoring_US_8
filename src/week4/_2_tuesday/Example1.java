package week4._2_tuesday;

public class Example1 {

    public static void main(String[] args) {
        //Write a Java program to find the duplicate values of an array of integer values.
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println("Duplicate number: " + arr[j]);
                }
            }
        }
    }
}
