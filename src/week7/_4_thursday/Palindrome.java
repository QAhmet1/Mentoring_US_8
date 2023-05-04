package week7._4_thursday;

// Can you create a method that checks whether a string is palindrome or not
// Palindrome means : if string is equal to reverse --> It is palindrome Example: "madam"

public class Palindrome {


    public static void main(String[] args) {


        isPalindrome("kazal");


    }



    public static void isPalindrome (String word) {

        String reverse = "";
        for (int i = word.length()-1; i>=0 ; i--) {
            reverse += word.charAt(i);
        }


        if (word.equals(reverse)) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not palindrome");
        }



    }



}
