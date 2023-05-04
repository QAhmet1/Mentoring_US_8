package week7._4_thursday;


// Create a method that reverses a string

public class ReverseAString {


    public static void main(String[] args) {


        reverseAString("hellojava");

    }



    public static void reverseAString (String word) {

        // ice value  = i
        String reverse = "";   // This is container string

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }

        reverse = reverse.toUpperCase();


        System.out.println("reverse = " + reverse);

    }





}
