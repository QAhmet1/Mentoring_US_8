package week6._1_monday;

public class _02_Examples {
    public static void main(String[] args) {
        //TODO Write a Java Program to Check Palindrome String
        // A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.
        // Examples noon, civic, racecar, level,kazak and mom.

        String text = "123321";
        String reverse="";
        for (int i = text.length()-1; i >=0 ; i--) {
            reverse=reverse+text.charAt(i);
           // reverse=reverse.concat(String.valueOf(text.charAt(i)));
        }
        System.out.println("text = " + text);
        System.out.println("reverse = " + reverse);

        if (text.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println(text+" is a palindrome ");
        }
        else {
            System.out.println(text+" isn't a palindrome ");
        }




    }
}

