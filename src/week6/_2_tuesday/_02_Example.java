package week6._2_tuesday;

import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {
        //Todo take a full name from the user and print just the initials
        // example
        // Full name = Ahmet Demir
        // Out-put = A.D
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String fullname=sc.nextLine();
        char firstLetterOfName=fullname.charAt(0); // A
        char firstLetterOfLastName=fullname.charAt(fullname.indexOf(" ")+1);
        System.out.println(firstLetterOfName+"."+firstLetterOfLastName);

    }
}
