package week6._3_wednesday;
     /*
Receive a text from the console and convert it to all lower case
 */
import java.util.Scanner;

public class ToLowerCase {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text please");
        String text = input.nextLine();

        text = text.toLowerCase();
        System.out.println(text);

        // sout (text.toLowerCase());







    }
}
