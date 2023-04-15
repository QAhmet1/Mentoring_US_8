package week4._4_thursday;

/*
Find the frequency of  word "java" in the array.
String [] arr = {"java", "java", "javascrypt","pyhtoon", "java"};
output = 3
 */

public class Task4 {
    public static void main(String[] args) {

        String [] arr = {"java", "java", "javascrypt","pyhtoon", "java"};
        int frequency  = 0;
        String str = "pyhtoon";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
