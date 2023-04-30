package week6._4_thursday;

  /*
We enter a string (text) into our program.
The program should output the number of vowels. (vowels: a, e, i, o, u)
Input
Tesla
Output
2

 */


import java.util.Scanner;

public class ReplaceDomainChange {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text here");

        String text = input.nextLine();
        text = text.toLowerCase();
        char [] textArray = text.toCharArray();
        int count = 0;

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i]=='a' || textArray[i]=='e' || textArray[i]=='ı' || textArray[i]=='i' ||
                    textArray[i]=='o' || textArray[i]=='ö' ||textArray[i]=='u' ||textArray[i]=='ü')
            {
                count++;

            }
        }

        System.out.println("count = " + count);





    }


}
