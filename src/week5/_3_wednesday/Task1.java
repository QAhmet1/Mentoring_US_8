package week5._3_wednesday;

// Can you check whether two words (given) are anagram or not?
// What is Anagram ? -- > 1) Same Letters 2) Order may be  different 3) Length is same

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

   

        String str1 = "DAeR";
        String str2 = "ReAd";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // FIRST STEP  --> We are gonna convert these strings to char array

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        // SECOND STEP -->  Sorting the Arrays
        
        Arrays.sort(arr1);  // I am sorting char array in alphatecical order
        Arrays.sort(arr2);  // I am sorting char array in alphatecical order

        // THIRD STEP --> Making sure It is Anagram

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("These words are anagram words");
        } else {
            System.out.println("NOT ANAGRAM");
        }



















    }


}
