package week4._4_thursday;

// Find the longest word in the given String :
// String str = "john ilyas christiano fernandezalonso";

public class Task5 {
    public static void main(String[] args) {

        String str = "john ilyas christiano fernandezalonso";

        // First,  convert string to string array
        String [] arr = str.split(" "); // .split method converts string to array

        String maxWord = arr[0];

        //  Second, Find the longest word
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()> maxWord.length() ) {
                maxWord = arr[i];
            }
        }

        System.out.println("maxWord = " + maxWord);






    }
}
