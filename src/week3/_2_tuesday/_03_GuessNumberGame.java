package week3._2_tuesday;

import java.util.Scanner;

public class _03_GuessNumberGame {
    // Write a code that produces a random number between 1 and 100,
    // and asks the user to guess that number. The user must guess the number
    // in 10 attempts. If the guess of the user is higher than the random number
    // print "Too High" and then print the number of attempts left,
    // if the user's guess is lower than the random number
    // print "Too Low" and then print the number of attempts left,
    // if the guess of the user is correct print "Congrats! You win". If the user is not
    // able to guess the number in 10 attempts print "Sorry! You lost"
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        int guessNumber ;
        int attempts = 1;

        while (attempts < 11) {
            System.out.print("Try to guess rondom number : ");
            guessNumber = sc.nextInt();
            if (guessNumber == randomNumber) {
                System.out.println("Congrats !! you win at "+ attempts+"th attempts");
              break;
            } else if (guessNumber > randomNumber) {
                System.out.println("to high ");
                System.out.println("You have " + (10 - attempts) + " left");
            } else {
                System.out.println("too low ");
                System.out.println("You have " + (10 - attempts) + " left");
            }
            if (attempts == 10) {
                System.out.println("You lost sorry!!");

            }
           attempts++;

        }

    }

}



