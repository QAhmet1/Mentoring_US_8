package week6._3_wednesday;

import java.util.Scanner;

/*
Have a text from scanner, if the text ends with "java" print "True" else "False".
*/
public class EndWith {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter e text here");

        String text = input.nextLine();

        if (text.endsWith("java")) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }



    }
}
