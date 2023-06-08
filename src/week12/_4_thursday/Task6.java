package week12._4_thursday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        // What is the function of throw?
        // To create excepton manually.

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number<18) {
            throw new InputMismatchException("Number has to be more than 18");
        }



    }



}
