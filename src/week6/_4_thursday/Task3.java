package week6._4_thursday;

      /*
We enter a string (text) into our program..
The program should output the number of vowels. (vowels: a, e, i, o, u)
Input
Tesla
Output
2

 */


import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text here");

        String text = input.nextLine();
        String vowel = "aeıioöuü";

        char [] textArray = text.toCharArray();
        char [] vowelArray = vowel.toCharArray();

        int count = 0;
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < vowelArray.length; j++) {
                if (textArray[i] == vowelArray[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);























    }


}
